package Day3;

import java.util.Arrays;

public class SortNumberArray {

    public static void main(String []args)
    {
        int a[] = {3,5,7,9,2};

               for(int i = 0; i < a.length-1; i++)
               {
                   for(int j=0;j <a.length-1-i; j++)
                   {
                       if(a[j] > a[j+1])
                       {
                          int temp = a[j];
                          a[j] = a[j+1];
                          a[j+1] = temp;

                       }
                   }
               }
       System.out.println(Arrays.toString(a));
    }
}

