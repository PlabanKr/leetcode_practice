class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n = g.length; // length of children greed arr
        int m = s.length; // length of cookie arr
        int i = 0, j = 0; // i ptr for greed, j ptr for cookie
        while(i < n && j < m) { // loop until all the cookies and children are finished
            if(g[i] <= s[j]) { // if the greed of the child is smaller or equal, give him the cookie
                i++;
            }
            j++;
        }

        return i;
    }
}