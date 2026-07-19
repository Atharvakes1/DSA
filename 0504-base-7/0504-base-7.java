class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        
        StringBuilder base7 = new StringBuilder();
        int temp = Math.abs(num);
        
        while (temp > 0) {
            int remainder = temp % 7;
            base7.insert(0, remainder);
            temp /= 7;
        }
        
        if (num < 0) {
            base7.insert(0, "-");
        }
        
        return base7.toString();
    }
}