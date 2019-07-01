class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();  //because we deal with high string variables
        int i = a.length() - 1;
        int j = b.length() - 1; 
        int carry = 0;
        while(i >= 0 || j >= 0) {
            int sum = carry;                    //sum should start as carry as it will also be zero before addition
            if(i >= 0) {                        //if in bounds
                sum += a.charAt(i--) - '0';     //this converts the character into integer and if it is zero it shall 
                                                //also yield a zero and if it is a one it shall yield a one 
            }
            if(j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            sb.insert(0, sum % 2);              //this recalculates the carry  and because we are inserting 
                                                //using a sb.insert it shall shift the carry by one place so 
                                                //we don't need to worry about shifting places.
                                                //% -> mod: 0 % 2 = 0 and 1 % 2 = 1 and 2 % 2 = 0
            carry = sum / 2;
        }
        if(carry > 0) {
            sb.insert(0, 1);
        }
        return sb.toString();
    }
}