import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;

        // Loop as long as there are elements in the array or k has a carry remaining
        while (i >= 0 || k > 0) {
            // Add the current array digit to k if we haven't exhausted the array
            if (i >= 0) {
                k += num[i];
                i--;
            }
            
            // The current digit to place in the result is k % 10
            result.add(k % 10);
            
            // The remaining value of k carries over to the next position
            k /= 10;
        }

        // Since we added digits from right to left, reverse the list to get the correct order
        Collections.reverse(result);
        return result;
    }
}