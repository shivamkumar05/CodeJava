public class Mstring {
    public static void main(String args[])
    {
        //for mutable string, have to use StringBuffer or StringBuilder
        // StringBuffer sb = new StringBuffer("Virat ");
        // System.out.println(sb);

        // //StringBuffer sb =""; //invalid

        // sb.append("Kholi");
        // System.out.println(sb);

        // StringBuilder rs = new StringBuilder("rohit ");
        // System.out.println(rs);
        
        // rs.append("Sharma");
        // System.out.println(rs);

        // int a = 10;
        // a = 20;
        // final int b = 10;
        // //b=20;  //not changeable due to final keyword
        // System.out.println(a);

        // final StringBuffer str = new StringBuffer("MS ");  //final impect on referance variable but can't change property of string (mutable or imutable)
        // str.append("Dhoni");
        // //System.out.println(str);
        // //str = new StringBuffer("Bumrah");  //due to final we can not change its reference  
        // System.out.println(str);




        // StringBuffer sb = new StringBuffer();
        // System.out.println(sb.capacity());  //initial capacity assign is 16, capacity means how many you can keep and lenght means how many char in the string
        // sb.append("abscdjekudfmdjwe");
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());
        // sb.append("s");
        // System.out.println(sb.capacity());   //new capacity = (current capacity + 1) * 2


        // StringBuilder bn = new StringBuilder();
        // System.out.println(bn.capacity());


        // StringBuffer str = new StringBuffer("Sachin"); //in the case when we intialize string with some charector then capacity is equal to (16 + no. of charector) here 22
        // System.out.println(str.capacity());
        // System.out.println(str);
        // str.setCharAt(1, 'A');
        // System.out.println(str);  //replace the charector at particular index
        // StringBuilder newstr =  new StringBuilder(150);  //if we not initializing string instance we pass number then it will be capacity of that string
        // System.out.println(newstr.capacity());
        // newstr.append("java");
        // newstr.trimToSize();    //that will trim the string capacity to its actual size
        // System.out.println(newstr.capacity());

        StringBuffer sb = new StringBuffer("PwJava");
        System.out.println(sb);
        System.out.println(sb.reverse());






    }
}
