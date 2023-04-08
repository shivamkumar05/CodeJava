class AaroPlane2 {
    public void takeoff() {
        System.out.println("Aaroplane is taking off");
    }

    public void fly() {
        System.out.println("Aaroplane is flying");
    }
}

class CargoPlane2 extends AaroPlane2 {
    public void takeoff() {
        System.out.println("CargoPlane require large size runway");
    }

    public void fly() {
        System.out.println("Cargoplane flies at lower height");
    }
}

class PassengerPlane2 extends AaroPlane2 {
    public void takeoff() {
        System.out.println("PassengerPlane require medium size runway");
    }

    public void fly() {
        System.out.println("PassengerPlane flies at medium height");
    }
}

class FighterPlane2 extends AaroPlane2 {
    public void takeoff() {
        System.out.println("FighterPlane require medium size runway");
    }

    public void fly() {
        System.out.println("FighterPlane flies at medium height");
    }
}

class Airport {
    public void poly(AaroPlane2 ref) {
        ref.takeoff();
        ref.fly();

        System.out.println(".........................................................");
    }
}

public class Polymorphism2 {
    public static void main(String args[]) {
        // AaroPlane2 cp = new CargoPlane2(); //referance same classs ka ho ya phir
        // parent class ka ho
        CargoPlane2 cp = new CargoPlane2();
        PassengerPlane2 pp = new PassengerPlane2();
        FighterPlane2 fp = new FighterPlane2();

        // cp.takeoff();
        // cp.fly();

        // pp.takeoff();
        // pp.fly();

        // fp.takeoff();
        // fp.fly();

        // Polymorphism
        Airport a = new Airport();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);
    }
}
