
Given a sorted integer array where the range of elements are [0, 99] inclusive, return its missing ranges.
For example, given [0, 1, 3, 50, 75], return [“2”, “4->49”, “51->74”, “76->99”]
// Example Questions Candidate Might Ask:
// Q: What if the given array is empty?
// A: Then you should return [“0->99”] as those ranges are missing.
// Q: What if the given array contains all elements from the ranges? A: Return an empty list, which means no range is missing.

public class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> ranges = new ArrayList<>();
        int prev = lower - 1;
        for (int i = 0; i <= nums.length; i++) {
          int curr = (i == nums.length) ? upper + 1 : nums[i];
          if (curr - prev >= 2) {
            ranges.add(getRange(prev +1, curr -1));
          }
          prev = curr;
        }
        return ranges;
    }
    private String getRange(int from, int to) {
      return (from == to) ? String.valueOf(from) : from + "->" + to;
    }
}

// input: [0,1,3,50,75]
// 0
// 99

// output: ["2","4->49","51->74","76->99"]


Or we can have differnt solution :


public class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<String>();
        int prev = lower - 1;
        for(int i = 0 ; i <= nums.length  ; i++){
            int after = i == nums.length ? upper + 1 : nums[i];
            if(prev + 2 == after){
                result.add(String.valueOf(prev + 1));
            }else if(prev + 2 < after){
                result.add(String.valueOf(prev + 1) + "->" + String.valueOf(after - 1));
            }
            prev = after;
        }
        return result;
    }
}
