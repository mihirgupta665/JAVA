//Parent-Child, Super-Sub, Base-Derived. Always use extend for inheritence. [For Ex : public class_name Advclass extends class_name]
// java does not support multiple inheritence.
//Every constructor has a deault method name super() [as the first line inside]. super() which calls the default constructor of the super class.
//Every class in java extends a "object" class.
//this() keyword is use to call constructor (default constructor) of that class.
class Calc extends Object{      // every class super class is Object class
    Calc(){
        System.out.println("in Calc default constructor");
    }
    Calc(int a){
        System.out.println("in Calc int constructor");
    }
    public int add(){
        return 7+4;
    }
    public int diff(){
        return 7-4;
    }
}
class AdvCalc extends Calc{
    //multi level inheritence . [Objects -> Calc -> AdvCalc]
    AdvCalc(){
        super(5);           // calls the int parameterized constructor of super "Calc" class
        System.out.println("in AdvCalc default");
    }
    AdvCalc(int x){
        this();             // calls the default constructor of the same class.
        System.out.println("in AdvCalc int constructor ");
    }
    public int multi(){
        return 7*4;
    }
    public int div(){
        return 7/4;
    }
}
class C1_Inheritance{
    public static void main(String args[]){
        AdvCalc obj= new AdvCalc(45);       // creating an object by passing a intger
        System.out.println(obj.diff());
        System.out.println(obj.div());
    }
}