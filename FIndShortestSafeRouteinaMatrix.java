//Problem Link: https://rb.gy/6fu7xz

//code

class Solution 
{
    static class Node 
    {
        int dist;
        int x;
        int y;

        Node(int dist, int x, int y) 
        {
            this.dist = dist;
            this.x = x;
            this.y = y;
        }
    }

    public static int findShortestPath(int[][] mat) 
    {
        int m = mat.length;
        int n = mat[0].length;
        int[][] directions = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        boolean[][] visited = new boolean[m][n];
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> (a.dist - b.dist));
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (mat[i][j] == 0) {
                    visited[i][j] = true;
                    for (int[] dir : directions) 
                    {
                        int nx = i + dir[0];
                        int ny = j + dir[1];
                        if (nx >= 0 && ny >= 0 && nx < m && ny < n && mat[nx][ny] == 1) 
                        {
                            mat[nx][ny]=-1;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) 
        {
            if (mat[i][0] == 1) 
            {
                pq.add(new Node(1, i, 0));
                visited[i][0] = true;
            }
        }

        while (!pq.isEmpty()) 
        {
            Node curr = pq.poll();
            if (curr.y == n - 1) 
            {
                return curr.dist;
            }
            for (int[] dir : directions) 
            {
                int nx = curr.x + dir[0];
                int ny = curr.y + dir[1];
                if (nx >= 0 && ny >= 0 && nx < m && ny < n && mat[nx][ny]==1 && !visited[nx][ny]) 
                {
                    pq.add(new Node(curr.dist + 1, nx, ny));
                    visited[nx][ny] = true;
                }
            }
        }
        return -1;
    }
}
