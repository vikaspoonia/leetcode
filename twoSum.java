//Using HashMap
// Time complexity:O(n)
// Space Complexity: O(n)
//Link: https://leetcode.com/problems/two-sum/
//Using Brute Force:
//Time: O(n^2)
//Space: O(1)
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int value;
        int[] index = new int[2];
        HashMap<Integer, Integer> intMap = new HashMap<Integer, Integer>();
        
        for(int i = 0 ; i < nums.length; i++){
            value = target-nums[i];
            if(intMap.get(value)!=null){
                int nextIndex = intMap.get(value);
                index[0] = i;
                index[1] = nextIndex;
                break;
            }
            else{
                intMap.put(nums[i], i);
            }
        }
    return index;
        
    }
}
