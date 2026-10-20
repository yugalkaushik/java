class Solution {
    private int[] parent;
    private int[] size;
    private int islands;
    private void union(int a, int b){
        int rootA = find(a);
        int rootB = find(b);
        if(rootA == rootB) return;
        if(size[rootA] > size[rootB]){
            parent[rootB] = rootA;
            size[rootA] += size[rootB];
        }else{
            parent[rootA] = rootB;
            size[rootB] += size[rootA];
        }
        islands--;
    }
    private int find(int x){
        if(parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        parent = new int[m*n];
        size = new int[m*n];
        for(int i=0;i<n*m;i++){
            parent[i] = i;
            size[i] = 1;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1') islands++;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] != '1') continue;
                int index = i * n + j;
                if(j+1<n && grid[i][j+1]=='1') union(index,index + 1);
                if(i+1<m && grid[i+1][j]=='1') union(index,index + n);
            }
        }
        return islands;
    }
}