package Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToList {

    public static void main(String[] args) {
        String []s={"a","b","d","s"};
        List<String> ls =new ArrayList<>(Arrays.asList(s));
        System.out.println(ls);

    }
}
