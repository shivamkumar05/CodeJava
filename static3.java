class Demo {
    static int a;
    static int b;

    int m = 10;
    int n;
    static {
        a = 10;
        b = 20;
        // System.out.println("Control in static block"+m);     //static ke ander non static
        // variable use nhi kr skte bcz of memeory will be allocated and initialization
        // of non static will be done after we create a object for non static while
        // static not needed a object to be created
        System.out.println("Control in static block");
    }
    {
        m = 100;
        n = 200;
        System.out.println("Control in non static block");
    }

    static void disp1() {
        System.out.println("Value of static var " + a);
        System.out.println("Value of static var " + b);
        // System.out.println(m);
    }

    void disp2() {
        System.out.println("Value of instance var " + m);
        System.out.println("Value of instance var " + n);
    }

}

public class static3 {
    public static void main(String args[]) {
        Demo.disp1();
        Demo d = new Demo();
        // Demo f = new Demo();
        d.disp2();
    }
}
