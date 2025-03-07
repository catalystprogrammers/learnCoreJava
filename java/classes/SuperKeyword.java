public class SuperKeyword {
    public static void main(String[] args) {
        Child3 ch = new Child3(44, 34);

        System.out.println("child num: " + ch.num);
        System.out.println("parent num: " + ch.parentNum);
        ch.show();
    }
}

class Parent3 {
    int parentNum;

    Parent3(int num1) {
        this.parentNum = num1;
        System.out.println("This is parent");
    }

    void show() {
        // 2000
        System.out.println("Reading Excel");
    }

}

class Child3 extends Parent3 {
    int num;

    Child3(int incomingNum, int parentNum) {
        super(parentNum); // running constructor of parent class.
        this.num = incomingNum;
        System.out.println("this is child");
    }

    @Override
    void show() {
        // 10
        // 2010
        // parent class show()
        // 10
        super.show();
        System.out.println("Reading excel in red color");
    }
}
