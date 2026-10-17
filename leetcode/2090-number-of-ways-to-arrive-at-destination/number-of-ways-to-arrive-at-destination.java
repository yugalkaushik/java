class Solution {
    public int countPaths(int n, int[][] roads) {
        int MOD = 1_000_000_007;
        List<List<int[]>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] road : roads) {
            int u = road[0];
            int v = road[1];
            int time = road[2];
            graph.get(u).add(new int[]{time, v});
            graph.get(v).add(new int[]{time, u});
        }

        long[] distance = new long[n];
        Arrays.fill(distance, Long.MAX_VALUE);
        distance[0] = 0;

        int[] count = new int[n];
        count[0] = 1;

        PriorityQueue<long[]> pq = new PriorityQueue<>(
            (a, b) -> Long.compare(a[0], b[0])
        );

        pq.offer(new long[]{0, 0});
        
        while(!pq.isEmpty()){
            long[] curr = pq.poll();
            long dist = curr[0];
            int node = (int)curr[1];
            if(dist > distance[node]) continue;
            for(int[]v:graph.get(node)){
                long newD = dist + v[0];
                int neighbor = v[1];
                if(newD < distance[neighbor]){
                    distance[neighbor] = newD;
                    count[neighbor] = count[node];
                    pq.offer(new long[]{newD,neighbor});
                } else if(newD == distance[neighbor]){
                    count[neighbor] = (int)((long)count[neighbor] + (long)count[node]) % MOD;
                }
            }
        } 
        return count[n-1];     
    }
}