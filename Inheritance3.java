class AaroPlane
{
    public void takeof()
    {
        System.out.println("Aaroplane is taking off");
    }
    public void fly()
    {
        System.out.println("Aaroplane is flying");
    }
}
class CargoPlane extends AaroPlane
{
    public void fly()
    {
        System.out.println("Cargoplane flies at lower height");
    }
    public void carryGoods()       //method not in parent class only in child class are called specialized method
    {
        System.out.println("Cargoplane carries goods");
    }
}
class PassengerPlane extends AaroPlane
{
    public void fly()    //overriding method are such method which are in parent class and modified in child class
    {
        System.out.println("Cargoplane flies at medium height");
    }
    public void carryPassenger()        //method not in parent class only in child class are called specialized method
    {
        System.out.println("PassengerPlane carries Passenger");

    }
}


public class Inheritance3 {
    public static void main(String args[])
    {
        CargoPlane cp = new CargoPlane();
        cp.takeof();
        cp.fly();

        PassengerPlane pp = new PassengerPlane();
        pp.takeof();
        pp.fly();
    }
}
