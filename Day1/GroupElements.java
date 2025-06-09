package Day1;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupElements {
    /*
    Input:
    {"Login": "Smoke", "Payment": "Regression", "Logout": "Smoke"}
    Output:
    {Smoke=[Login, Logout], Regression=[Payment]}

    */
        public static void main(String[] args) {
            HashMap<String,String> input=new HashMap<>();
            input.put("Login","Smoke");
            input.put("Payment","Regression");
            input.put("Logout","Smoke");

            HashMap<String, List<String>> output=new HashMap<>();
            for (Map.Entry<String, String> entry : input.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                // Group by value
                if (!output.containsKey(value)) {
                    output.put(value, new ArrayList<>());
                }
                output.get(value).add(key);
            }

            // Print output
            System.out.println(output);
        }
}
