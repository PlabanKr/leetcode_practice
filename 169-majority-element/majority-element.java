class Solution {
    public int majorityElement(int[] nums) {
        // storing the frequency in hashmap approach
        // Time Complexity: O(n)
        // int majorityEle = nums[0];
        // HashMap<Integer, Integer> freq = new HashMap<>();
        // for(int i = 0; i < nums.length; i++) {
        //     if(freq.containsKey(nums[i])) {
        //         freq.put(nums[i], freq.get(nums[i]) + 1);
        //     } else {
        //         freq.put(nums[i], 1);
        //     }
        // }
        // for (Map.Entry<Integer, Integer> set : freq.entrySet()) {
        //     int n = nums.length;
        //     if(set.getValue() > n/2) {
        //         if(set.getValue() > freq.get(majorityEle)) {
        //             majorityEle = set.getKey();
        //         }
        //     }
        // }
        // return majorityEle;

        // Optimal Approach: Moore's Voting Algorithm
        int element = nums[0];
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                element = nums[i];
                count++;
            } else {
                if(nums[i] == element) {
                    count++;
                } else {
                    count--;
                }
            }
        }

        return element;
    }
}