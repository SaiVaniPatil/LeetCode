class Solution {
    public boolean isHappy(int n) {
        if (n < 10) {
            return n == 1 || n == 7;
        }
        int newsum = 0;
        while (n != 0) {
            int digit = n % 10;
            newsum += digit*digit;
            n /= 10;
        }
        //System.out.println(newsum);
        return isHappy(newsum);
    }
}