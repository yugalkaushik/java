class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Map<String,Integer> indegree = new HashMap<>();
        for(int i=0;i<recipes.length;i++){
            indegree.put(recipes[i],ingredients.get(i).size());
        }
        Map<String,List<String>> graph = new HashMap<>();
        for(int i=0;i<ingredients.size();i++){
            for(int j=0;j<ingredients.get(i).size();j++){
                String curr = ingredients.get(i).get(j);
                graph.putIfAbsent(curr,new ArrayList<>());
                graph.get(curr).add(recipes[i]);
            }
        }
        Queue<String> queue = new ArrayDeque<>();
        for(String s:supplies){
            queue.offer(s);
        }
        List<String> result = new ArrayList<>();
        while(!queue.isEmpty()){
            String u = queue.poll();
            for(String v:graph.getOrDefault(u,new ArrayList<>())){
                indegree.put(v,indegree.get(v)-1);
                if(indegree.get(v)==0){
                    queue.offer(v);
                    result.add(v);
                }
            }
        }
        return result;
    }
}