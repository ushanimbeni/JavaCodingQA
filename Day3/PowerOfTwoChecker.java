package Day3;

public class PowerOfTwoChecker {
    public static void main(String[] args) {
        int number = 18; // Try changing this to test other values
        if (isPowerOfTwo(number)) {
            System.out.println(number + " is a power of 2.");
        } else {
            System.out.println(number + " is NOT a power of 2.");
        }
    }

    public static boolean isPowerOfTwo(int n) {
//        if (n <= 0) return false;
//        return (n & (n - 1)) == 0;

        if(n==1) return  true;
        if( n==0 || n%2!=0) return false;
        return isPowerOfTwo(n/2);
    }
}
