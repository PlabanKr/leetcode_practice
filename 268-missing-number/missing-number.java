class Solution {
    // solution with sum approach
    // public int missingNumber(int[] nums) {
    //     int n = nums.length;
    //     int sumOfNums = 0;
    //     for(int i=0; i<n; i++) {
    //         sumOfNums += nums[i];
    //     }
    //     int sumOfNaturalNums = n*(n+1)/2;
    //     return sumOfNaturalNums - sumOfNums;
    // }

    // solution with xor approach
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor1 = 0;
        int xor2 = 0;

        for(int i=0; i<=n; i++) {
            xor1 = xor1 ^ i;
        }
        
        for(int i=0; i<n; i++) {
            xor2 = xor2 ^ nums[i];
        }

        return xor1 ^ xor2;
    }
}