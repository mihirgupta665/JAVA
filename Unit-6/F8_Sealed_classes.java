//Abstract class need always to be inherited . Final class could never be inherited
//Seadled classes are classes which only allow certain specific classses to inherit the sealed class.
//For Ex: sealed class A : permits B,C { now the inherited classes of sealed class must have a keyword specifing the inherited class( non-sealed, sealed,final)
//WAP to create a final sealed and non-sealed classes in multi level hierarchy [ class a must be sealed should extend and implement and permits other classes (permits is always mentioned at last only and all the permited class must extend the sealed class)]
sealed class A extends Thread implements Runnable permits B,C{      // sealed class allow one to seal it from beieng inherited while keeping in midf exception.
    public void show(){
        System.out.println("In class A");
    }
}
non-sealed class B extends A{       //all the permitted classes if created must be extending the sealed class which permits them.
    // pemitted class must have the keywors sealed or non-sealed or final
    public void show(){         
        System.out.println("In class B");
    }
}
final class C extends A{
    public void show(){
        System.out.println("In class C");
    }
}
public class F8_Sealed_classes {
    public static void main(String Args[]){
        var a= new A();
        var c= new C();     // var creates the object of the correct type
        a.show();
        c.show();
    }
}
