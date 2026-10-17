class Solution {
    public int minimumEffortPath(int[][] heights) {
        int[][] directions = new int[][]{
            {1,0},
            {-1,0},
            {0,1},
            {0,-1}
        };
        int m = heights.length;
        int n = heights[0].length;
        int[][] efforts = new int[m][n];
        for (int[] row : efforts){
            Arrays.fill(row, Integer.MAX_VALUE); 
        }
        efforts[0][0] = 0;
        PriorityQueue<int[][]> pq = new PriorityQueue<>((a,b)-> Integer.compare(a[0][0],b[0][0]));
        pq.offer(new int[][]{{0}, {0,0}});
        while(!pq.isEmpty()){
            int[][] curr = pq.poll();
            int effort = curr[0][0];
            int r = curr[1][0];
            int c = curr[1][1];
            for(int[] d:directions){
                int nr = r + d[0];
                int nc = c + d[1];
                if(nr<0 || nc<0 || nr >= m || nc >= n) continue;
                int e = Math.max(effort, Math.abs(heights[nr][nc] - heights[r][c]));
                if(e < efforts[nr][nc]){
                    pq.offer(new int[][]{{e},{nr,nc}});
                    efforts[nr][nc] = e;
                }
            }
        }
        return efforts[m-1][n-1];
    }
}