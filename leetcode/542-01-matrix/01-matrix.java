class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] result = new int[m][n];
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new ArrayDeque<>();
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if(mat[r][c] == 0){
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
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];
            for(int[] d:directions){
                int nr = r + d[0];
                int nc = c + d[1];
                if(nr >= 0 && nr < m && nc >= 0 && nc < n && !visited[nr][nc]){
                    result[nr][nc] = 1 + result[r][c];
                    queue.offer(new int[]{nr,nc});
                    visited[nr][nc] = true;
                }
            }
        }
        return result;
    }
}