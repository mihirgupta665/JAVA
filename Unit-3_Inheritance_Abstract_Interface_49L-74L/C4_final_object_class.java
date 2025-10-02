//Final keyword is used to make a variable constant or a class not inheritable or it stops overriding of a method during inheritence
//Every class extends the object class by default (no need to write there)
//System.out.println(obj) this prints a hashcode of the object. Hash code is a hexadecimal code which is generated using an algorithm for hashcode such that all the data (members) of the class could be wirtten in that hexadecimal code. That code is know as hashcode. Hascode while printing is coverted to string (by toString member function) by object class by default (no need to covert explicitly there).
//we can generate are own hashcode through overriding and we could also ignore a member variable value(if not important) for checking if the objects are equal or not.
//WAP to create two object and and check there equality and hashcodes. USe final and overriding members too.
class Laptop extends Object{               //by deault it extends the object class
    String model;
    final double price = 120000.70;         // final keyword make the variable constant (same like const in c++).
    public void equals(Laptop b){
        if(this==b){
            System.out.println("Objects are equal");
        }
        else{
            System.out.println("Objects are not equal");
        }
    }
}
public class C4_final_object_class {
    public static void main(String args[]) {
        Laptop obj1= new Laptop();
        obj1.model="MSI"; 
        Laptop obj2= new Laptop();
        obj2.model="ASUS";
        System.out.println("Laptop :- "+obj1.model+" is of price : "+obj1.price);
        System.out.println("Laptop :- "+obj2.model+" is of price : "+obj2.price);
        System.out.println(obj1+"   "+obj1.toString());  // coverting hascode into string and ten printing the same.
        System.out.println(obj2);
        boolean result= (obj1==obj2);           // works same as .equals (a member function) of object class. Objects could be equal only if the data and hashcode are equal
        System.out.println(result);
        obj2.model="MSI"; //all the attricutes of this object is same now. then also te objects will be different as the memory location for them is different.
        obj1.equals(obj2);  // over riding the equals function of object class. Their hashcodes are still different.


    }
}
