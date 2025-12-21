class Solution {
    public String reverseWords(String s) {
         String[] words = s.trim().split("\\s+");
          java.util.Collections.reverse(java.util.Arrays.asList(words)); 
          return String.join(" ", words);
           }
}