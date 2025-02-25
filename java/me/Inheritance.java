public class Inheritance {
    public static void main(String[] args) {
        Student2 st = new Student2();
        st.name = "jitin";

        // st.getName();

        System.out.println(st.getName());
    }
}

class person3 {
    String name;

    String getName() {
        return name;
    }

}

class Student2 extends person3 {

    String getName() {
        return "dsf";
    }

}