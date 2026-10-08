class Solution {
    int n;
    int m;
    public int[][] result;
    public boolean[][] visited;
    public int[][] updateMatrix(int[][] mat) {
        n = mat.length;
        m = mat[0].length;
        result = new int[n][m];
        visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();
        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                if(mat[r][c] == 0){
                    queue.offer(new int[]{r, c});
                    visited[r][c] = true;
                }
            }
        }
        int[][] directions = {
            {-1, 0}, // up
            {1, 0},  // down
            {0, -1}, // left
            {0, 1}   // right
        };
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];
            for(int[] d:directions){
                int nr = r + d[0];
                int nc = c + d[1];
                if(nr >= 0 && nr < n && nc >= 0 && nc < m && !visited[nr][nc]){
                    result[nr][nc] = 1 + result[r][c];
                    visited[nr][nc] = true;
                    queue.offer(new int[]{nr, nc});
                }
            }
        }
        return result;
    }
}