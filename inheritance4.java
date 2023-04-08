class Animal {
    void eat() {
        System.out.println("Animal eats everyday");
    }

    public void age(int x) {
        System.out.println("Animal age is ");
    }
}

class Tiger extends Animal {
    public void eat() // when we are override a method then we can increase visibulaty but can't
                      // decrease(like private to public but not public to private)
    {
        System.out.println("Tiger hunts and eat");
    }
    // public int age()
    // {
            //we can't change the return type of method 
    // }
    public void age()   //Here we are not giving parameter so it's not a overrite it is basically following the concept of overloading
    {

    }

}

public class inheritance4 {
    public static void main(String args[]) {

    }
}
