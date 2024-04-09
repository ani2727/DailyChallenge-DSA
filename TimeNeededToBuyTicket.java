//Problem Link: https://rb.gy/ikbvfo

//code
class Solution 
{
    public int timeRequiredToBuy(int[] tickets, int k) 
    {
        Queue<Integer> q = new LinkedList<>();
        int ans = 0;
        for(int num : tickets) q.add(num);

        int ct = 0;
        while(true) 
        {
            if(ct == k)
            {
                int req = q.poll();
                if(req == 1) return ans+1;
                q.add(req-1);
                ct = 0;
                k = q.size()-1;
            }
            else 
            {
                ct ++;
                int num = q.poll();
                if(num > 1) q.add(num-1);
            }
            ans ++;
        }
    }
}
