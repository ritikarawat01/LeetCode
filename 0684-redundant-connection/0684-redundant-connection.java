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
            int rootu = find(u); // administative find krenge har node ka
            int rootv = find(v);
            if(rootu == rootv){
                return edge; // cycle detected toh edge return krdenge
            }
            parent[rootu] = rootv; // nhi toh merge krdenge
        }
        return new int[0];
    }
    public int find(int x){
        if(parent[x] == x){     
            return x;//same administrative ka code hai 
        }
        return parent[x] = find(parent[x]); //path compression k liye
    }
}