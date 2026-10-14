class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> neighbors = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            neighbors.add(new ArrayList<>());
        }
        for(int[] p:prerequisites){
            neighbors.get(p[0]).add(p[1]);
        }
        int[] indegree = new int[numCourses];
        Queue<Integer> queue = new ArrayDeque<>();
        for(int[]p:prerequisites){
            indegree[p[1]]++;
        }
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
        if(count<numCourses) return false;
        else return true;
    }
}