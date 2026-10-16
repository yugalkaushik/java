class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        double[] distance = new double[n];
        Arrays.fill(distance,0.0);
        distance[start_node] = 1.0;
        PriorityQueue<double[]> pq = new PriorityQueue<>((a,b) -> Double.compare(b[0],a[0]));
        pq.offer(new double[]{1.0,start_node});

        Map<Integer,List<double[]>> graph = new HashMap<>();
        for(int i=0;i<edges.length;i++){
            graph.putIfAbsent(edges[i][0],new ArrayList<>());
            graph.putIfAbsent(edges[i][1], new ArrayList<>());
            graph.get(edges[i][0]).add(new double[]{edges[i][1], succProb[i]});
            graph.get(edges[i][1]).add(new double[]{edges[i][0], succProb[i]});
        }
        while(!pq.isEmpty()){
            double[] curr = pq.poll();
            int node = (int) curr[1];
            double prob = curr[0];
            if(prob < distance[node]) continue;
            if (node == end_node) return prob;
            for(double[] v:graph.getOrDefault(node,new ArrayList<>())){
                int neighbor = (int) v[0];
                double newp = prob * v[1];
                if(newp > distance[neighbor]){
                    distance[neighbor] = newp;
                    pq.offer(new double[]{newp,neighbor});
                } 
            }
        }
        return 0.0;
    }
}