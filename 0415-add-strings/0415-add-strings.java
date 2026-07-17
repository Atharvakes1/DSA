class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        
        // Loop from right to left until both strings are processed and no carry remains
        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
            
            // Calculate sum of current digits and carry
            int total = digit1 + digit2 + carry;
            
            carry = total / 10;          // Determine new carry
            result.append(total % 10);    // Append current digit
            
            // Move pointers to the left
            i--;
            j--;
        }
        
        // The digits were added in reverse order, so reverse the final string
        return result.reverse().toString();
    }
}