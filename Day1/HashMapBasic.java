package Day1;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasic {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2,"Python");
        map.put(3,"Javascript");

        //size()
        //keyset()
        //values
        //containsKey("")
        //containsvalue("")
        //entryset()
        //get(key)
        //remove(key)
        //isEmpty()
        //clear()

        System.out.println("Get value of key 1 ->" + map.get(1));
        System.out.println("Get all values from the map ->"+map.values());
        System.out.println("No. of entries ->"+map.size());
        System.out.println("True if map is empty else false: true ->"+map.isEmpty());
        System.out.println("Displays all keys ->"+map.keySet());
        System.out.println("Displays all values ->"+map.entrySet());
        System.out.println("Checks if key '1' is present in the map ->"+map.containsKey(1));
        System.out.println("Checks if value 'Python' is present in the map ->"+ map.containsValue("Python"));

        //iterate through entry set
        System.out.println("Iterate through entry set");
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println("Key: "+ entry.getKey()+" Value: "+entry.getValue());
        }

        //iterate through key set
        System.out.println("Iterate through key set");
        for(Integer k:map.keySet()) {
            System.out.println("Key: "+ k+" Value: "+map.get(k));
        }

    }

}
