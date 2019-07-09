boolean isBadVersion(int version);

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;                              //to go to the end of the bad version
        while(left < right) {
            int mid = left + (right - left) / 2;    //to calculate a middle point and prevent overflow if there are very large inputs
            if(!isBadVersion(mid)) {               
                left = mid + 1;                     //not a bad version then go traverse to right 
            }
            else {
                right = mid;                        // go the opposite way
            }
        }

        return left;
    }
}

//We are taking a mid point and checking if it is a bad version 
//and we are getting rid of either the left or the right of the array

//Binary search because we can represt a good version with zeros and ones 
//Time complexity is log(n)