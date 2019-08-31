class Solution {
    public int missingNumber(int[] nums) {
        int expectedsum = nums.length*(nums.length + 1) / 2;
        int actualsum = 0;
        for(int num : nums) {
            actualsum += num;
        }
        return expectedsum - actualsum;  
    }
}


// find sum of expected length using n(n + 1) / 2 
// and subtract expectedsum and actualsum and you'll find the missing number