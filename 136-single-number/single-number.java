class Solution {
    public int singleNumber(int[] nums) {
        // We can use HashMap with Time Complexity of O(Nlog(N/2+1)) + O(N/2+1)
        // Optimal solution would be using XOR
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }
}