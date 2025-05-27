class Solution {
    public String mergeAlternately(String word1, String word2) {
        int word1_length = word1.length();
        int word2_length = word2.length();
        int min = Math.min(word1_length , word2_length);
        String longerString = "";

        if (min == word1_length){
            longerString = word2;
        }

        else {
            longerString = word1;
        }
        char word1_char[] = word1.toCharArray();
        char word2_char[] = word2.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i =0; i<min; i++){
            sb.append(word1_char[i]);
            sb.append(word2_char[i]);
        }
        sb.append(longerString.substring(min));
        return sb.toString();

        }
        
    }
