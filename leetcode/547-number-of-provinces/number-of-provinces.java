class Solution {

    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                dfs(isConnected, i, visited);
            }
        }

        return count;
    }

    public void dfs(int[][] isConnected, int i, boolean[] visited) {

        visited[i] = true;

        for (int v = 0; v < isConnected.length; v++) {
            if (isConnected[i][v] == 1 && !visited[v]) {
                dfs(isConnected, v, visited);
            }
        }
    }
}