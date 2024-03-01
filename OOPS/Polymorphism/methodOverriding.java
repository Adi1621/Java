package Polymorphism;

public class methodOverriding {
    public static void main(String[] args) {

        Animal xyz = new Animal();
        xyz.eats();

        Deer d = new Deer();
        d.eats();
    }

}

class Animal {
    void eats() {
        System.out.println("Eats animal food");
    }
}

class Deer extends Animal {
    void eats() {
        System.out.println("Eats grass");
    }
}
