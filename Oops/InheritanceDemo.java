package Oops;

class Animal {
    void eat() {
        System.out.println("Eating food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog {
    void cute() {
        System.out.println("Puppy is very cute");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.eat();

        Puppy p = new Puppy();
        p.eat();     
        p.bark();    
        p.cute();    
    }
}
