Given a number represented as an array of digits, plus one to the number.
Example Questions Candidate Might Ask:
Q: Could the number be negative?
A: No. Assume it is a non-negative number.
Q: How are the digits ordered in the list? For example, is the number 12 represented by [1,2] or [2,1]?
A: The digits are stored such that the most significant digit is at the head of the list.
Q: Could the number contain leading zeros, such as [0,0,1]? A: No.

Solution:

public class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1; i >= 0; i--) {
          if(digits[i] < 9) {
            digits[i]++;
            return digits;
          }
          digits[i] = 0;
        }
        int[] newNumber = new int[n+1];
        newNumber[0] = 1;
        return newNumber;
    }
}


// input: [0]
// output: [1]
