class Human         //Supar class //Base class //Parent class
{
    int age;
    void sleep()
    {
        age = 18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}

class Student extends Human     //Child class //sub class //derived class
{

}


public class Inheritance {
    public static void main(String args[])
    {
        Student std = new Student();
        std.sleep();
    }
}
