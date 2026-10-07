class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int max = 0;
        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                int count = 0;
                if(grid[r][c] == 1 && !visited[r][c]){
                    int area = dfs(grid,r,c,visited);
                    max = Math.max(max,area);
                }
            }
        }
        return max;
    }
    public int dfs(int[][] grid, int r, int c, boolean[][] visited){
        if(r<0 || c<0 || r >= grid.length || c >= grid[0].length) return 0;
        if (grid[r][c] == 0 || visited[r][c]) return 0;
        visited[r][c] = true;
        int count = 1;
        count += dfs(grid, r + 1, c, visited);
        count += dfs(grid, r - 1, c, visited);
        count += dfs(grid, r, c + 1, visited);
        count += dfs(grid, r, c - 1, visited);
        return count;
    }
}