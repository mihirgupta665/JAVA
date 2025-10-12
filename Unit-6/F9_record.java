
// record is a class for just storing the data [For Ex: record class A(int id, String name) {} ] Not: record class have parenthesis. Thus record constructor is called as the cononical constructor
// .equals for record classes compares the instances value[here calleded state descriptors] (unline normal calsses which compare hashcode of class's object)
//System.out.println(gives the toString method value i.e. the insatces varibales values) this does not have a default constructor[may be created expicitly]. but remeber here all the variables are final so cannot be changed as tey are only used to store the data
//A record class extends by default the record class so it connot be further extended. It could only have instance variable(private and final) only in parameters and not inside the class.(but static variable could be made inside a class)
/*
 WAP to create normal class and get toString and object printing(code) override the equals method to com[are two object with instance variable values.
 Then create a record class and implement the same functionality. ALso create inside a default record constructor also use object.name()[no confusion as there are no setter or getter function(constant property)] function 
 */

class Alien{        // class just to store data and comparision of its objects
    final private int id;       // as it is final variable so it need to be initialised  and can not be changed
    private final String name;  // thus we need a default constructor to initialize the values at run time

    Alien(int id, String name){ // thus we need a default constructor to initialize the values at run time
        this.id= id;
        this.name= name;
    }

    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }

    @Override   // override the toString funtion so that when object is printed hashcode is not returned the values of the object attributes are retured.
    public String toString() {  // this function will return evrything when specific object will be printed
        return "Alien [id=" + getid() + ", name=" + getname() + "]";
    }  
    public boolean equals(Object obj){
        //Checking three condtion
        if(this==obj) return true; // if both poitns to same reference
        if(obj==null && this.getClass()!= obj.getClass() ) return false;  // if object is null or both the object's classes are differnet
        Alien other= (Alien) obj;   // creating an unboxed object as Object obj do not know id and name but Alien class do know(Every class extends the Object class [Thus, Dynamic dispatch])
        return (this.id==other.id && this.name.equals(other.name));
    }
}


// the above log code is just to store thedata in ibject of a aclass and returning the values o fthe objects
// one coud use record class to do the same whicth just few lines of codes

record Student(int roll, String name) {
    public Student(){ // default constructor which could not be created directly but can call another constructor with compulsory parameters.
        this(0,"Annonymous");
    }
    public Student(int roll, String name){  //Canonical Constructor as its has same specific parametrs as of class state description
        // no need to create a canonical constructor as it is by deafult created. But to handle exception or to do specific data based command canonical constructor could be made.
        try {
            if(roll==56){
                throw new IllegalArgumentException("Roll number 56 is not allowed as of backlog");
            }
        } 
        catch (IllegalArgumentException e) {
            System.out.println(e+" So Enter a correct roll number without any backlog");
        }
        
        this.roll=roll;
        this.name=name;
    }
}

public class F9_record {
    public static void main(String args[]){
        Alien a1= new Alien(25, "Mihir");
        Alien a11= new Alien(25, "Mihir");
        Alien a2= new Alien(40, "Divyansh");
        Alien a3= new Alien(56, "Rudra");

        System.out.println(a1); // this will print the hashcode of the object
        // if one wants to get the values of the attriutes of the object then one need to override the function toString.
        System.out.println(a1.equals(a11)); //Overidden the equals function to compare only the attributes[data] of the objects
        System.out.println(a1.equals(a2));
        System.out.println();

        // now creating the objects of Record class
        Student s1= new Student(25, "Mihir");
        Student s11= new Student(25, "Mihir");
        Student s2= new Student(40, "Divyansh");
        Student s3= new Student(56, "Rudra");
        Student s4= new Student();
        System.out.println(s1);     // for record classes object printing does not prints objects hascode it prints objects attributes.
        System.out.println(s1.equals(s11));     //Without overriding the record class equals gives the comparision result of attributes of objects.
        System.out.println(s1.equals(s2));
        System.out.println(s4.roll());      // every attribute becomes a get function for that attribute
        System.out.println(s4.name()); 
    }
}
