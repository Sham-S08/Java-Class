package Oops;

class PolyAnimal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class PolyDog extends PolyAnimal {
    @Override
    void eat() {
        System.out.println("Dog eats bones");
    }
}

class PolyPuppy extends PolyDog {
    @Override
    void eat() {
        System.out.println("Puppy drinks milk");
    }
}

class PolyFrance extends PolyDog {
    @Override
    void eat() {
        System.out.println("France dog eats pasta");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {

        PolyAnimal a = new PolyFrance();
        a.eat();

        PolyPuppy p = new PolyPuppy();
        p.eat();
    }
}
