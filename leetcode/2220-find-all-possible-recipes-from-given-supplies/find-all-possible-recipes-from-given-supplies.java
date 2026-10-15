class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Map<String,Integer> indegree = new HashMap<>();
        for(int i=0;i<recipes.length;i++){
            indegree.put(recipes[i],ingredients.get(i).size());
        }
        Queue<String> queue = new ArrayDeque<>();
        for(String s:supplies){
            queue.offer(s);
        }
        Map<String,List<String>> graph = new HashMap<>();
        for(int i=0;i<ingredients.size();i++){
            for(int j=0;j<ingredients.get(i).size();j++){
                String curr = ingredients.get(i).get(j);
                graph.putIfAbsent(curr,new ArrayList<>());
                graph.get(curr).add(recipes[i]);
            }
        }
        List<String> result = new ArrayList<>();
        while(!queue.isEmpty()){
            String curr = queue.poll();
            if(!graph.containsKey(curr)){
                continue;
            }
            for(String v:graph.get(curr)){
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