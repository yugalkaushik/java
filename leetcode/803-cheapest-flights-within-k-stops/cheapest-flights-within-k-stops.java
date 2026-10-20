class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] distance = new int[n];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[src] = 0;
        for(int i=0;i<k+1;i++){
            int[] temp = distance.clone();
            for(int j=0;j<flights.length;j++){
                int u = flights[j][0];
                int v = flights[j][1];
                int w = flights[j][2];
                if(distance[u]!= Integer.MAX_VALUE && distance[u] + w < temp[v]){
                    temp[v] = distance[u] + w;
                }
            }
            distance = temp;
        }
        if(distance[dst] == Integer.MAX_VALUE) return -1;
        return distance[dst];
    }
}