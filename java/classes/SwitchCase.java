
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Provide a number");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("This num is not valid");
        }

        // if (num == 1) {
        //     System.out.println("Monday");
        // } else if (num == 2) {
        //     System.out.println("Tuesday");
        // } else if (num == 3) {
        //     System.out.println("Wednesday");
        // }
    }
}
