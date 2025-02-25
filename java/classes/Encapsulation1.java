public class Encapsulation1 {
    public static void main(String[] args) {

        Person2 pr = new Person2();

        pr.name = "Jitin";
        pr.setAge(14);

        System.out.println(pr.getAge());
        System.out.println(pr.name);

    }
}

class Person2 {
    String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        }
    }
}