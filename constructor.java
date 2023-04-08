class student
{
    private int age;
    private String name;

    // student()
    // {
    //     age = 18;
    //     name = "Raman";
    // }
    public student()
    {
        
        age = 18;
        name = "Raman";
    }
    
    public student(String name)
    {
        this();
      
        this.name = name;
        age = 20;
    }

    public student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void disp(){
        System.out.println(name);
        System.out.println(age);
    }
}


public class constructor {
    public static void main( String args[])
    {
        student std1 = new student();
        student std2 = new student("Amar");
        student std3 = new student("Shivam",22);

        std1.disp();
        std2.disp();
        std3.disp();

    }
}
