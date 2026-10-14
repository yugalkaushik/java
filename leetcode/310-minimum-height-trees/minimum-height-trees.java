class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<List<Integer>> neighbors = new ArrayList<>();
        int[] indegree = new int[n];
        for(int i=0;i<n;i++){
            neighbors.add(new ArrayList<>());
        }
        for(int[] p:edges){
            neighbors.get(p[0]).add(p[1]);
            neighbors.get(p[1]).add(p[0]);
            indegree[p[0]]++;
            indegree[p[1]]++;
        }
        if(n==1) return new ArrayList<>(List.of(0));
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==1){
                queue.offer(i);
            }
        }
        int remainingNodes = n;
        while(remainingNodes > 2){
            int size = queue.size();
            remainingNodes -= size;
            for(int i=0;i<size;i++){
                int u = queue.poll();
                for(int v:neighbors.get(u)){
                    if(indegree[v]==0){
                        continue;
                    }
                    indegree[v]--;
                    if(indegree[v]==1){
                        queue.offer(v);
                    }
                }
                indegree[u] = 0;
            }
        }
        return new ArrayList<>(queue);   
    }
}