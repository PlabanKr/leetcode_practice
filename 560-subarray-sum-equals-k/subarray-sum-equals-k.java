class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        hMap.put(0, 1);
        int prefixSum = 0, count = 0;

        for(int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int remove = prefixSum - k;
            count = count + hMap.getOrDefault(remove, 0);
            hMap.put(prefixSum, hMap.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}