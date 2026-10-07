class Solution {
    public int x;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
        x = image[sr][sc];
        dfs(image,sr,sc,color);
        return image;
    }
    public void dfs(int[][]image,int sr, int sc, int color){
        if(sr<0 || sc<0 || sr >= image.length || sc >= image[0].length) return;
        if(image[sr][sc] == color) return;
        image[sr][sc] = color;
        if(sr<image.length-1 && image[sr+1][sc] == x) dfs(image,sr+1,sc,color);
        if(sr>0 && image[sr-1][sc] == x) dfs(image,sr-1,sc,color);
        if(sc < image[0].length-1 && image[sr][sc+1] == x) dfs(image,sr,sc+1,color);
        if(sc > 0 && image[sr][sc-1] == x) dfs(image,sr,sc-1,color);
    }
}