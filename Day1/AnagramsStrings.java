package Day1;

import java.util.HashMap;
import java.util.Map;

public class AnagramsStrings {

    public static void main(String[] args) {

        String s1="silent";
        String s2="listen";

        Map<Character,Integer> map1=new HashMap<>();
        Map <Character,Integer> map2=new HashMap<>();
        for(char i:s1.toCharArray()){
            if(map1.containsKey(i)){
                map1.put(i,map1.get(i)+1);
            }
            else{
                map1.put(i,1);
            }
        }

        System.out.println(map1);
    }
}
