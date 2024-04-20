//Problem Link: https://rb.gy/5o2jvx

//code
class Solution
{
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int i = 0, j = 0;
        while(i < n && j < m) 
        {
            if(arr1[i] <= arr2[j]) 
            {
                if(list.isEmpty() || list.get(list.size()-1) != arr1[i])
                {
                    list.add(arr1[i]);
                }
                i ++;
            }
            else 
            {
                if(list.isEmpty() || list.get(list.size()-1) != arr2[j]) 
                {
                    list.add(arr2[j]);
                }
                
                j ++;
            }
        }
        
        while(i < n) 
        {
            if(list.isEmpty() || list.get(list.size()-1) != arr1[i])
            {
                list.add(arr1[i]);
            }
            i ++;
        }
        
        while(j < m) 
        {
            if(list.isEmpty() || list.get(list.size()-1) != arr2[j])
            {
                list.add(arr2[j]);
            }
            j ++;
        }
        
        return list;
    }
}
