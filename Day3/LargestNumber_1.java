package Day3;

public class LargestNumber_1 {

    public static void main(String[] args) {

        int a[] = {404,4,3,6,7,8,9,123};
        int max = a[0];

        for (int i=1;i < a.length; i++)
        {
           max = Math.max(max,a[i]);
        }
        System.out.println(max);
    }

}
