class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // first sort the array
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i++) {
            // check if the next elements are not same to avoid duplicate sol
            if(i > 0 && nums[i] == nums[i-1])
                continue;

            int left = i + 1, right = nums.length - 1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    List<Integer> sol = new ArrayList<>();
                    sol.add(nums[i]);
                    sol.add(nums[left]);
                    sol.add(nums[right]);
                    result.add(sol);
                    left++;
                    // skip duplicates
                    while(nums[left] == nums[left-1] && left < right)
                        left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
            
        }
        return result;
    }
}