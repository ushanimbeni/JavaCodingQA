package Day3;

public class LargestNumber_2 {
    public static void main(String[] args) {
        int a[]={23,4,7,8,67,200};
        int max = a[0];

        for(int i=1;i < a.length; i++)
        {
            if(a[i] > max)
                    max = a[i];
        }
        System.out.println(max);
    }
}
