
public class EvenOdd {

    public static void main(String[] args) {

        // 0 1 2 3 4 5 6 7 8 9 10
        // if a number is devisable by 2 then it is even. 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter a number:");
        // int num = sc.nextInt();
        // if (num % 2 == 0) {
        //     System.out.println("This is an Even number");
        // } else {
        //     System.out.println("This is an Odd number");
        // }
        // -------------------------------------------------------
        // Find all even number is an array
        int[] arr = {881, 68, 13, 51, 381, 35, 1, 51, 381, 24, 86, 96, 35, 1, 351, 35};

        for (int e : arr) {
            if (e % 2 == 0) {
                System.out.println(e);
            }
        }

    }
}
