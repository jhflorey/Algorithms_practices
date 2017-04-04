// Two Sum
// given an array of integer, find 2 numbers such that they add up to a specific target number
// For example: given nums = [2,7,11,15], target = 9

public class Solution {
	public int[] twoSum(int[] nums, int target){
		for(int i =0; i < nums.length; i++){
			for(int j = i+1; j < nums.length; j++){
				if(nums[j] == target - nums[i]){
					return new int[] {i,j};
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}

// Two sum - input array is sorted
public class Solution {
	public int[] twoSum(int[] nums, int target){
		// assume input is already sorted
		int i = 0; j = nums.length - 1;
		while (i < j) {
			int sum = nums[i] + nums[j];
			if (sum < target) {
				i++;
			} else if (sum > target){
				j--;
			} else {
				return new int[] { i+1, j+1};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}

//Two Sum - Data Structure
// design and implement a twoSum class. It should support the following operations: add and find
// add(input) - add the number input to an internal data structure
// find(value) - find if there exists any pair of numbers which sum is equal to the value 
// for ex: add(1); add(3); add(5); find(4)-> true; find(7)-> false

public class Solution {
	private Map<Integer, Integer> table = new HashMap<>();

	public void add(int input){
		int count = table.containsKey(input)? table.get(input) : 0;
		table.put(input, count+1);
	}

	public boolean find(int val){
		for (Map.Entry<Integer, Integer> entry : table.entrySet()) {
			int nums = entry.getKey();
			int y = val - nums;
			if (y == nums){
				// for duplicates, ensure there are at least 2 individual numbers.
				if (entry.getValue() >= 2) return true;
			} else if (table.containsKey(y)) {
				return true;
			}
		}
		return false;
	}
}
