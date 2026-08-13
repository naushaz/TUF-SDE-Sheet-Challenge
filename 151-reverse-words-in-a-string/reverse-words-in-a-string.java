class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        
        // Step 2: Reverse the array of words
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" "); // Add space except for the last word
        }

        // Step 3: Return the result
        return sb.toString();

    }
}