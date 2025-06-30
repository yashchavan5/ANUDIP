// monday Abstraction , Interfacae 

//parial abstraction 
// 100 % Abstarction 
abstract class Animal {
    abstract void walk(); // abstract method

    void eat() {
        System.out.println("animal can eat");
    }
}

// Dog IS-A Animal
class Dog extends Animal {
    void walk() {
        System.out.println("dog walks on 4 legs");
    }
}

public class abstracts {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.walk(); 
        d.eat();  
    }
}



// Interface program 
interface Animal {
    void eat();
    void sleep();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats meat");
    }
    public void sleep() {
        System.out.println("Dog sleeps in kennel");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.sleep();
    }
}

