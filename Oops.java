public class Oops {
    int a=2;
    String name= "Rahul";
    public static void main(String []args){
        Oops obj1=new Oops();
        Oops obj2=new Oops();
        obj1.name= "Shivam";

        System.out.println(obj1.name);
        System.out.println(obj1.a);

        System.out.println(obj2.name);
        System.out.println(obj2.a);
    }
}
