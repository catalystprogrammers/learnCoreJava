
public class Sum {

    public static void main(String[] args) {
        int[] arr = {6, 2, 13};

        int total = 0;

        for (int e : arr) {
            total = total + e;
        }

        System.out.println(total);

        // 0 -> 6 -> 8 -> 21................
    }
}
