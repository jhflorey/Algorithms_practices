// Given a string s, partition s such that every substring of the partition is a palindrome.

// Return all possible palindrome partitioning of s.

// For example, given s = "aab",
// Return

// [
//   ["aa","b"],
//   ["a","a","b"]
// ]
public class Solution {
	public List<List<String>> partition(String s) {
	   List<List<String>> list = new ArrayList<>();
	   backtrack(list, new ArrayList<>(), s, 0);
	   return list;
	}

	public void backtrack(List<List<String>> list, List<String> tempList, String s, int start){
	   if(start == s.length())
	      list.add(new ArrayList<>(tempList));
	   else{
	      for(int i = start; i < s.length(); i++){
	         if(isPalindrome(s, start, i)){
	            tempList.add(s.substring(start, i + 1));
	            backtrack(list, tempList, s, i + 1);
	            tempList.remove(tempList.size() - 1);
	         }
	      }
	   }
	}

	public boolean isPalindrome(String s, int low, int high){
	   while(low < high)
	      if(s.charAt(low++) != s.charAt(high--)) return false;
	   return true;
	} 
}


// valid Palindrome
// given a string, determin if it is a palindrome, consisdering only alphanumeric characters and ignoring cases
// for ex: 
// "a man, a plan, a canal: Panama " is a palindrome
// " race a car" is not a palindrome


public class Solution {
	public boolean isPalindrome(String s){
		if (s.isEmpty()) {
			return true;
		}
		int i = 0; j = s.length() -1;
		while (i<=j){
			i = s.charAt(i);
			j - s.charAt(j);
			if (!Character.isLetterOrDigit(s.charAt(i))) { i++;
			} else if (!Character.isLetterOrDigit(s.charAt(j))) { j--;
			} else {
					if (Character.toLowerCase(s.charAt(i)) != Characters.toLowerCase(s.charAt(j))){
						return false;
					}
					i++; j--;
			}
			
		}
		return true;
	}
}