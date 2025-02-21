
public class FindMax {

    public static void main(String[] args) {

        int[] arr = {54, 35435, 1358, 51, 6851, 38, 413, 54, 352, 1};

        int max = arr[0];

        for (int e : arr) {
            // current e
            // saved in container (max)
            if (e > max) {
                max = e;
            }
        }

        System.out.println(max);
    }
}
