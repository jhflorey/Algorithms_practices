// validate if a given string is numeric

some example:
"0" -> true
"0.1" -> true
"abc" -> false

// candidate might ask:
// 1. how to account for whitespace in the string?
// when decide if a string is numeric, ignore both leading and trailing whitespace

// 2. should i ignore space in between numbers - such as "1 1"?
// no, only ignore leading and trailing whitespace, "1 1" is not numeric

// 3. if the string contain additonal charadters after a numbers, is it considered valid?
// no, if the string contain any non-numeric characters (excluding whitespace and decimal point) it is not numeric

// 4. is it valid if a plus or minus sign appear before the number?
// yes, "+1" and "-1" are both numeric

// 5. should i considered only numbers in decimal? how about numbers in other bases such as hexadecimal (0xFF)?
// only consider decimal numbers, "0xFF" is not numeric

Some examples:
"0" => true
" 0.1 " => true
"abc" => false
"1 a" => false
"2e10" => true

public class Solution {
	public boolean isNumber(String s) {
		int i = 0, n = s.length();
		while (i < n && Character.isWhitespace(s.charAt(i))) i++;
		if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) i++;
		boolean isNumeric = false;
		while (i < n && Character.isDigit(s.charAt(i))) {
			i++;
			isNumeric = true;
		}
		if (i < n && s.charAt(i) == '.') {
			i++;
			while (i < n && Character.isDigit(s.charAt(i))) {
				i++;
				isNumeric = true;
			}
		}
		while (i < n && Character.isWhitespace(s.charAt(i))) i++;
		return isNumeric && i == n;
	}
}

// input: "3"
// output: true




































