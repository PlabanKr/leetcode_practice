class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int left = 0, right = height.length - 1;
        while(left < right) {
            int curr = 0;
            if(height[left] < height[right]) {
                curr = height[left] * (right - left);
                left++;
            } else {
                curr = height[right] * (right - left);
                right--;
            }
            max = Math.max(max, curr);
        }
        return max;
    }
}