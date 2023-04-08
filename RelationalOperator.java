import java.util.Scanner;

public class RelationalOperator {
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter age");
        int age=scan.nextInt();
        System.out.println("Your age is "+ age);

        System.out.println("Enter avg");
        double avg= scan.nextDouble();
        System.out.println("Avg is "+avg);

        System.out.println("Enter name");
        String name=scan.next();
        System.out.println("Your name is "+name);
    }
}
