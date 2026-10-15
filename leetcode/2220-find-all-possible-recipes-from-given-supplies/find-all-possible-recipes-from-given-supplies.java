class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        List<String> result = new ArrayList<>();

        Map<String, List<String>> graph = new HashMap<>();
        Map<String, Integer> indegree = new HashMap<>();

        Queue<String> queue = new LinkedList<>();

        // Initialize indegree for each recipe
        for (int i = 0; i < recipes.length; i++) {
            indegree.put(recipes[i], ingredients.get(i).size());
        }

        // Build graph: ingredient -> recipes that require it
        for (int i = 0; i < recipes.length; i++) {
            for (int j = 0; j < ingredients.get(i).size(); j++) {
                String ingredient = ingredients.get(i).get(j);

                graph.putIfAbsent(ingredient, new ArrayList<>());
                graph.get(ingredient).add(recipes[i]);
            }
        }

        // Add all initial supplies to the queue
        for (String supply : supplies) {
            queue.offer(supply);
        }

        // Kahn's Algorithm
        while (!queue.isEmpty()) {
            String current = queue.poll();

            if (!graph.containsKey(current)) {
                continue;
            }

            for (String recipe : graph.get(current)) {
                indegree.put(recipe, indegree.get(recipe) - 1);

                if (indegree.get(recipe) == 0) {
                    result.add(recipe);
                    queue.offer(recipe);
                }
            }
        }

        return result;
    }
}