public class BubbleSort {
    public static void sort(int[] arr) {

        int n = arr.length; //n = array length
        int i, j, temp;
        boolean swapped;

        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (!swapped)
                break;
        }

        printArray(arr);
    }

    public static void printArray(int[] arr) {
        int n = arr.length;

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
