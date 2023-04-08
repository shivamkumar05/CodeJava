public class palindromString {
    public static void main(String args[]){
        String str = "aabaas";
        int i= 0 ;
        int j = str.length()-1;
        int ans = 0;
        while ( i <= j){
            if(str.charAt(i) != str.charAt(j)){
                ans =1;
                break;
            }
            i++;
            j--;
        }
        if(ans == 0){
            System.out.println("It is palindrom");
        }
        else{
            System.out.println("It is not palindrom");
        }

    }
}
