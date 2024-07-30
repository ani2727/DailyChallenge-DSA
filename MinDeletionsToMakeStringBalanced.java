//Problem Link: https://rb.gy/vtonyb

//code
class Solution {
    public int minimumDeletions(String s) {
        
        int min_count = 0;
        int b_count = 0;
        for(int i = 0 ; i < s.length() ; i ++) {
            char ch = s.charAt(i);
            if(ch == 'b') b_count ++;
            else if(b_count > 0) {
                min_count ++;
                b_count --;
            }
        }

        return min_count;
    }
}
