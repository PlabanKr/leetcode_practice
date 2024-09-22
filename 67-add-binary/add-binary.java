class Solution {
    public String addBinary(String a, String b) {
        int l1 = a.length() - 1;
        int l2 = b.length() - 1;
        int carry = 0;
        int base = 2;
        StringBuilder result = new StringBuilder();

        while(l1 >= 0 || l2 >= 0) {
            int d1 = 0, d2 = 0, sum;
            if(l1 >= 0) {
                d1 = a.charAt(l1--) - '0';
            }
            if(l2 >= 0) {
                d2 = b.charAt(l2--) - '0';
            }
            sum = d1 + d2 + carry;
            if(sum >= base) {
                carry = 1;
                sum = sum - base;
            } else {
                carry = 0;
            }
            result.append(sum);
        }

        if(carry == 1)
            result.append('1');

        return result.reverse().toString();
    }
}