class Solution {
 public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums); 
    ArrayList<List<Integer>> result = new ArrayList<>(); 
    for (int i = 0; i < nums.length; i++) {
        int j = i + 1;                                      //pointer at the beginning of the array 
        int k = nums.length - 1;                            //pointer at the end of the array 
 
        if (i > 0 && nums[i] == nums[i - 1]) {              //edge case
            continue;
        } 
        while (j < k) {                                           //if beginning is lesser than end 
            if (k < nums.length - 1 && nums[k] == nums[k + 1]) {  //this is to make the k pointer move back  
                k--;
                continue;
            }            
            //move the end of the array towards the beginning if the sum is greater than 0
            if (nums[i] + nums[j] + nums[k] > 0) {
                k--;            
            //move the start towards the end if the sum is lesser than 0
            } 
            else if (nums[i] + nums[j] + nums[k] < 0) {
                j++;
            }                         
            else {
                ArrayList<Integer> l = new ArrayList<>();
                l.add(nums[i]);
                l.add(nums[j]);
                l.add(nums[k]);
                result.add(l);
                j++;
                k--;
            }
        }
    } 
    return result;
  }
}