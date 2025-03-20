import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        System.out.println("this is ");

        int[] arr = { 5, 3, 8, 57, 9, 4 };

        bubbleSort(arr);
    }

    static void bubbleSort(int[] arr) {

        int n = arr.length - 1;

        for (int i = 0; i <= n - 1; i++) {

            for (int j = i + 1; j <= n; j++) {

                if (arr[i] > arr[j]) {

                    // swap two elements in an array Start
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    // swap two elements in an array End

                }
            }

        }

        System.out.println(Arrays.toString(arr));
    }

}