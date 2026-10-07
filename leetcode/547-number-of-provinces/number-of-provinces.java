class Solution {
    int cities;
    public int findCircleNum(int[][] isConnected) {
        cities = isConnected.length;
        boolean[] visited = new boolean[cities];
        int count = 0;
        for(int curr=0;curr<cities;curr++){
            if(!visited[curr]){
                count++;
                dfs(isConnected,curr,visited);
            }
        }
        return count;
    }
    public void dfs(int[][] isConnected, int curr, boolean[] visited){
        visited[curr] = true;
        for(int i=0;i<cities;i++){
            if(isConnected[curr][i] == 1 && !visited[i]){
                dfs(isConnected,i,visited);
            }
        }
    }
}