class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = count;
        int ptr = 0;

        while(ptr < nums.length) {
            if(nums[ptr] == 0) {
                if(count > maxCount)
                    maxCount = count;
                count = 0;
                ptr++;
            } else {
                count++;
                ptr++;
            }
        }
        if(count > maxCount)
            maxCount = count;

        return maxCount;
    }
}