class student
{
    private int age;
    private String Name;

    

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    
    public void show()
    {
        System.out.println(age + " " + Name);
    }
}


public class Encapsulation_tut {
    public static void main (String args[])
    {
        student obj1 = new student();
        student obj2 = new student();
        obj1.setAge(18);
        obj2.setName("Shivam");
        int Std1Age = obj1.getAge();
        System.out.println(Std1Age);

        String Std2Name = obj2.getName();
        System.out.println(Std2Name);
        // obj1.show();
        // obj2.show();
    }
}
