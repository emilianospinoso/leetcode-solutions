package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class A392IsSubsequenceTest {

    @Test
    void isSubsequence() {
        A392IsSubsequence a392 = new A392IsSubsequence();
        String s = "abc", t = "ahbgdc";
        boolean expected= true;
        boolean result = a392.isSubsequence(s,t);
        Assertions.assertEquals(expected,result);

    }
}