class Solution {
    int[] parent;
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        parent = new int[n+1];
        //initially toh har node khudka parent hoga
        for(int i = 0; i < n; i++){
            parent[i] = i;
        }
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            int rootu = find(u);
            int rootv = find(v);
            if(rootu == rootv){
                return edge;
            }
            parent[rootu] = rootv;
        }
        return new int[0];
    }
    public int find(int x){
        if(parent[x] == x){
            return x;
        }
        return parent[x] = find(parent[x]);
    }
}