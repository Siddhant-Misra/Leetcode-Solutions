public class Solution {
    
    public int findPairs(int[] nums, int k) {
        int ret = 0;
        if (k < 0)              //absolute difference
            return ret; 
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);  //storing the numbers 
        }
        
        for (int key : map.keySet()) {
            if (k == 0) {
                if (map.get(key) > 1)   ret++;
            }
            else if (map.containsKey(key+k)) {
                ret++;
            }

        }
        
        return ret;
    }
}