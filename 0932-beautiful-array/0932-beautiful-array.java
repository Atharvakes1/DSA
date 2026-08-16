import java.util.HashMap;
import java.util.Map;

class Solution {
    private Map<Integer, int[]> memo = new HashMap<>();

    public int[] beautifulArray(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int[] ans = new int[n];

        if (n == 1) {
            ans[0] = 1;
        } else {
            int t = 0;
            for (int x : beautifulArray((n + 1) / 2)) {
                ans[t++] = 2 * x - 1;
            }
            for (int x : beautifulArray(n / 2)) {
                ans[t++] = 2 * x;
            }
        }

        memo.put(n, ans);
        return ans;
    }
}
