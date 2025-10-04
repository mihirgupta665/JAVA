//Interface is same like public abstract and is use to create a design of program illustrating the function to be implemented later on. one class could implement multiple interfaces.
//In another class where we need to implement the abstract function that class implements(instead of extends) the interface, [ i.e class A implements Interface_class ]. if New fails to implement all the abstract function then the new class also becomes a abstract class by default.
//interface could have variables but its variable are by default final and static. variables are static as no object could be created from the interface and also here implements[instead of extends] take place which implements only methods. As interface has no memory alloted in heap as object is also created from another class which implements the interaface so as no memeory is there so variable value need to be final only.
//An interface may also extend another interface. 
// .getClass gets  the name of the class  [Output: class Class_name]
// A functional interface is a SAM i.e. Single abstact method interface. Annotation is @FunctionalInterface
// @Annotation is a metadata for compiler or runtime. Through  annotation we could communicate with complier for help in program . [Spelling of any annotation starts with capital letter like of class]
//WAP to an make a computer class through which a desktop and laptop classes are implemented not make a genral coding class pass any object and make it print coding on that named device.  [use dynamic dispatch and interface]

@FunctionalInterface
interface Computer{         // interface has in built {public abstract} function
    void show();            // this fuction as only method of the functional interface so has a {public abstract} inbuilt feacture.
}
class Laptop implements Computer{
    @Override               // annotation which denotes to complier that the developer wants to overide a fuction
    public void show(){
        System.out.println("Laptop Received");
    }
}
class Desktop implements Computer{
    @Override
    public void show(){
        System.out.println("Desktop Received");
    }
}
class Coding{
    void display(Computer device){    
        device.show();  
        System.out.println("Coding is executing in : "+ device.getClass());        //getClass gets  the name of the class  [Output: class Class_name]
    }
}
public class C7_Functional_interface_annotation {
    public static void main(String args[]){
        Computer lap= new Laptop();     // Dynamic method dispatch
        // lap.show();
        Computer desk= new Desktop();
        // desk.show();
        Coding obj= new Coding();
        obj.display(desk);       // although the object is of derived class but it is passed with a reference of parent computer class       
    }
}
