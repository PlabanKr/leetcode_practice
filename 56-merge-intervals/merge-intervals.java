class Solution {
    public int[][] merge(int[][] intervals) {
        // Sort the pairs
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        // initialize the prev array with the first pair
        int[] prev = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            // take another array to contain current pair
            int[] interval = intervals[i];
            // check if the first element of current pair is smaller or equal to
            // the last element of prev pair
            if (interval[0] <= prev[1]) {
                // if it is in the range then increase the range
                prev[1] = Math.max(prev[1], interval[1]);
            } else {
                // else if a pair is completed
                // then add it to the merged arr
                // and change the prev arr to the current completed pair
                merged.add(prev);
                prev = interval;
            }
        }

        // finally add the last pair
        merged.add(prev);

        // answer should be in vanilla java array so type cast it
        return merged.toArray(new int[merged.size()][]);         
    }
}