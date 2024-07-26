//Problem Link: https://rb.gy/gkxvjq

//code
class Solution {
    boolean kPangram(String str, int k) {
        
        int arr[] = new int[26];
        Arrays.fill(arr,0);
        int letters = 0;
        for(int i = 0 ; i < str.length() ; i ++) {
            if(str.charAt(i) == ' ') continue;
            arr[str.charAt(i)-'a'] ++;
            letters ++;
        }
        
        if(letters < 26) return false;
        
        int absent_letters_count = 0;
        for(int i = 0 ; i < 26 ; i ++) {
            if(arr[i] == 0) absent_letters_count ++;
        }
        
        return k >= absent_letters_count;
        
        
        
    }
}
