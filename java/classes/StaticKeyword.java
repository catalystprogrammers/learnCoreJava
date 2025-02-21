public class StaticKeyword {
    public static void main(String[] args) {

        final int radiusOfEarth = 6400;
        final String company = "Google";

        System.out.println(radiusOfEarth);

        // System.out.println("this");

        // // Human hm = new Human();
        // // System.out.println(hm.species);

        // System.out.println(Human.species);
        // Human.run();

        // System.out.println(Human.a);

    }
}

// static block runs before main method.
class Human {
    String firstName;
    String lastName;
    int age;
    int height;
    int weight;

    static int a;

    static {
        a = 23;
    }

    static String species = "Homosepians";

    void fullName() {
        System.out.println(firstName + " " + lastName);
    }

    static void run() {
        System.out.println("human is running");
    }

}