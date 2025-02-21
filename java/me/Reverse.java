import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int[] rArr = new int[5];

        for (int i = 0; i < 5; i++) {
            rArr[4 - i] = arr[i];
        }

        System.out.println(Arrays.toString(rArr));
    }
}
