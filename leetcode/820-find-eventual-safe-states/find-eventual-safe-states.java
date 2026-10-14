class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int len = graph.length;
        boolean[] visited = new boolean[len];
        boolean[] path = new boolean[len];
        boolean[] result = new boolean[len];
        List<Integer> answer = new ArrayList<>();

        for(int u=0;u<len;u++){
            if(!visited[u]){
                if(!dfs(u,path,visited,result,graph)){
                    result[u] = true;
                }
            }
        }
        
        for(int i=0;i<len;i++){
            if(!result[i]){
                answer.add(i);
            }
        }
        return answer;
    }
    public boolean dfs(int u, boolean[]path, boolean[]visited, boolean[]result,int[][] graph){
        visited[u] = true;
        path[u] = true;
        for(int v:graph[u]){
            if(!visited[v]){
                if(!dfs(v,path,visited,result,graph)){
                    result[v] = true;
                    path[v] = false;
                    return false;
                }
            }
            if(path[v] || result[v]){
                result[v] = true;
                path[v] = false;
                return false;
            }
            
        }
        path[u] = false;
        return true;
    }
}