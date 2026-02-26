package Interface;

interface Animal{
    void run();
}

interface Birds{
    void sound();
    void fun(int a);
}

class Dog implements Animal,Birds{
    public void run(){
        System.out.println("Bhagoo");
    }
    public void sound(){
        System.out.println("Cheey Kaou");
    }

    public void fun(int a){
        System.out.println("A ki value - " + a);
    }
}


public class Main {
    public static void main(String[] args) {
        Animal s1 = new Dog();
        Birds s2 = new Dog();
        s2.sound();
        s2.fun(0);
        s1.run();
        
    }
    
}