//Map are key and value pair
//WAP to create a map and get keys an dit corresponing values

import java.util.HashMap;
import java.util.Map;
class F3_Map{
    public static void main(String args[]){
        Map<Integer,String> roll= new HashMap<>();
        roll.put(1,"Mihir");
        roll.put(2,"Harsh");
        roll.put(3,"Rahul");
        roll.put(4,"Muskan");
        roll.put(5,"Roman");
        for(Integer key : roll.keySet()){                                   // keySet return the values of keys
            System.out.println("Key "+key+" value is "+roll.get(key));          //.get return the value at the key
        }
    }
}