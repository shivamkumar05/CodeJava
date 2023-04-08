class Demo1 {
    int a, b;

    public Demo1() {
        System.out.println("Parent class Constructor");
    }

    public Demo1(int x, int y) {
        System.out.println("Parameterized Parent class Constructor");
        a = x;
        b = y;
    }
}

class Demo2 extends Demo1 {
    int m, n;

    public Demo2() {
        // super(); //not have to defined, by default it called by child class
        // constructor
        // super(10, 20); // now need to defined if you want to call parameterized-
        // constructor



        this(10, 20); // this or super me se kisi ek ko hi call kr skte hai agar kisi ko nhi karte
                      // call to JVM super() ko bydefault include kr leta hai
                      //this method will call the constructor of same class
        System.out.println("Child class Constructor");
    }

    public Demo2(int x, int y) {
        // super();
        System.out.println("Parameterized child class Constructor");
        m = x;
        n = y;
    }
}

public class inheritance5 {
    public static void main(String args[]) {
        Demo2 d = new Demo2();
        Demo2 d2 = new Demo2(10, 20);

    }
}
