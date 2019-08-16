class Solution {
    public int[] twoSum(int[] nums, int target){
        int[] result = new int[2]; //result storing two values
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i < nums.length; i++ ) { //going through all numbers
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
                result[0] = i;
                result[1] = map.get(diff); //if the number is not in the hashmap
                return result;
            }
            map.put(nums[i], i);  //if the number is not the map then we need to add it with the number that we are on with the index we are on
        } 
        return result;
    }
}

//go through the nums
//subtract the particular num from the target
//if exists in the hashmap then we have number
//else store the number if we can find it in the future