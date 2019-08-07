class Solution {
    public void moveZeros(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){                   // walking through array
            if(nums[i] != 0) {                                  // if the number we are at is not zero
                nums[index++] = nums[i];                        // place it at the index we are at above
            }
        }
        for(int i = index; i< nums.length; i++) {               // filling the rest of the arrays with zeros
            nums[i] = 0;
        }
    }
}

// walk through array
// keep a variable called index to keep track of where we are going to keep the variable if it not zero 
// when we have gone through array once fill rest of array with the zeros we have encountered