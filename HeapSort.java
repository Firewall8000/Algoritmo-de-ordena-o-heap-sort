public class HeapSort {
    public static void Heapify(int[] Array, int n, int i) {
        int Source = i; 
        int Left = 2 * i + 1;  
        int Right = 2 * i + 2; 

        if (Left < n && Array[Left] > Array[Source]) {
            Source = Left;
        }

        if (Right < n && Array[Right] > Array[Source]) {
            Source = Right;
        }

        if (Source != i) {
            int Temp = Array[i];
            Array[i] = Array[Source];
            Array[Source] = Temp;

            Heapify(Array, n, Source);
        }
    }

    public static void heapSort(int[] Array) {
        int n = Array.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            Heapify(Array, n, i);
        }

        for (int i = n - 1; i >= 1; i--) {
            int Temp = Array[0];
            Array[0] = Array[i];
            Array[i] = Temp;

            Heapify(Array, i, 0);
        }
    }


    public static void printArray(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] Array = {12, 11, 13, 5, 6, 7};

        System.out.println("Array Original:");
        printArray(Array);

        heapSort(Array);

        System.out.println("Array Ordenado:");
        printArray(Array);
    }
}