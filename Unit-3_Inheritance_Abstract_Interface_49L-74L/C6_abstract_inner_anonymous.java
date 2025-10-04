// Abstarct class objects could not be created which may have a abstract method. (normal classes are know as concrete class)
// An abstract method of a abstract class is a method which is initially defined and need to be implemented explicitly again later on. It is complusory to laterly implement all the abstarct method
//inner class is a class inside another class. [to make a reference to this class we use {outer_class.new inner_class} and to make a object we use object of outer class and then create the inner class i.e. { outer_object.new inner_class() } ]
//[Note : if class is static then no need to mention object class name is enough. For Ex: Outer_class.Inner_class object2 = new Object_Outer_class.Inner_class
//Anonymous inner class : Inside a main class if during object creation we overide a member function of a class then a new inner class is created with new overridden implementation of the member fuction inside the main class during object creation.
class A{
    void show(){
        System.out.println("In class A");
    }
    class B{            // inner class B inside class A
        void show(){
            System.out.println("In class B");
        }
    }
    static abstract class S{
        abstract void show_s();
    }
}
abstract class C{   //absract class which may contain a abstract function [it may also contain normal functions]
    public abstract void show2();       //abstract function which need to be compulsorily implemented later on.
}
public  class C6_abstract_inner_anonymous {
    public static void main(String args[]){
        A obj_A = new A();
        A.B obj1= obj_A.new B();        // inner class object is creted using object of super class. [B class could be called as nested class]
        obj1.show();
        A.S obj_s=  new A.S(){   // A.S object could not be made as a it is a static abstract class but here the object created is through the block so the inner class with implementationn of abstract function made the object to be created.
            public void show_s(){
                System.out.println("Anonymous Nested Static inner class's abstract fuction called Successfully");
            }
        };
        obj_s.show_s(); // as it was only re-initialized and now it is created
        C obj_C = new C(){              // this block generates a anonymous inner class which extends the C class
            public void show2(){        // anonymous inner class fullfilling the abstract function implementation.
                System.out.println("Anonymous inner class extending a abstract class.");
            }
        };  // thus successful creation of anonymous inner class which extends a abstract class.
        obj_C.show2();
    }
}
