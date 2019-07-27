class Solution {
    public int maxSubArray(int[] nums) {
    int result = nums[0];                       // set result to 0th index
    int sum = nums[0];                          // set sum to 0th index
 
    for(int i = 1; i < nums.length; i ++) {
        sum = Math.max(nums[i], sum + nums[i]);  // change sum to maximum value of position of i and sum that we get at i
        result = Math.max(result, sum);          // Compare the result with the sum and save in result
    }
 
    return result;
  }
}

// We use Dynamic Programming (simplyfying complex problems by breaking it down into smaller problems)
// We check the n'th element and ignore the sum of previous n-1 elements if the nth element is greater than the sum