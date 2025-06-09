package Day3;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        String s="Hello World";
        char[] ch=s.toCharArray();

        for(int i=0, j = ch.length-1; i < j; i++,j--)
        {
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
        }
        System.out.println(ch);
    }

}
