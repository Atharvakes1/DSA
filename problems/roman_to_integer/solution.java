class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'I')
            {
                // Check if it's followed by V or X (e.g., IV or IX)
                if (i + 1 < s.length() && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                    sum = sum - 1;
                } else {
                    sum = sum + 1;
                }
            }
            else if(s.charAt(i) == 'V')
            {
                sum = sum + 5;
            }
            else if(s.charAt(i) == 'X')
            {
                // Check if it's followed by L or C (e.g., XL or XC)
                if (i + 1 < s.length() && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                    sum = sum - 10;
                } else {
                    sum = sum + 10;
                }
            }
            else if(s.charAt(i) == 'L')
            {
                sum = sum + 50;
            }
            else if(s.charAt(i) == 'C')
            {
                // Check if it's followed by D or M (e.g., CD or CM)
                if (i + 1 < s.length() && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                    sum = sum - 100;
                } else {
                    sum = sum + 100;
                }
            }
            else if(s.charAt(i) == 'D')
            {
                sum = sum + 500;
            }
            else if(s.charAt(i) == 'M')
            {
                sum = sum + 1000;
            }
        }
        return sum;
    }
}