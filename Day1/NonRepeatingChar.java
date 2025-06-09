package Day1;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar {
    public static void main(String[] args) {

        String str = "usharani";
        HashMap<Character, Integer> map = new HashMap<>();

        for(char i:str.toCharArray()){
            if(map.containsKey(i)) {
                map.put(i,map.get(i)+1);}
            else{
                map.put(i,1);
            }
        }

        for(Map.Entry<Character,Integer> a: map.entrySet())
        {
            if(a.getValue()==1)
            {
                System.out.println(a.getKey());
            }
        }
    }
}
