class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new ArrayDeque<>();
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if(grid[r][c]==2){
                    queue.offer(new int[]{r,c});
                    visited[r][c] = true;
                }
            }
        }
        int[][] directions = {
            {-1,0},
            {+1,0},
            {0,-1},
            {0,+1}
        };

        int count = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];
                for(int[]d:directions){
                    int ur = r + d[0];
                    int uc = c + d[1];
                    if(ur < 0 || uc < 0 || ur >= m || uc >= n || visited[ur][uc] || grid[ur][uc]!=1) {
                        continue;
                    }
                    queue.offer(new int[]{ur,uc});
                    visited[ur][uc] = true;
                    grid[ur][uc] = 2;
                }
            }
            count++;
        }
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 1) {
                    return -1;
                }
            }
        }
        if (count == 0) {
            return 0;
        }
        return count - 1;
    }
}