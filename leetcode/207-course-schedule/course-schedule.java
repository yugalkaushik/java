class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean[] visited = new boolean[numCourses];
        boolean[] path = new boolean[numCourses];
        List<List<Integer>> neighbors = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            neighbors.add(new ArrayList<>());
        }
        for (int[] p : prerequisites){
            neighbors.get(p[1]).add(p[0]); 
        }
        for(int u=0;u<numCourses;u++){
            if(!visited[u]){
                if(dfs(u,neighbors,path,visited)){
                    return false;
                }
            }
        }
        return true;
   }
   public boolean dfs(int u, List<List<Integer>> neighbors, boolean[] path, boolean[] visited){
        path[u] = true;
        visited[u] = true;
        for(int v:neighbors.get(u)){
            if(!visited[v]){
                if(dfs(v,neighbors,path,visited)){
                    path[u] = false;
                    return true;
                }
            } else if(path[v]){
                path[u] = false;
                return true;
            }
        }
        path[u] = false;
        return false;
   }
}