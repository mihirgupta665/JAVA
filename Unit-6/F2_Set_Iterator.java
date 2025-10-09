//Set has unique values and Treeset has sorted values only.
/*   
Itertors to iterate values of collection:  its is top lost level above collection even 
Iterator<Integer> values= num.iterator()
while(values.hasNext()){
System.out.println(values.next()) 
}
*/

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class F2_Set_Iterator {
    public static void main(String args[]){
        Set<Integer> set= new TreeSet<>();  // creating a set variable and import all the classes to be used
        set.add(5);
        set.add(34);
        set.add(578);
        set.add(86);        // 86 is a object of Integer Wrapper class
        set.add(43);
        // for(int i : set){
            //     System.out.print(i+" ");
            // }
            // System.out.println();
        System.out.print("Elements in the Set are : ");
        Iterator<Integer> iter= set.iterator();         //creating a iterator values
        while(iter.hasNext()){                          //checks wheather next iteration is valid or not
            System.out.print(iter.next()+" ");              // prints the iterator and moving the iterator to next vlaue
        }
    }
}
