class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        int pve = 0;
        int nve = 1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                res[pve] = nums[i];
                pve += 2;
            } else {
                res[nve] = nums[i];
                nve += 2;
            }
        }
        return res;
    }
}