//Problem Link: https://rb.gy/di84ra

//code
class Solution 
{

    public boolean isPalindromic(String s,int left,int right)
    {
        while(left <= right)
        {
            if(s.charAt(left) != s.charAt(right)) return false;
            left ++;
            right --;
        }
        return true;
    }

   public void solve(int index,String s,List<String> list,List<List<String>> ans)
   {
        if(index == s.length()) {
            ans.add(new ArrayList<>(list));
            return ;
        }

        for(int i = index; i < s.length(); i ++)
        {
            if(isPalindromic(s,index,i))
            {
                list.add(s.substring(index,i+1));
                solve(i+1,s,list,ans);
                list.remove(list.size()-1);
            }
        }
   }

    public List<List<String>> partition(String s) 
    {
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();

        solve(0,s,list,ans);

        return ans;
    }
}
