class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> neighbors = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            neighbors.add(new ArrayList<>());
        }
        int[] indegree = new int[numCourses];
        for (int[] p : prerequisites) {
            neighbors.get(p[1]).add(p[0]);
            indegree[p[0]]++;
        }
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                queue.offer(i);
            }   
        }
        int count = 0;
        while(!queue.isEmpty()){
            int u = queue.poll();
            count++;
            for(int v: neighbors.get(u)){
                indegree[v]--;
                if(indegree[v]==0){
                    queue.offer(v);
                }
            }
        }
        return count == numCourses;
    }
}