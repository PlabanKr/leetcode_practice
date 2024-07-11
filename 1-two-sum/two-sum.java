class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(hmap.containsKey(nums[i])) {
                int n = hmap.get(nums[i]);
                return new int[]{n, i};
            } else {
                int requi = target - nums[i];
                hmap.put(requi, i);
            }
        } 

        return new int[2];
    }
}