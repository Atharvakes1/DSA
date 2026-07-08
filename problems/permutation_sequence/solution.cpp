#include <iostream>
#include <vector>
#include <string>

class Solution {
public:
    std::string getPermutation(int n, int k) {
        std::vector<int> numbers;
        int factorial = 1;
        
        // Calculate (n-1)! and populate the numbers list [1, 2, ..., n]
        for (int i = 1; i < n; i++) {
            factorial *= i;
            numbers.push_back(i);
        }
        numbers.push_back(n);
        
        // Convert k to 0-indexed
        k--; 
        
        std::string result = "";
        
        while (true) {
            // Find the index of the next digit
            int idx = k / factorial;
            result += std::to_string(numbers[idx]);
            
            // Remove the used number
            numbers.erase(numbers.begin() + idx);
            
            if (numbers.empty()) {
                break;
            }
            
            // Update k and calculate the factorial for the next position
            k %= factorial;
            factorial /= numbers.size();
        }
        
        return result;
    }
};
