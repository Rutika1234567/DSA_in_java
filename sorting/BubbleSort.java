public class BubbleSort {

    
    public static void bubble(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
           
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
           
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 34, 5, 8, 2, 1};
        bubble(arr);

       
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
