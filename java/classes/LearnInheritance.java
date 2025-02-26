public class LearnInheritance {
    public static void main(String[] args) {
        Student1 st = new Student1();

        st.name = "Sahid";
        st.age = 23;
        st.height = 6;
        st.rollno = 123;
        st.sClass = 10;
        st.subject = "Math";
        st.weight = 65;

        // st.printStudent();
        st.jarooriKaam();

        // System.out.println("BMI" + st.getBmi());

        Teacher1 tc = new Teacher1();
        tc.jarooriKaam();
    }
}

class Human1 {
    String name;
    int age;
    int height;
    int weight;

    int getBmi() {
        return weight / height;
    }

    void jarooriKaam() {
        System.out.println("ROTI, KAPDA, MAKAAN");
    }
}

// Student "is a" Human
// Teacher is a Human

// student, teacher.
class Student1 extends Human1 {
    int sClass;
    int rollno;
    String subject;

    @Override
    void jarooriKaam() {
        System.out.println("padhai");
    }

    void printStudent() {
        System.out.println("age" + this.age);
        System.out.println("Height" + this.height);
        System.out.println("Name" + this.name);
        System.out.println("Roll No" + this.rollno);
        System.out.println("Class" + this.sClass);
        System.out.println("Subject" + this.subject);
        System.out.println("Weight" + this.weight);
    }
}

class Teacher1 extends Human1 {
    int salary;
    String subject;
    boolean isHod;
}