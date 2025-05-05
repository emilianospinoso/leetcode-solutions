package leetcode;

public class A01ValidPalindrome {

    public static void main(String[] args) {
        //Valid palindrome using 2 pointers
        String a = "aWeewa";
        String b = "aWewaj";
        System.out.println(isPalindrome(a));
        System.out.println(isPalindrome(b));

    }

    static boolean isPalindrome(String s) {
        s = s.toLowerCase();

        for (int i = 0; i < (s.length()-1)/2; i++) {
            if (s.charAt(i) == s.charAt(s.length() - i-1)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome2(String s) {
        //isLetterOrDigit method from Character.
        StringBuilder builder = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                builder.append(Character.toLowerCase(ch));
            }
        }

        String filteredString = builder.toString();
        String reversedString = builder.reverse().toString();

        return filteredString.equals(reversedString);
    }
}
