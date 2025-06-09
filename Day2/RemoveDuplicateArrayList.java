package Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateArrayList {

    public static void main(String[] args) {

        List<String> ls= Arrays.asList("smoke","regression","sanity","smoke","regression","smoke");
        List<String> res = new ArrayList<>(new HashSet<>(ls));
        System.out.println(res);
    }
}
