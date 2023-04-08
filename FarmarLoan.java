import java.util.Scanner;

class Farmar {
    int pa;
    float td;
    // float ri;
    float si;
    static float ri;
    static {
        ri = 8.5f; // static make it more efficient bcz of memory will allocated only once in heap
                   // and that save memory so we use static in the case when we dont have to
                   // initialize(change) value again and again
    }

    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please mention the amount required");
        pa = scan.nextInt();
        System.out.println("Please mention time duration");
        td = scan.nextFloat();
        // ri = 8.5f;
    }

    void compute() {
        si = (pa * ri * td) / 100f;
    }

    void disp() {
        System.out.println("SI is :" + si);
    }
}

public class FarmarLoan {
    public static void main(String args[]) {
        Farmar f1 = new Farmar();
        f1.input();
        f1.compute();
        f1.disp();
        Farmar f2 = new Farmar();
        f2.input();
        f2.compute();
        f2.disp();
    }
}
