class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer> result = new ArrayList<>();
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
            result.add(u);
            for(int v: neighbors.get(u)){
                indegree[v]--;
                if(indegree[v]==0){
                    queue.offer(v);
                }
            }
        }
        if(result.size()!= numCourses){
            return new int[0];
        }
        int[] answer = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}