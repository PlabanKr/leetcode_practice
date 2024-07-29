class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumOfNums = 0;
        for(int i=0; i<n; i++) {
            sumOfNums += nums[i];
        }
        int sumOfNaturalNums = n*(n+1)/2;
        return sumOfNaturalNums - sumOfNums;
    }
}