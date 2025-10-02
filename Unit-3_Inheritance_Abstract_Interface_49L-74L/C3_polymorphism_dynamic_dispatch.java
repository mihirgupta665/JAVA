
//if B extends class A and we make a object of class B with reference of type class A then the method of class B gets more pirority as object is off class B.
/*
if [class_A obj= new class_A() then obj= new class_B() ] object of class A was created [then in memeory the stack object reference points to the heap object of A address in heap]. 
then now if same reference has been assigend a object of B then the stack obj reference now points to a new address of the new object of class B and previous address and object becomes garbage and would be deleted later on.
[Note: this happens only during inhertence and irrespective of the type of reference all the functionality of polymorphism showing object depends upon the class from which object is creted (not the type of class of reference variable)].
 */
// WAP which allows you to use B as an A for general purposes, while still maintaining the underlying object's B behavior for overridden methods.
class A{
    public void show1(){
        System.out.println("Class A executing...");
    }
    public void show(){   //common functionin both class for overriding
        System.out.println("Class show A executing...");
    }
}
class B extends A{      // reference of class A will not be able to access this function
    public void show2(){
        System.out.println("Class B executing...");
    }
    public void show(){ // function gets overriden . Therefore this will be called
        System.out.println("Class show B executing...");
    }
}
class C3_polymorphism_dynamic_dispatch{
    public static void main(String args[]){
        // B obj= new A() is not possible as class B is a type of class A but class a is not a type of class B. if such statements executes the new fuction of class B would lead to error as object of A will not be able to access it
        A obj= new B();  //Reference of type class A but object of class B so function of class B will be executed (during overriding ) else class A method could only be accessed.
        //Runtime Polymorphism: dynamic dispatch
        obj.show1();    // as here reference of the object is of class A type so class A function could only be called
        //obj.show2();    // this will lead to error as object is of reference of class A aand show2 is a member function of class B.
        obj.show();     // but during overrding class B method will be called irrespective of the tpye of reference object class

    }
}