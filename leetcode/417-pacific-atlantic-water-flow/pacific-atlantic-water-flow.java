class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        boolean pacific[][] = new boolean[m][n];
        boolean atlantic[][] = new boolean[m][n];
        for(int r=0;r<m;r++){
            dfs(heights,r,0,pacific);
        }
        for(int c=0;c<n;c++){
            dfs(heights,0,c,pacific);
        }
        for(int r=0;r<m;r++){
            dfs(heights,r,n-1,atlantic);
        }
        for(int c=0;c<n;c++){
            dfs(heights,m-1,c,atlantic);
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if(pacific[r][c] && atlantic[r][c]){

                    result.add(Arrays.asList(r,c));
                }
            }
        }
        return result;
    }
    public void dfs(int[][] heights, int r, int c, boolean visited[][]){
        if(r<0 || c<0 || r >= heights.length || c >= heights[0].length || visited[r][c]) return;
        visited[r][c] = true;
        if(r<heights.length-1 && heights[r][c]<=heights[r+1][c]){
            dfs(heights,r+1,c,visited);
        }
        if(r>0 && heights[r][c]<=heights[r-1][c]){
            dfs(heights,r-1,c,visited);
        }
        if(c < heights[0].length-1 && heights[r][c]<= heights[r][c+1]){
            dfs(heights,r,c+1,visited);
        }
        if(c > 0 && heights[r][c]<= heights[r][c-1]){
            dfs(heights,r,c-1,visited);
        }
    }
}