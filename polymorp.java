// topic cover on saturday Constructor ,loose coupling , tight coupling  polymorphism, casting downcasting ,ref in polymorphism 

public class Plane {
    void fly() {
        System.out.println("The plane is flying");
    }
}

// Inherited classes
class Cargoplane extends Plane {
    @Override
    void fly() {
        System.out.println("The cargo plane flies at low altitude");
    }
}

class Passengerplane extends Plane {
    @Override
    void fly() {
        System.out.println("The passenger plane flies at medium altitude");
    }
}

class Fighterplane extends Plane {
    @Override
    void fly() {
        System.out.println("The fighter plane flies at high altitude");
    }
    void carrypas (){
        System.out.println("Fighter plane can carry 2 passengers");
    }
}

class Airport {
    static void permit(Plane ref) {
        ref.fly();  // runtime polymorphism
    }
}

// Test class
public class Demo {
    public static void main(String[] args) {
        Cargoplane cp = new Cargoplane();        // tight coupling 
        Passengerplane pp = new Passengerplane();
        Fighterplane fp = new Fighterplane();

        // Using loose coupling & polymorphism
        Airport.permit(cp); 
        Airport.permit(pp);
        Airport.permit(fp);

        // If you want to call Fighter specific method, you can downcast:
        if (fp instanceof Fighterplane) {
            ((Fighterplane) fp).carrypas();
        }
    }
}
