
public class Classes {

    public static void main(String[] args) {

        System.out.println("Following is Person 1");

        Person person = new Person(2, "brown");

        System.out.println(person.color);
        System.out.println(person.numberOfEyes);
        System.out.println(person.numberOfHands);
        System.out.println(person.numberOfLegs);
        System.out.println(person.maxAge);

        person.walk();
        person.talk();
        person.eat();
        person.run();

        System.out.println("Following is Person 2");
        Person person2 = new Person(3, "black");

        person2.numberOfEyes = 3;
        person2.numberOfLegs = 2;
        person2.maxAge = 1500;

        System.out.println(person2.color);
        System.out.println(person2.numberOfEyes);
        System.out.println(person2.numberOfHands);
        System.out.println(person2.numberOfLegs);
        System.out.println(person2.maxAge);

        person2.walk();
        person2.talk();
        person2.eat();
        person2.run();

    }
}

class Person {

    int numberOfHands;
    int numberOfLegs;
    int numberOfEyes;
    int maxAge;
    String color;

    Person(int NOH, String color) {
        this.numberOfHands = NOH;
        this.color = color;
    }

    void walk() {
        System.out.println("Person is walking");
    }

    void talk() {
        System.out.println("Person is talking");
    }

    void eat() {
        System.out.println("Person is eating");
    }

    void run() {
        System.out.println("Person is running");
    }

}
