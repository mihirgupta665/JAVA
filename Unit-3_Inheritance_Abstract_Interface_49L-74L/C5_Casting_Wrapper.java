//Casting a child(sub) class variable type to a Parent(Super) class variable type leads to higher(upper) level of variable so called upcasting.
//Casting a parent(Super) type variable to child(Sub) type leads to lower level of variable so called downcasting.
// primitive data types like int char double float are not object oriented and do not extends the object class. so wrapper class is introduced
public class C5_Casting_Wrapper {
    public static void main(String args[]){
         int num=5;
         Integer n2= num; // auto boxing: int primitive gets conveterd into wrapper class object Integer
        //  Integer n1= new Integer(num); // boxing
         int num2= n2;              // unboxing
         int num3= n2.intValue();  // auto- unboxing assigns Integer Wrapper class object value to primitive int
         String str= "12";
         int m= Integer.parseInt(str);
         System.out.println(m*2);
    }
}


