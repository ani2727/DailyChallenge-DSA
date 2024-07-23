//Problem Link: https://rb.gy/1osvpa

//Code
class Solution 
{
    public String[] sortPeople(String[] names, int[] heights) 
    {
        Map<Integer,String> mp = new TreeMap<>(Collections.reverseOrder());
        int n = names.length;
        for(int i = 0 ; i < n ; i ++) {
            mp.put(heights[i],names[i]);
        }    
        int i = 0;
        String result[] = new String[n];
        for(Map.Entry<Integer,String> entry : mp.entrySet()) {
            result[i ++] = entry.getValue();
        }

        return result;

    }
}
