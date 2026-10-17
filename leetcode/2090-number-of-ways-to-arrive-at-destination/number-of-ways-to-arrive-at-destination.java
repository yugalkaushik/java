class Solution {
    public int countPaths(int n, int[][] roads) {
        List<List<int[]>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] road : roads) {
            int u = road[0];
            int v = road[1];
            int time = road[2];
            graph.get(u).add(new int[]{v, time});
            graph.get(v).add(new int[]{u, time});
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
            int node = (int) curr[1];
            if (dist > distance[node]) {
                continue;
            }

            for(int[] v:graph.get(node)){
                long newD = dist + v[1];
                int neighbor = v[0];
                if(newD < distance[v[0]]){
                    distance[neighbor] = newD;
                    count[neighbor] = count[node];
                    pq.offer(new long[]{newD,neighbor});
                } else if(newD == distance[neighbor]){
                    count[neighbor] = (int)(((long) count[neighbor] + count[node]) % 1_000_000_007 );
                }
            }
        }
        return count[n-1];
    }
}