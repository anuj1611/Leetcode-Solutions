class Solution {
    public int countGoodSubstrings(String s) {
        char []a=s.toCharArray();//convert string to array
        int c=0;
        for(int i=0;i<a.length-2;i++){
            if(a[i]!=a[i+1]&&a[i]!=a[i+2]&&a[i+1]!=a[i+2])//checking given condition
            c++;//if condition is true inc count
        }
        return c;//return count
    }
}