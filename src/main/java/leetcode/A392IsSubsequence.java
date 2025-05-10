package leetcode;

public class A392IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        int tam = s.length();

        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(j) == t.charAt(i)) {
                j++;
            }
            if (j == tam) {
                return true;
            }

        }

        return false;
    }

}
