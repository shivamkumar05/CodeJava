class Clac{
    public int  add(int n1, int n2){
        int result = n1 + n2;
        return result;
    }
    public int add (int n1, int n2, int n3){
        int result = n1 + n2 +n3;
        return result;
    }
    public double add (double n1, double n2){
        double result= n1 + n2;
        return result;
    }

}

class FunctionOverloading {
    public static void main(String []args){
        Clac obj1 = new Clac();
        int res=obj1.add(5,6);
        int result= obj1.add(3,4,5);
        double res2= obj1.add(5.3,3.2);
        
        System.out.println(res);
        System.out.println(result);
        System.out.println(res2);
    }
}
