class Solution {
    public int orangesRotting(int[][] grid) {
        int[][] directions = {
            {+1,0},
            {-1,0},
            {0,+1},
            {0,-1}
        };
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[m][n];
        int count = 0;
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if(grid[r][c] == 2){
                    queue.offer(new int[]{r,c});
                    visited[r][c] = true;
                }
            }
        }
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];
                for(int[]d:directions){
                    int nr = r + d[0];
                    int nc = c + d[1];
                    if(nr>=0 && nc>=0 && nr<m && nc<n && !visited[nr][nc] && grid[nr][nc]==1){
                        queue.offer(new int[]{nr,nc});
                        visited[nr][nc] = true;
                        grid[nr][nc] = 2;
                    }
                }
            }
            count++;
        }
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if(grid[r][c]==1) return -1;
            }
        }
        if(count==0) return 0;
        return count-1;
    }
}