boolean knows(int a, int b);

public class Solution extends Relation {
    public int findCelebrity(int n) {
        int candidate = 0; 
        for(int i = 1; i < n; i++) {
            if(knows(candidate, i)) {           //to check whether if candidate knows i
                candidate = i;                  //then it can potentially be a celebrity
            }               
        }
        for(int i = 0; i < n; i++) {            //Everyone knows the candidate and candidate doesnt know any of them
            if(i != candidate && knows(candidate, i) || (i, candidate)) {
                return -1;
            }
        }

        return candidate;
    }
}

