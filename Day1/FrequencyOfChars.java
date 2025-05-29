package Day1;

import java.util.HashMap;

public class FrequencyOfChars {

    /*
        Input: "automation"
        Output: {a=2, u=1, t=2, o=2, m=1, i=1, n=1}
    */

    public static void main(String[] args) {

        String str = "automation";
        HashMap<Character, Integer> map = new HashMap<>();

        for(char i:str.toCharArray()){
            if(map.containsKey(i)) {
                map.put(i,map.get(i)+1);}
                else{
                 map.put(i,1);
            }
        }

        System.out.println(map.entrySet());
    }
}
