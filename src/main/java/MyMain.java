public class MyMain {
    // This method adds up the values of all digits
    // in x, recursively
    public static int addDigits(int x) { 
        //if (x<10) return x;
        //else return x%10+addDigits(x/10);
        return (x<10) ? x : x%10+addDigits(x/10);
    }


    // This method checks if a String is a palindrome
    // (e.g. "racecar", "madam"), recursively
    public static boolean isPalindrome(String str) { 
        //if (str.length()<2) return true;
        //else return str.charAt(0)==str.charAt(str.length()-1) && isPalindrome(str.substring(1, str.length()-1));
        return (str.length()<2) ? true : str.charAt(0)==str.charAt(str.length()-1) && isPalindrome(str.substring(1, str.length()-1));
    }

    // This method returns the original string reversed;
    // this method should be written using recursion
    public static String reverse(String str) { 
        //if (str.length()<1) return str;
        //else return str.substring(str.length()-1, str.length()) + reverse(str.substring(0, str.length()-1));
        return (str.length()<1) ? str : str.substring(str.length()-1, str.length()) + reverse(str.substring(0, str.length()-1));
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
