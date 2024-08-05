class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;
        int c1 = 0, c2 = 0;
        for(int i = 0; i < nums.length; i++) {
            if(c1 == 0 && nums[i] != ele2) {
                ele1 = nums[i];
                c1 = 1;
            } else if (c2 == 0 && nums[i] != ele1) {
                ele2 = nums[i];
                c2 = 1;
            } else if (ele1 == nums[i]) {
                c1++;
            } else if (ele2 == nums[i]) {
                c2++;
            } else {
                c1--;
                c2--;
            }
        }
        // manual check
        c1 = 0;
        c2 = 0;
        int minimum = nums.length/3 + 1;
        for(int i = 0; i < nums.length; i++) {
            if(ele1 == nums[i]) c1++;
            if(ele2 == nums[i]) c2++;
        }
        if(c1 >= minimum) result.add(ele1);
        if(c2 >= minimum) result.add(ele2);
        return result;
    }
}