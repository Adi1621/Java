package Inheritance;

public class main {
    public static void main(String[] args) {
        Fish tuna = new Fish();
        tuna.eats(); // class Fish inherited the property of class Animal
    }

}

// base class
class Animal {
    String color;

    void eats() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// derived or child class
class Fish extends Animal {
    int fins;

    void swima() {
        System.out.println("Swims in water");
    }
}
