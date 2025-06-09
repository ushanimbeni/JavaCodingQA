package Day3;

public class SecondLargest {
    public static void main(String []args)
    {
        int a[]= {200,456,23,45};
        int largest = a[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i=1;i < a.length ; i++)
        {
            if(a[i] > largest)
            {
                secondLargest = largest;
                largest=a[i];
            } else if (a[i] > secondLargest && a[i] !=largest) {
                secondLargest = a[i];
            }
        }

        System.out.println("Largest number is :"+ largest);
        if(secondLargest != Integer.MIN_VALUE)
        {
            System.out.println("Second largest numebr is :"+ secondLargest);
        }else {
            System.out.println("Second largest not found");
        }

    }
}
