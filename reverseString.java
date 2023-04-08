public class reverseString {
    public static void main(String args[]){
        String str = "pw skill";
        String res = "";

        for (int  i = str.length() -1 ; i >= 0; i--){
            res += str.charAt(i);
        }
        System.out.println(res);  //lliks wp





        String res1 = "";
        String sarr[] = str.split(" ");
        for ( int i= sarr.length -1; i>=0; i--){
            res1 += sarr[i] + " ";
        }
        System.out.println(res1);   //skill pw 



        String res2 = "";
        String arr[] = str.split(" ");
        for (String elem:arr){
            for(int i= elem.length()-1; i >= 0; i--){
                res2 += elem.charAt(i);
            }
            res2 += " ";
        }
        System.out.println(res2);    //wp lliks 
        
    }
}