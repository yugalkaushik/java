class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] p : prerequisites) {
            adj.get(p[1]).add(p[0]);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] path = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                boolean result = dfs(i, adj, visited, path);
                if (!result) return false;
            }
        }

        return true;
    }

    public boolean dfs(int i, List<List<Integer>> adj, boolean[] visited, boolean[] path) {
        visited[i] = true;
        path[i] = true;
        if (adj.get(i).isEmpty()) {
            path[i] = false;
            return true;
        }
        for (int neighbor : adj.get(i)) {
            if (path[neighbor]) {
                return false;
            }
            if(!visited[neighbor]){
                if (!dfs(neighbor, adj, visited, path)) {
                    return false;
                }
            }
        }
        path[i] = false;
        return true;
    }
}
