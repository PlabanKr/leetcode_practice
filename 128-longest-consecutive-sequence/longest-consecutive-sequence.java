class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        int longest = 1;
        HashSet<Integer> hSet = new HashSet<>();
        for(int i = 0; i < n; i++) {
            hSet.add(nums[i]);
        }
        for(Integer i : hSet) {
            if(!hSet.contains(i-1)) {
                int count  = 1;
                int num = i;
                while(hSet.contains(num + 1)) {
                    num++; // go to next number
                    count++; // increase the consecutive count
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}