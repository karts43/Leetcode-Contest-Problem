/* 
# Remove Zeros in Decimal Representation

This project contains a solution to the LeetCode-style problem: "Remove Zeros in Decimal Representation".

## Problem Statement

Given a decimal number `n`, remove all zeros from its decimal representation and return the resulting number.

### Example

- Input: 102030
- Output: 123

- Input: 5053021
- Output: 55321

### Approach

The provided solution iterates over the digits of the input number, removes zeros, and reconstructs the result.
*/
class Solution {
    public long removeZeros(long n) {

        long temp = 0;
        
        while(n != 0)
        {
            long last = n%10;
            
            if(last != 0)
                temp = temp*10 + last;

            n /= 10;
        }

        long ans = 0;
        
        while(temp > 0)
        {
            long last = temp % 10;
            
            ans =ans*10+last;
            
            temp /= 10;
        }
        return ans;
    }
}
