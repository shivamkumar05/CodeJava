// final class Animal1   //final class not participate in inheritance
class Animal1
{
    final int age = 19;     //variable ko bhi final declear kr skte but phir use ham modify nhi kr skte 
    final void sleep()    //final method can participate in inheritance but child class can not modify that method
    {
        // age = 20;
        System.out.println("Animal is sleeping");
    }
}
class Tiger1 extends Animal1
{
    // void sleep(){   //final method we cannot override in child class

    // }
}


public class Final {
    public static void main(String args[])
    {
        Tiger1 t=new Tiger1();
        t.sleep();
    }
}
