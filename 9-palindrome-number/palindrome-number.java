class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int duplicate = x;
        int revNumber = 0;
        while (x != 0) {
            int lastNumber = x % 10;
            revNumber = revNumber * 10 + lastNumber;
            x /= 10;
        }

        if (revNumber ==duplicate){
            return true;
        }
        return false;
        //return revNumber == duplicate;
    }
}
