package Day1;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        String [] input={"chrome","firefox","chrome","opera"};
        HashMap<String,Integer> map=new HashMap<>();
        for(String i:input){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        for(Map.Entry<String,Integer> e:map.entrySet()){
            if(e.getValue()>1){
                System.out.println("Duplicate element in array ->"+e.getKey());
            }
        }
    }
}
