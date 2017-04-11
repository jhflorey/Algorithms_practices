Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements, without allocating extra space

For instance, with k = 3, the array [1, 2, 3, 4, 5, 6, 7] is rotated to [3, 4, 5, 6, 7, 1, 2]

// METHOD 1 (Use temp array)

// Input arr[] = [1, 2, 3, 4, 5, 6, 7], k = 3, n =7
// 1) Store d elements in a temp array
//    temp[] = [1, 2]
// 2) Shift rest of the arr[]
//    arr[] = [3, 4, 5, 6, 7, 6, 7]
// 3) Store back the d elements
//    arr[] = [3, 4, 5, 6, 7, 1, 2]
// Time complexity O(n * k). All the numbers are shifted by one step(O(n))k times (O(k)).
// Auxiliary Space: O(1). No extra space is used

// this is Approach#1: Brute Force [Time Limit Exceeded]

public class Solution {
	public void rotate(int [] nums, int k) {
		int temp, previous;
		for (int i = 0; i < k; i++) {
			previous = nums[nums.length - 1];
			for (int j = 0; j < nums.length; j++) {
				temp = nums[j];
				nums[j] = previous;
				previous = temp;
			}
		}
	}
}



// METHOD 2 (Rotate one by one)

// leftRotate(arr[], d, n)
// start
//   For i = 0 to i < d
//     Left rotate all elements of arr[] by one
// end
// To rotate by one, store arr[0] in a temporary variable temp, move arr[1] to arr[0], arr[2] to arr[1] …and finally temp to arr[n-1]

// Let us take the same example arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2
// Rotate arr[] by one 2 times
// We get [2, 3, 4, 5, 6, 7, 1] after first rotation and [ 3, 4, 5, 6, 7, 1, 2] after second rotation.

public class Solution {
	public void rotate(int [] nums, int k) {
		int temp, previous;
		for (int i = 0; i < k; i++) {
			previous = nums[nums.length - 1];
			for (int j = 0; j < nums.length; j++) {
				temp = nums[j];
				nums[j] = previous;
				previous = temp;
			}
		}
	}
}


// method 3
// Using extra array [accepted]

// we use an extra array in which we place every element of the array at its correct position
// the number at index i in the original array is placed at the index (i+k).
// then we copy the new array to thw original one

// time complexity: O(n). One pass it used to put the numbers in the new array. Add another pass to copy the new array to the original one
// space complexity: O(n). another array of the same size is used

public class Solution {
	public void rotate(int[] nums, int k) {
		int[] a = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			a[(i + k) % nums.length] = nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = a[i];
		}
	}
}

Approach #3: Using cycle replacements



public class Solution {
	public void rotate(int[] nums, int k) {
		k = k % nums.length;
		int count = 0;
		for (int start = 0; count < nums.length; start++) {
			int current = start;
			int previous = nums[start];
			do {
				int next = (current + k) % nums.length;
				int temp = nums[next];
				nums[next] = prev;
				prev = temp;
				current = next;
				count++;
			} while (start != current);
		}
	}
}






























