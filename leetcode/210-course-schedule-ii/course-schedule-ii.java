class Solution {
    public List<Integer> result;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        result = new ArrayList<>();
        boolean[] visited = new boolean[numCourses];
        boolean[] path = new boolean[numCourses];
        List<List<Integer>> neighbors = new ArrayList<>();
        for(int i =0;i<numCourses;i++){
            neighbors.add(new ArrayList<>());
        }
        for(int[]p:prerequisites){
            neighbors.get(p[0]).add(p[1]);
        }
        for(int u=0;u<numCourses;u++){
            if(!visited[u]){
                if(dfs(u,neighbors,visited,path)){
                    return new int[0];
                }
            }
        }
        int[] order = new int[numCourses];
        for (int i = 0; i < numCourses; i++){
            order[i] = result.get(i); 
        }
        return order;
    }
    public boolean dfs(int u,List<List<Integer>> neighbors, boolean[] visited, boolean[] path){
        visited[u] = true;
        path[u] = true;
        for(int v:neighbors.get(u)){
            if(!visited[v]){
                if(dfs(v,neighbors,visited,path)){
                    path[u] = false;
                    return true;
                }
            }else if(path[v]){
                path[u] = false;
                return true;
            }
        }
        path[u] = false;
        result.add(u);
        return false;
    }
}