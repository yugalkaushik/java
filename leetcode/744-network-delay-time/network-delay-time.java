class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] distance = new int[n+1];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[k] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[0],b[0]));
        pq.offer(new int[]{0,k});

        Map<Integer,List<int[]>> graph = new HashMap<>();
        for(int i=0;i<times.length;i++){
            graph.putIfAbsent(times[i][0],new ArrayList<>());
            graph.get(times[i][0]).add(new int[]{times[i][1], times[i][2]});
        }

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int node = curr[1];
            int dist = curr[0];
            if (dist > distance[node]) continue;
            for(int[]v:graph.getOrDefault(node, new ArrayList<>())){
                int newD = dist + v[1];
                if(newD < distance[v[0]]){
                    distance[v[0]] = newD;
                    pq.offer(new int[]{newD,v[0]});
                }
            }
        }
        int result = Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            if(distance[i] == Integer.MAX_VALUE) return -1;
            result = Math.max(result,distance[i]);
        }
        return result;
    }
}