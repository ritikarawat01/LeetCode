class Solution {
    public boolean validPath(int n, int[][] edges, int src, int dst) {
        List<List<Integer>> g = new ArrayList<>();
        for(int i = 0; i < n; i++){
            g.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            g.get(u).add(v);
            g.get(v).add(u);
        }
        boolean[] vis = new boolean[n];
        return dfs(src, dst, g, vis);

    }
    public boolean dfs(int node, int dst, List<List<Integer>> g, boolean[] vis){
        if(node == dst){
            return true;
        }
        vis[node] = true;
        for(int neighbor : g.get(node)){
            if(!vis[neighbor]){
                if(dfs(neighbor, dst, g, vis)){
                    return true;
                }
            }
        }
        return false;
    }
}