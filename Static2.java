class Demo
{
    static void disply1()
    {
        System.out.println("Static ");
    }

    void disply2()
    {
        System.out.println("Non static");
    }
}

public class Static2 {
    public static void main(String args[])
    {
        Demo.disply1();  //for static method there is no need for object to be created
        Demo d = new Demo();
        //d.disply1();
        d.disply2();
    }
}
