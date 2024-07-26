class Solution {
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int missingNum = n;

        for (int i = 0; i <n; i++) {
            if(arr[i] != i) {
                missingNum = i;
                break;
            }
        }

        return missingNum;
    }
}