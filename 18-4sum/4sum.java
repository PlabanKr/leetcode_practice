class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<nums.length-3; i++) {
            if(i>0 && nums[i] == nums[i-1])
                continue;
            for(int j=i+1; j<nums.length-2; j++) {
                if(j>i+1 && nums[j] == nums[j-1])
                    continue;
                int left = j+1, right = nums.length-1;
                while(left<right) {
                    long sum = (long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        result.add(temp);
                        left++;
                        while(left<right && nums[left] == nums[left-1]) {
                            left++;
                        }
                    } else if(sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }
}