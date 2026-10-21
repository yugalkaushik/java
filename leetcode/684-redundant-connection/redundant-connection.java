class Solution {
    private int[] parent;
    private int[] size;
    private int find(int x){
        if(parent[x]==x) return x;
        return parent[x] = find(parent[x]);
    }
    private boolean union(int a, int b){
        int rootA = find(a);
        int rootB = find(b);
        if(rootA == rootB) return false;
        if(size[rootA] < size[rootB]){
            parent[rootA] = rootB;
            size[rootB] += size[rootA];
        } else{
            parent[rootB] = rootA;
            size[rootA] += size[rootB];
        }
        return true;
    }
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        parent = new int[n+1];
        size = new int[n+1];
        for(int i=1;i<=n;i++){
            parent[i] = i;
            size[i] = 1;
        }
        for(int[]e: edges){
            int a = e[0];
            int b = e[1];
            boolean check = union(a,b);
            if(!check) return new int[]{a,b};
        }
        return new int[0];
    }
}