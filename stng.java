public class stng {
    public static void main(String args[]) {
        // String name = "Shivam";
        // System.out.println(name);
        // name.concat("Mahto");
        // System.out.println(name);

        // StringBuffer name1 = new StringBuffer("Shivam");
        // System.out.println(name1);
        // name1.append(" Kumar");
        // System.out.println(name1);

        // Immutable String
        // String varName = "pw";
        // String varname = new String("pw");
        // char arr[] = {'p','w'};
        // String varName1 = new String (arr);

        // System.out.println(varName);
        // System.out.println(varname);
        // System.out.println(varName1);

        // String s1 = "shivam"; // without new keyword memory allocated in special
        // region in heap area called
        // SCP(String constent poll) where duplicate is not allowed so if two string
        // have same value in SCP one object create and both string refer that object
        // means both refernce having address of same object
        // String s2 = "shivam";

        // String s3 = new String("Shivam Mahto");// with new keyword duplication
        // allowed and object created in heap area
        // and one copy is also in SCP that maintain by JVM
        // String s4 = new String("Shivam Mahto");

        // System.out.println(s1==s2);
        // System.out.println(s3 == s4);

        // String s5 = new String("shivam");
        // System.out.println(s1 == s2); // compare referance means both refrence having
        // same address to object
        // System.out.println(s1.equals(s5)); // compare value of both refrences contain
        // System.out.println(s3 == s4);
        // String s6 = "SHIVAM";
        // System.out.println(s5.equalsIgnoreCase(s6)); // Ignore the upper case , lower
        // case and then check

        // String name = new String ("Shivam");
        // name.concat(" Kumar");
        // System.out.println(name); //output: Shivam bcz immutable so new object will
        // created of Kumar and no one refer to that object bcz name is refring to
        // object Shivam
        // String name = new String("Shivam");
        // name = name.concat(" Kumar");
        // System.out.println(name); // Output: Shivam Kumar bcz now name is no longer
        // refering to Shivam insted now
        // refring to Shivam Kumar Object

        // String s1 = "Pwjava "; //without new keyword so object will created in SCP
        // String s2 = s1.concat("skill"); //not a new keyword but when we use reference
        // or inbuild method in this case a new object will created in heap
        // String s3 = new String("Pwjava "); //object will created in heap and s3 will
        // refer to that object
        // s3 = s3.concat("skill"); //new object will create with the concat value and
        // now s3 will refer to this object
        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);

        String s1 = "pw";  //object will create in SCP
        String s2 = "pw" + " java";   //object will create in SCP
        String s3 = "pw" + " java" + " Blr";   //object will create in SCP
        String s4 = s1 + s2;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        //with concat only one string can be add but with + operator we can add multiple string 
        String str = "pw" + 100 + 99; // output: pw10099 but in concat not allowed str.concat(99);
        System.out.println(str);

    }
}
