class Solution {
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void reverseArr(int[] arr, int start, int end) {
        int i=start;
        int j=end;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int index = -1; // break point index where the next element is larger
        // find the breaking point by going from the last of the array
        // from the last the elements will be in increasing order
        // where this condition fails we will put the breaking point
        for(int i=nums.length-1; i>0; i--){
            if(nums[i] > nums[i-1]) {
                index = i - 1;
                break;
            }
        }
        // if there is no break point then reverse the array and return
        if(index == -1) {
            reverseArr(nums, 0, nums.length-1);
            return;
        }
        // else we have to swap the element of the breaking point with the next largest digit
        // we can find the next largest digit by traversing from the back of the array
        for(int i=nums.length-1; i>=index; i--){
            if(nums[i] > nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        // next, sort the array elements from the break point till last in an ascending order
        reverseArr(nums, index+1, nums.length-1);
    }
}