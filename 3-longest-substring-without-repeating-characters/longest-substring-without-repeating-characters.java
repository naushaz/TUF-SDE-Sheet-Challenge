class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;

        // Iterate through all possible starting points
        for (int i = 0; i < n; i++) {
            int[] hash = new int[256]; // For extended ASCII
            Arrays.fill(hash, 0);

            for (int j = i; j < n; j++) {
                if (hash[s.charAt(j)] == 1) break; // Found a repeat
                hash[s.charAt(j)] = 1;

                int len = j - i + 1;
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
}