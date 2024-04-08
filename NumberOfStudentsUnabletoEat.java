//Problem Link: https://rb.gy/ilbjd6

//code
class Solution 
{
    public int countStudents(int[] students, int[] sandwiches) 
    {
        int n = students.length;

        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        for(int num : students) q.add(num);
        for(int i = n-1 ; i >= 0 ; i --) st.push(sandwiches[i]);
        int eat = 0;
        while(true) 
        {
            int ct = 0;
            while(!q.isEmpty())
            {
                if(q.peek() == st.peek()) {
                    st.pop();
                    q.poll();
                    eat ++;
                    ct = 0;
                }
                else {
                    int ele = q.poll();
                    q.add(ele);
                    ct ++;
                }
                if(ct > q.size()) return n-eat;
            }
            return n-eat;
        }
    }
}
