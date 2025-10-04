//WAP a enumeration (enum) is a class which which has some named constant(objects)
//enum has values to all constant staring from 0 , 1 ,2.... so on.
enum Status{  // could not extend any other class. // it itself extends a enum class
    Running("R"), Failed("F"), Pending, Success("S");
    //enum could have its own constructor and methods
    private String code;
    Status(){}
    private Status(String str){  // parameterized constructor is private as object is created inside the enum class [ the beauty of enum]
        this.code= str;
        System.out.println("Status : "+ this.name()); // runs everytime the object is made 
    }
    public String getcode(){        // public method to explicitly get the code( instace variable ) of the object
        return this.code;
    }
}
class C8_enum_constructor_switch{
    public static void main(String[] args){

        Status s=Status.Pending;  // to access the object
        System.out.println(s.ordinal());        // prints the whole number sequence of the named constant of the enum
        System.out.println("All Status values : ");
        Status[] arr= Status.values();
        for(Status i : arr){
            System.out.print(i+", ");
        }
        System.out.println();
        if(s==Status.Running)
        System.out.println("All Good");
        else if(s==Status.Failed)
        System.out.println("Try Again");
        else if ( s==Status.Pending)
        System.out.println("Please Wait");
        else
        System.out.println("Done");
        Status s2= Status.Success;
        System.out.println("The code is : "+s2.getcode());
        switch(s2)           // as we are passing a enum type so during cases matching no need to mention the enum name just mention the constat name.
        {
            case Running -> System.out.println("All Good");  // just passing the constant name and not the enum name [ as it is already passed in switch]
            
            case Failed -> System.out.println("Try Again");
            
            case Pending -> System.out.println("Please Wait");
            
            default -> System.out.println("Done");
        }
        
    }
}