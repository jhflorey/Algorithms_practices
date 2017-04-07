
// Given an input string, reverse the string word by word.

// For example,
// Given s = "the sky is blue",
// return "blue is sky the".

// Update (2015-02-12):
// For C programmers: Try to solve it in-place in O(1) space.

// Consider:
// 1. non-space characters constitutes a word
// 2. assume the input does not contain any tabs or newline characters
// 3. reduce multiple space between two words to a single space in the reverse string


public class Solution {
	public String reverseWords(String s) {
	String[] words = s.trim().slipt(" +");
	Collections.reverse(Arrays.asList(words));
	return Srring.join(" ", words);
	}
}

