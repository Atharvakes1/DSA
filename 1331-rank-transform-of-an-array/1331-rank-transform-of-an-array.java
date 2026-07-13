import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        // 1. Clone the original array to preserve order
        int[] sortedArr = arr.clone();
        
        // 2. Sort the cloned array (Ascending order)
        Arrays.sort(sortedArr);
        
        // 3. Store the rank of each unique element in a HashMap
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        
        for (int num : sortedArr) {
            // If the map doesn't contain the number yet, assign it a rank
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank);
                rank++; // Increment rank only for unique numbers
            }
        }
        
        // 4. Transform the original array into its ranks
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rankMap.get(arr[i]);
        }
        
        return arr;
    }
}