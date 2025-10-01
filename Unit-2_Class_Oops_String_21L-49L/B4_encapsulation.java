//making a function private sp that it cannot be accessed directly and then binding that varibale with member function for the access is an example of encapsulation.
// new class_name()  [ an anonymous object] and when we give it a reference then class_name obj =  new class_name()   [it becomes a referenced object.]
// this is a keyword for accessing a instance varible of that class [not a local variable of a member function].
class Human{
    private String name;
    private int age;
    Human(){            //default constructor to initialize the member variables.
        name="Gupta";
        age=100;
    }
    public void setage(int age){
        this.age=age;
    }
    public int getage(){
        return age;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void show(){
                System.out.println("Name : "+name+" of Age = "+age);

    }
}
class B4_encapsulation
{

    public static void main( String args[]){
        Human obj;          // assigning a reference of a class type
        obj=new Human();     // creating an object and referencing it with a reference variable of same class.
        obj.setname("Mihir");
        obj.setage(20);
        System.out.println("Name : "+obj.getname()+" of Age = "+obj.getage());
        new Human().show();  //object created and used spontaneously and could not be access later on as no reference to tha object is created.

    }
}