class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        dfs(rooms,0,visited);
        boolean result = true;
        for(boolean v:visited){
            if(!v) result = false;
        }
        return result;
    }
    public void dfs(List<List<Integer>> rooms,int curr,boolean[] visited){
        visited[curr] = true;
        for(int i=0;i<rooms.get(curr).size();i++){
            int next = rooms.get(curr).get(i);
            if(!visited[next]){
                dfs(rooms,next,visited);
            }
        }
    }
}