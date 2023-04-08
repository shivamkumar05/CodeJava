class Human1 // Supar class //Base class //Parent class
{
    private String name;
    int age;

    Human1() {
        System.out.println(("Human class Constructor"));
    }

    void sleep() 
    {
        age = 18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}

class Student1 extends Human1 // Child class //sub class //derived class
{
    // public Student1()
    // {
    // super(); by default super is in the constructor first line as you know, and
    // super() call the constructor of parent class so HUman1() constructor will be
    // called
    // }
    void disp() {
        System.out.println("The age is " + age);
        // System.out.println(name); //Private variable ko access nhi kr skte
    }
}

public class Inheritance1 {
    public static void main(String args[]) {
        Student1 std = new Student1();
        std.sleep();
        std.disp();
    }
}
