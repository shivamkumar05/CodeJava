public class strmethodInbuild {
    public static void main(String args[])
    {
        String str = "Pw Skill Java";
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println(str.substring(3,8));   //beginIndex include, endIndex exclude
        System.out.println(str.indexOf("S"));  //give index of particular charector
        System.out.println(str.indexOf("a"));   //give index of first apperance of particular charector
        System.out.println(str.lastIndexOf("a"));   //give index of last apparence

        
    } 
}
