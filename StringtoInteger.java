//Problem Link: https://rb.gy/o01agg

//code
class Solution {
    public int myAtoi(String st) {
        int ans = 0;
        String s = st.trim();
        boolean contains_sign = false;
        char sign = '+';
        boolean contains_num = false;

        for(int i = 0 ; i < s.length() ; i ++) {
            char ch = s.charAt(i);
            if(ch == '+' || ch == '-') {
                if(!contains_sign && !contains_num) {
                    contains_sign = true;
                    sign = ch;
                }
                else {
                if(contains_sign) {
                    if(sign == '-') return ans*-1;
                    }  
                return ans;
                }
            }
            else if(Character.isDigit(ch)) {
                int num = ch-'0';
                if (ans > (Integer.MAX_VALUE - num) / 10) {
                    if (sign == '+') return Integer.MAX_VALUE;
                    return Integer.MIN_VALUE;
                }
                ans = ans*10+num;
                contains_num = true;
            }
            else {
                if(contains_sign) {
                    if(sign == '-') return ans*-1;
                }
                return ans;
            }
        }
        if(contains_sign) {
            if(sign == '-') ans *= -1;
        }
        return ans;
    }
}
