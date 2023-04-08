class AaroPlane1 {
    public void takeoff() {
        System.out.println("Aaroplane is taking off");
    }

    public void fly() {
        System.out.println("Aaroplane is flying");
    }
}

class CargoPlane1 extends AaroPlane1 {
    public void takeoff() {
        System.out.println("CargoPlane require large size runway");
    }

    public void fly() {
        System.out.println("Cargoplane flies at lower height");
    }
}

class PassengerPlane1 extends AaroPlane1 {
    public void takeoff() {
        System.out.println("PassengerPlane require medium size runway");
    }

    public void fly() {
        System.out.println("PassengerPlane flies at medium height");
    }
}

public class polymorphism {
    public static void main(String args[]) {
        CargoPlane1 cp = new CargoPlane1();
        cp.takeoff();
        cp.fly();

        PassengerPlane1 pp = new PassengerPlane1();
        pp.takeoff();
        pp.fly();

        AaroPlane1 ref;
        // pp=cp; pp cannot handle the address of cp bcz of different type(pp is
        // PassengerPlane1 and cp is CargoPlane1 type)

        ref = cp; // Parent class refrance have capacity to hold child class address

        ref.takeoff();
        ref.fly();

        System.out.println(".......................................................");
        ref = pp;
        ref.takeoff();
        ref.fly();

    }
}
