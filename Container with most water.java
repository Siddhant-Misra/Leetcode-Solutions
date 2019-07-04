class Solution {
    public int maxArea( int[] height) {
        int max = Integer.MIN_VALUE;                    
        int i = 0; 
        int j = height.length - 1;
        while(i < j) {
            int min = Math.min(height[i], height [j]);  //finding the min b/w i and j
            max = Math.max(max, min * (j - i));         //finding the max b/w i and j, j is the right and i is the left pointer
            if(height[i] < height[j]) {
                i++;                                    //i is moving forward to find a taller i
            }
            else {
                j--;                                    //j is moving backward to find a taller j
            }
        }
        return max;                                     //this is when we find a max height 
    }
}

//brute force sol: two loops that iterate through all of them and keep updating max value/area
//optimal: two pointers left and right and calculate the area b/w the two and move the smaller of those pointer 
//when they meet we will have found our max variable
//O(n) because there is only one pass but by using two pointers