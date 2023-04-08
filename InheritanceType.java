//Single level Inheritance

// class Animal    //Bihind the sine all parent class extends Object class which gives lots of method to use(if want to check create an object of class and use . you will see all methods of Object class)
// {
//     void sleep()
//     {
//         System.out.println("Animal need some sleep");
//     }
// }

// class Tigar extends Animal          //here we specify the extends class so no Object class if we not specified then Object class will extends
// {

// }

//Multi-Level Inheritance 
class Demo1 {
    void disp() {
        System.out.println("Disp written in demo1 class");
    }
}

class Demo2 extends Demo1 {

}

class Demo3 extends Demo2 {

}

// Hirechical inheritance
class Animal {
    void sleep() {
        System.out.println("Animal need some sleep");
    }
}

class Tigar extends Animal {

}

class Monkey extends Animal {

}

class Dear extends Animal {

}

// multiple inheritance NOT allowed  also known as diamond shape problem
// class Parent1
// {
// int age = 18;
// }
// class Parent2
// {

// }
// class Child extends Parent1 extends Parent2
// {

// }

public class InheritanceType {
    public static void main(String args[]) {
        // Tigar t = new Tigar();
        // t.sleep();

        Demo3 d = new Demo3();
        d.disp();

        Dear dear1 = new Dear();
        dear1.sleep();
    }
}
