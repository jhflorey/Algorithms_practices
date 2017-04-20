Given a string, find the length of the longest substring T that contains at most 2 distinct characters.

For example, Given s = “eceba”,

T is "ece" which its length is 3.

public class Solution {
  public int lengthOfLongestSubstringTwoDistinct(String s) {
    int[] count = new int[256];
    int i = 0, numDistinct = 0, maxLen = 0;
    for (int j = 0; j < s.length(); j+=) {
      if (count[s.charAt(j)] == 0) numDistinct++;
      count[s.charAt(j)]++;
      while (numDistinct > 2) {
        count[s.charAt(i)]--;
        if (count[s.charAt(i)] == 0) numDistrict--;
        i++;
      }
      maxLen = Math.max(j-i+1, maxLen);
    }
    return maxLen;
  }


// input: "eceba"
// output: 3
