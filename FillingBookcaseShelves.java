//Problem Link: https://rb.gy/8qe438

//code
class Solution {
    int width;
    public int solve(int i, int books[][], int remWidth,int max_height,int dp[][]) {
        if(i >= books.length) return max_height;

        if(dp[i][remWidth] != -1) return dp[i][remWidth];

        int curr_width = books[i][0];
        int curr_height = books[i][1];

        int keep = Integer.MAX_VALUE;
        int skip = Integer.MAX_VALUE;

        if(curr_width <= remWidth) {
            keep = solve(i+1,books,remWidth-curr_width,Math.max(curr_height,max_height),dp);
        }
        
        skip = max_height+solve(i+1,books,width-curr_width,curr_height,dp);

        return dp[i][remWidth] = Math.min(keep,skip);
    }
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int dp[][] = new int[books.length+1][shelfWidth+1];
        for(int arr[] : dp) Arrays.fill(arr,-1);

        width = shelfWidth;
        return solve(0,books, shelfWidth,0,dp);
    }
}
