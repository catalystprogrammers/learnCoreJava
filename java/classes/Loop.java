
public class Loop {

    public static void main(String[] args) {

        // 10 9 8 7 6 5 4 3 2 1
        // 10 11 12 13 14 15 16 17 .........
        // for (int i = 10; i >= 1; i++) {
        //     System.out.println("ABCD " + i);
        // }
        // 2
        // 4
        // 6
        // 8
        // 10
        // 12
        // 14
        // 16.......
        //  1 2 3 4 5 6 7 8 9 10 (*2)
        // 2 4 6 8 ..... 20|
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(i * 29);
        // }
        // // break, continue;
        // for (int i = 1; i <= 10; i++) {
        //     if(i == 5){
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // // break, continue;
        // Example ------------------------------- 
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println("ok " + i);
        //     if (i == 5 || i == 7) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }
        // While ------------------------------------
        int num = 15;

        // number of iterations are not fixed.
        // 15, 16, 17, 18, 19, 20
        // while (num < 20) {
        //     System.out.println("this is loop" + num);
        //     num++;
        // }

        do {
            System.out.println("this is do while loop");
        } while (false);

        
    }
}
