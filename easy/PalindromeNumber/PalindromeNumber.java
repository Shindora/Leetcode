//https://leetcode.com/problems/palindrome-number
public class PalindromeNumber {
    static boolean isPalindromeNumber(int x){
        if (x<0) {
            return false;
        }
        int copy_x = x;
        int reverse_x = 0;
        while(x>0){
            int digit = x%10;
            reverse_x = reverse_x*10 + digit;
            x /= 10;
        }
        if (reverse_x==copy_x){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){
        System.out.println(isPalindromeNumber(121));
    }
}
