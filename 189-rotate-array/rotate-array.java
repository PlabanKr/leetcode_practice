class Solution {
    public void rotate(int[] nums, int k) {
        // temporary array to store elements in new position
        int[] temp = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            // ith element will go to (i+k)th position
            temp[(i+k)%nums.length] = nums[i];
        }

        // change the elements in the original array
        for(int i=0; i<nums.length; i++) {
            nums[i] = temp[i];
        }
    }
}