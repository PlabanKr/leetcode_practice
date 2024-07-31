class Solution {
    public int majorityElement(int[] nums) {
        int majorityEle = nums[0];
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(freq.containsKey(nums[i])) {
                freq.put(nums[i], freq.get(nums[i]) + 1);
            } else {
                freq.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> set : freq.entrySet()) {
            int n = nums.length;
            if(set.getValue() > n/2) {
                if(set.getValue() > freq.get(majorityEle)) {
                    majorityEle = set.getKey();
                }
            }
        }
        return majorityEle;
    }
}