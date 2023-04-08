abstract class AaroPlane3 { // class which has minimum atleast one abstract method, if all method are
                            // abstract then class achive 100% abstraction if not all method are abstract
                            // them class i simpure abstraction
    abstract public void takeoff(); // method not having body and implementation

    abstract public void fly();

    public void landing() {
        System.out.println("Aeroplane is landing");
    }
}

class CargoPlane3 extends AaroPlane3 {
    public void takeoff() {
        System.out.println("CargoPlane require large size runway");
    }

    public void fly() {
        System.out.println("Cargoplane flies at lower height");
    }

    public void alert() {
        System.out.println("Alert .....");
    }
}

class PassengerPlane3 extends AaroPlane3 {
    public void takeoff() {
        System.out.println("PassengerPlane require medium size runway");
    }

    public void fly() {
        System.out.println("PassengerPlane flies at medium height");
    }
}

public class Abstraction {
    public static void main(String args[]) {
        // AaroPlane3 ref= new AaroPlane3() ; abstract class ka object nhi bna skte bcz
        // not have body and implementation(abstract method) so it is a incomplete class
        // but
        // referance bna skte hai
        AaroPlane3 ref1 = new CargoPlane3();
        ref1.takeoff();
        ref1.fly();
        ref1.landing();
        // ref1.alert(); //parent class ke refrence se inherited method ko call kr skte
        // hai but specialized method ko call(access) nhi kr skta agar krna hai to
        // typecasting krna padega parent to child class is also known as downcasting
        ((CargoPlane3) ref1).alert();

        AaroPlane3 ref3 = new PassengerPlane3();
        ref3.takeoff();
        ref3.fly();
        ref3.landing();
    }
}

/*
 * abstract class , abstract method ho skta hai but abstract variable nhi ho
 * skta
 * abstract constructor bhi nhi ho skta kyki constructor bydefault super()
 * method include kr leta hai
 */