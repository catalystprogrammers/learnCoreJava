public class Functions {

    public static void main(String[] args) {
        Functions fs = new Functions();
        System.out.println(fs.sum());

        Human hm = new Human(6, 60, "Jitin");

        // hm.height = 6;
        // hm.weight = 50;
        // hm.name = "Leonardo da vinci";

        System.out.println(hm.height);
        System.out.println(hm.weight);
        System.out.println(hm.name);
        hm.walk();

    }

    String sum() {
        return "this";
    }
}

class Human {

    int height;
    int weight;
    String name;

    Human(int incomingHeight, int incomingWeight, String incomingName){
        this.height = incomingHeight;
        this.weight = incomingWeight;
        this.name = incomingName;
    }

    void walk(){
        System.out.println("Walking");
    }

}

// encapsulation
// abstraction
// polymorphism
// inheritance