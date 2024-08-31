class Solution {
    public String longestPalindrome(String s) {
        String result = "";
        int maxLength = 0;
        for(int i = 0; i < s.length(); i++) {
            // Odd length
            int left = i, right = i;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                int currLength = right - left + 1;
                if(currLength > maxLength) {
                    result = s.substring(left, right+1);
                    maxLength = currLength;
                }
                left--;
                right++;
            }
            // Even length
            left = i;
            right = i+1;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                int currLength = right - left + 1;
                if(currLength > maxLength) {
                    result = s.substring(left, right+1);
                    maxLength = currLength;
                }
                left--;
                right++;
            }
        }

        return result;
    }
}