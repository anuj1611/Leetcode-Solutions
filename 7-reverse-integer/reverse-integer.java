import java.util.*;

class Solution {
    public int reverse(int x) {
        int revNumber = 0;
        int lastNumber =0;
        while (x != 0) {
            lastNumber = x % 10;
           if (revNumber > 0 && revNumber > (Integer.MAX_VALUE - lastNumber) / 10 ||
    revNumber < 0 && revNumber < (Integer.MIN_VALUE / 10)) {
    return 0;
}
            revNumber = revNumber * 10 + lastNumber;
            x = x / 10;
        }
       // System.out.println(revNumber);
        return revNumber;
    }
}
