class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int[][] directions = {
            {+1,0},
            {-1,0},
            {0,+1},
            {0,-1},
            {+1,+1},
            {+1,-1},
            {-1,-1},
            {-1,+1},
        };
        int m = grid.length;
        int n = grid[0].length;
        if (grid[0][0] == 1 || grid[m-1][n-1] == 1) return -1;
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[m][n];
        queue.offer(new int[]{0,0});
        visited[0][0] = true;
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];
            if (r == m-1 && c == n-1) return grid[r][c] + 1;
            for(int[]d:directions){
                int nr = r + d[0];
                int nc = c + d[1];
                if(nr>=0 && nr<m && nc>=0 && nc<n && grid[nr][nc]==0 && !visited[nr][nc]){
                    queue.offer(new int[]{nr,nc});
                    grid[nr][nc] = 1 + grid[r][c];
                    visited[nr][nc] = true;
                }
            }
        }
        return -1;
    }
}