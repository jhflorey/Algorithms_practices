// Given a string, find the length of the longest substring without repeating characters.

// Examples:

// Given "abcabcbb", the answer is "abc", which the length is 3.

// Given "bbbbb", the answer is "b", with the length of 1.


// method 1:
// O(n) runtime, O(1) space - two iterations:


public class Solution {
	public int lengthOfLongestSubstring(String s) {
		boolean[] exist = new boolean[256];
		int i = 0, maxLen = 0;
		for (int j = 0; j < s.length(); j++) {
			while (exist[s.charAt(j)]) {
				exist[s.charAt(i)] = false;
				i++
			}
			exist[s.charAt(j)] = true;
			maxLen = Math.max(j - i + 1, maxLen);
		}
		return maxLen;
	}
}

// input: "abcabcbb"
// output: 3

// or we can do this method
// we could modify the above solution to use a Set instead of a simple boolean array of size 256.
// the above soluion require at most 2n steps. Infact , it would be optimized to require only n steps.
// instead using table to tell if a character exist or not, we could define a mapping of the characters to its index
// then we skip the character immediately when we found a repeated character.

// O(n) runtime, O(1) space - single iteration:

public class Solution {
	public int lengthOfLongestSubstring(String s) {
		int[] charMap = new int[256];
		Arrays.fill(charMap, -1);
		int i = 0, maxLen = 0;
		for (int j = 0; j < s.length(); j++) {
			if (charMap[s.charAt(j)] >= i) {
				i = charMap[s.charAt(j)] + 1;
			}
			charMap[s.charAt(j)] = j;
			maxLen = Math.max(j-i+1, maxLen);
		}
		return maxLen;
	}
}