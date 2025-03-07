public class Polymorphism {
    public static void main(String[] args) {

        Animal am = new Animal();
        am.makeSound();

        Animal dg = new Dog();
        dg.makeSound();

        Animal ct = new Cat();
        ct.makeSound();

    }

}

class Animal {
    String name;

    void makeSound() {
        System.out.println("Animal is making sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Cat is mewing");
    }
}
