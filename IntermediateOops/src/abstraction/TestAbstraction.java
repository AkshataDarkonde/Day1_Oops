package abstraction;

// 1. If any class has any of its method abstract then you must declare entire class abstract.

abstract class AbstractClass1{
    abstract void abstractMethod();
    void nonAbstractMethod(){
        System.out.println("This is a non-abstract Method in AbstractClass1");
    }
}
// 2. Abstract class cannot be instantiated.(Results in compilation Error)
// public class TestAbstractClass1{
//    public static void main(String[] args) {
//        AbstractClass1 instance= new AbstractClass1();
//    }
//}


//3.When we extend an abstract class, we must either override all the abstract
//methods in subclass or declare subclass as abstract.

abstract class SubClass1 extends AbstractClass1{
//    abstract  void anotherAbstractMethod();//complication error
     @Override
     void abstractMethod(){
         System.out.println("Abstract method override in Subclass1");
     }
}

//4.Abstract class cannot be Private.
// private abstract class PrivateAbstractionClass{} // complication error


//5. Abstract class cannot be final.
//final abstract class FinalAbstractClass{} // complication error

// 6. You can declare a class abstract without having any abstract method.
abstract class AbstractClass2{
    void nonAbstractMethod(){
        System.out.println("This is non-abstract method in AbstractClass2");
    }
}
public class TestAbstraction {
    public static void main(String[] args) {
        //Testing 1
//        SubClass1 subClass1=new SubClass1();
//        subClass1.abstractMethod();
//        subClass1.nonAbstractMethod();

        //Testing 2
        //AbstractClass1 instance = new AbstractClass1();

        //Testing 6
//         AbstractClass2 abstractClass2 = new AbstractClass2();
//         abstractClass2.nonAbstractMethod();
    }
}
