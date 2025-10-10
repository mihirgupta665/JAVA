
// class's instance variable are for storage poirpose and method variable are for precessing purpose.
// var arr= new int[10]; no need of square brackets in the left hand side
// var is a keyword but could be used as identifier
public class F7_LVTI {
    public static void main(String[] args) {
        var a=5;         // var creats a varible of appropriate type.
        var arr = new int[10];
        System.out.println(a);
        for(int i : arr){
            System.out.println(i);
        }
        int var=11;     // var is a keyword but could be used as identifier.
        System.out.println(var);
    }

}
