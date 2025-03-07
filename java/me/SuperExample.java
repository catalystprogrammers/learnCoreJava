class Parent {
    int num;

    Parent(int num) {
        this.num = num;
        System.out.println("Parent class constructor");
    }

    void show() {
        System.out.println("Parent class show() method");
    }

}

class Child extends Parent {
    Child(int num2) {
        super(num2); // Calls the Parent constructor
        super.show();
        System.out.println("Child class constructor");
    }

    @Override
    void show() {
        System.out.println("this is child");
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Child obj = new Child(12);
    }
}
