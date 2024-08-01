//Problem Link: https://rb.gy/8hti7y

//code
class Solution {

    public int countSeniors(String[] details) {
        
        int n = details.length;
        int ct = 0;
        for(int i = 0 ; i < n ; i ++) {
            
            String s = details[i];
            int age = s.charAt(11)-'0';
            age *= 10;
            age += s.charAt(12)-'0';

            if(age > 60) ct ++;
        }

        return ct;

    }
}
