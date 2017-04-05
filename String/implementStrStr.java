// Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

// consider these senarios:
// 1. needle is empty, return 0
// 2. haystack is empty, return -1
// 3. if both needle and haystack are empty, return 0
// 4. if needle's length > than haystack's length, return -1
// 5. needle is located at the end of haystack, 
// 	For ex: "aaaba" and "ba". catch possible off by one errors
// 6. needle occur multiple times in haystack.
// 	For ex: 'mississippi' and 'issi' , return index 2 as the first match of 'issi'
// 7. imagin of 2 very long strings of equal lengths=n, haystack = "aaa...aa" and needle = "aaa...ab"
// 	you should not do more than n character comparisons, or else your code will get time limit exceed

public class Solution {
	public int strStr(String haystack, String needle) {
		for (int i = 0; ;i++) {
			for (int j = 0; ;j++) {
				if (j == needle.length()) return i;
				if ( i + j == haystack.length()) return -1;
				if ( needle.charAt(j) != haystack.charAt(i + j)) break;
			}
		}
	}
}

// input: "" , ""
// Answer: 0