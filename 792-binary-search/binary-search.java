class Solution {
    // iterative
    // public int search(int[] nums, int target) {
    //     int low = 0, high = nums.length - 1;
    //     while(low <= high) {
    //         int mid = (low + high) / 2;

    //         if(nums[mid] == target) {
    //             return mid;
    //         } else if (target > nums[mid]) {
    //             low = mid + 1;
    //         } else {
    //             high = mid - 1;
    //         }
    //     }

    //     return -1;
    // }

    // recursive
    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    public int search(int[] nums, int target, int low, int high) {
        if(low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if(nums[mid] == target) {
            return mid;
        } else if (target > nums[mid]) {
            return search(nums, target, mid + 1, high);
        } else {
            return search(nums, target, low, mid - 1);
        }
    }
}