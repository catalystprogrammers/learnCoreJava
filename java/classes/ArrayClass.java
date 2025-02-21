

public class ArrayClass {

    public static void main(String[] args) {
        int[] numArr = {15, 4, 5, 7, 56}; //  create array with putting data.

        // System.out.println(Arrays.toString(numArr));
        // System.out.println(numArr[0]);
        // System.out.println(numArr[1]);
        // // System.out.println(numArr[2]);
        // System.out.println(numArr[3]);
        // System.out.println(numArr[4]);
        // System.out.println(numArr.length);
        int[] numArr1 = new int[7]; // Create array without data.

        numArr1[0] = 14;
        numArr1[1] = 12;
        numArr1[2] = 0;

        // System.out.println(Arrays.toString(numArr1));

        // 0, 1, 2, 3, 4, 5, 6, 7, 8 ,9 ,10, 11, 12, 13, 14
        // for (int i = 0; i < numArr1.length; i++) {
        //     System.out.println(numArr1[i] * 2);
        // }

        // for each
        for(int e: numArr1){
            System.out.println(e * e);
        }

    }
}
