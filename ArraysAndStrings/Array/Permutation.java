// Check Permutation : given two strings, write a method to decide if one is a permutation of the other
// we shouold understand if the permutation comparision is case sensitive
// is God is a permutation of dog?
// additionally, we should ask if whitepage is significant 
// so "god      " is different from "dog"
// if 2 strings are permutations, then we know they have the same characters, but in different order. Therefore , sorting the strings
// will put the characters from 2 permutations inthe same order. WE JUST NEED TO COMPARE THE SORTED VERSION OF THE STRINGS
String sort(String s) {
	char[] content = s.toCharArray();
	java.util.Arrays.sort(content);
	return new String(content);
}

boolean permutation(String s, String t) {
	if (s.length() != t.length()) {
		return false;
	}
	return sort(s).equals(sort(t));
}



// check if two strings have identical charcter counts

String sort(String s) {
	char[] content = s.toCharArray();
	java.util.Arrays.sort(content);
	return new String(content);
}

boolean permutation(String s, String t) {
	if (s.length() != t.length()) {
		return false;
	int[] letters = new int[128]; // assume ASCII
	for (int i = 0; i < s.length(); i++) {
		letters[s.charAt(i)]++;
	}

	for (int i = 0; i < t.length(); i++) {
		letters[t.charAt(i)--;
		if (letters[t.charAt(i)] < 0){
			return false;
		}
	}
	return true;
}









