//Problem Link: https://rb.gy/43mumq

//code
class Solution 
{
    public int largestRectangleArea(int[] heights) 
    {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;

        int ans = 0;

        for(int i = 0 ; i <= n ; i ++) {
            while(!st.isEmpty() && (i==n || heights[st.peek()] >= heights[i])) {
                int height = heights[st.peek()];

                st.pop();
                int width = 0;
                if(st.isEmpty()) width = i;
                else width = i-st.peek()-1;

                ans = Math.max(ans,width*height);
            }
            st.push(i);
        }

        return ans;
    }

    public int maximalRectangle(char[][] matrix) 
    {
        int ans = 0;

        int m = matrix[0].length;
        int n = matrix.length;
        int heights[] = new int[m];

        for(int i = 0 ; i < n ; i ++) {
            for(int j = 0 ; j < m ; j ++) {
                if(matrix[i][j] == '1') heights[j] ++;
                else heights[j] = 0;
            }
            int area = largestRectangleArea(heights);
            ans = Math.max(ans,area);
        }
        return ans;
    }
}
