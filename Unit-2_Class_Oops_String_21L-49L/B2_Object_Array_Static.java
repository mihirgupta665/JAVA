//Math.random -> this gives a double value between 0 to 1 [in points].
// enhanced for loop {  for(int n[] : array) } this takes one dimentional array of the two dimensional array.
//jagged array in two dimentional array if one wants to specify the number of internal array elements[columns] and the number of elements are different then that time of multi dimentional array is called as jagged array
//array is an object as it is created using the keyword "new".  Thats whyinside the heap memory it occupies the space.
// When array of object is created then each element of the array[not a object itself] is a refernence to the object of the class.
//static variable is a class variable not an object varable and is common(shared) for all the object [Class_name.static_variable_name For Ex: Mobile.name] {if any objects changes the static variable then same will be reflected in all the other objects.}
//unlikely from c++, here non static function could access static variables.
//static method could be called by the class itselft no need to creat an object t call the function.
//Note inside a static methodwe can not access an instace(non-static) variable] directly. But indirectly by passing an object as an argument in the static funtion we can access the instaces(non-static variable of that object).
//For Main fuction static is compulsory as if not written then we need to make the object and which form the deadlock.
/*
    Class.forName("Student"); 
    //this load the class only and while loading we know that static block is executed.
*/
//WAP to created an array of objects[students] and use enhanced for loop (also called for each) [for ex :  Student stud : Students] also use a static variable and static funtion.
//Note: static funtion could not access non static variable but not static function could access static 

class Student{
    static String Class;
    static{              // static block like a constructor and it does not depend on the number of objects created. this static block will be exectuten only one time at the time of first object creation[runs befire first constructor too as it runs at the time of class load(also occus 1 time only) then object initializtion ocurs.].
        Class="9"; 
    }
    public static void stat(){
        System.out.println("Static variable: Class - "+Class);
        // non- static variable can not be accessed.
    }
    String name;
    int roll_no;
    double marks;
    public void show(){
        System.out.println("Name : "+name);
        System.out.println("Class : "+Class);           // static variable accessed in non static function. [different from c++]
        System.out.println("Roll No : "+roll_no);
        System.out.println("Marks Obtained : "+marks);
    }
}
class B2_Object_array_Static{
    public static void main(String args[]){
        /*
        Class.forName("Student"); 
        //this load the class only and while loading we know that static block is executed.
        */
        Student.Class="10";
        Student.stat();
        Student obj[] = new Student[3];
        obj[0]=new Student();
        obj[1]=new Student();
        obj[2]=new Student();
        obj[0].name= "Mihir";
        obj[0].roll_no= 56;
        obj[0].marks= 99.99;
        obj[1].name= "Rahul";
        obj[1].roll_no= 40;
        obj[1].marks= 60.67;
        obj[2].name= "Harsh";
        obj[2].roll_no= 15;
        obj[2].marks= 80.33;
        for(Student i : obj){
            i.show();
        }
    }
}
