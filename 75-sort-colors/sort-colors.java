class Solution {
    public void sortColors(int[] nums) {
        // Bubble Sort Approach has time complexity of O(n^2)
        // for(int i = 0; i < nums.length; i++) {
        //     for(int j = i + 1; j < nums.length; j++) {
        //         if(nums[i] > nums[j]) {
        //             int temp = nums[i];
        //             nums[i] = nums[j];
        //             nums[j] = temp;
        //         }
        //     }
        // }
    
        // Optimal Approach is Dutch National Flag Algorithm
        int low = 0, mid = 0, high = nums.length - 1;
        while(mid <= high) {
            // send 0s to low and increase low & mid
            // so that 0th index to (low-1)th index always contain 0
            if(nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }
            // for 1s increase the mid index
            // so that (low)th index to (mid-1)th index always contain 1
            else if(nums[mid] == 1) {
                mid++;
            }
            // send 2s to the high index and decrease high index
            // so that (high+1)th index to (n-1)th index always contain 2
            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}