class Clac{
    public int add(int nums[]){
        int result=0;
        for (int n:nums){
            result= result + n;
        }
        return result;
    }
}


public class Array {
    public static void main(String []args){
        //int nums1[]= new int [4]; //creating  array of size 4. Created in heap with default value 0.
        int nums[]={1,2,3,4,5};

        // for(int i=0; i<=4; i++){
        //     System.out.println(nums[i]);
        // }


        //Enhanced for loop/For - each loop

        for (int n:nums){
            System.out.println(n);
        }
         array2D();
         jaggedArray();


         //Anonymous Array ; Used when you sure about only once you need array
        Clac obj= new Clac();
         int res= obj.add(new int[]{1,2,3,4,5});
         System.out.println(res);
    }
    public static void array2D(){
        // int nums[][] = new int[3][2];
        // nums[0][0] = 4;
        // nums[0][1] = 3;
        // nums[1][0] = 6;
        // nums[1][1] = 5;
        // nums[2][0] = 8;
        // nums[2][1] = 9;

        int nums[][]= {{1,2},{3,4},{5,6}};

        // for (int i=0; i<3; i++){
        //     for (int j=0; j<2; j++){
        //         System.out.print(nums[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        for (int a[]:nums){
            for(int b:a){
                System.out.print(b+ " ");
            }
            System.out.println();
        }
    }

    public static void jaggedArray(){
        //Mathod - 1
        //int nums[][]= new int[3][];
        // nums[0]= new int[4];
        // nums[1]= new int[2];
        // nums[2]= new int[3];
        
        // nums[0][0]=1;
        // nums[0][1]=2;
        // nums[0][2]=3;
        // nums[0][3]=4;
        // nums[1][0]=5;
        // nums[1][1]=6;
        // nums[2][0]=7;
        // nums[2][1]=8;
        // nums[2][2]=9;

        //Mathod - 2
        int nums[][]={{1,2,3,4},{5,6},{7,8,9}};



        // for (int i=0; i<3; i++){
        //     for (int j=0; j<nums[i].length; j++){
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        for (int a[]:nums){
            for(int b:a){
                System.out.print(b+ " ");
            }
            System.out.println();
        }

    }
}
