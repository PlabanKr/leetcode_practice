class Solution {
    // public boolean containsDuplicate(int[] nums) {
    //     Arrays.sort(nums);

    //     for(int i=0; i<nums.length-1; i++) {
    //         if(nums[i] == nums[i+1]) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // HASHMAP
    // public boolean containsDuplicate(int[] nums) {
    //     // store frequency of a number
    //     HashMap<Integer, Integer> hm = new HashMap<>();

    //     for(int i = 0; i < nums.length; i++) {
    //         if(!hm.containsKey(nums[i])) {
    //             hm.put(nums[i], 1);
    //         } else {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // HashSet
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hSet = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            if(hSet.contains(nums[i]))
                return true;
            hSet.add(nums[i]);
        }
        return false;
    }
}