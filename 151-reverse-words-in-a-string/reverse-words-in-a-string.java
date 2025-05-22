class Solution {
    public String reverseWords(String s) {
        String[] str = s.split("\\s+");
        StringBuilder res = new StringBuilder();

        for(int i=str.length-1; i>=0; i--){
            res.append(str[i]);
            res.append(" ");
        }
        return res.toString().trim();
        
    }
}

