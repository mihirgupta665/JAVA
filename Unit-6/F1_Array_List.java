//Collection api is of 4 types: 1. List(ArrayList, LinkedList), 2. Queues(Deque), 3. Set(HashSet, TreeSet), 4. Map ( All these are interfaces only )
//Collection api all the values are objects {Integer, Float , etc type}
// For Ex:      Collection<Integer> nums= new ArrayList<Integer>(); 
//List has methods like get, set , indexOf      
//Everytime one uses a collection then Classes or interface must be imported thier in use classes too.
//WAP to make a array list and print index of a element and element at any index also print all the elemnts after adding the elements
import java.util.ArrayList;     // importing all the collection used array
import java.util.List;
public class F1_Array_List {
    public static void  main(String args[]){
        List<Integer> arr= new ArrayList<Integer>();       // creation of object of collection class
        arr.add(4);         // here for is not a value its a wrapper interger class'object
        arr.add(8);                                      // add the elements
        arr.add(23);
        arr.add(54);
        for(int i : arr){
            System.out.println(i);                         
        }
        System.out.println(arr.get(2));                 // prints the value at index 2
        System.out.println(arr.indexOf(23));                // prints the index of the element
    }
}
