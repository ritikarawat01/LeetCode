class Solution {
    public int[][] floodFill(int[][] img, int sr, int sc, int col) {
        int orgCol = img[sr][sc];
        if(orgCol == col){
            return img;
        }
        dfs(img, sr, sc, orgCol, col);
        return img;
    }
    //yaha toh boundary check ho rhi hai
    public void dfs(int[][] img, int r, int c, int orgCol, int col){
        if(r < 0 || r >= img.length || c < 0 || c >= img[0].length){
            return;
        }
        //yaha too see if cell has different color
        if(img[r][c] != orgCol){
            return;
        }
        img[r][c] = col;
        dfs(img, r-1, c, orgCol, col);
        dfs(img, r+1, c, orgCol, col);
        dfs(img, r, c-1, orgCol, col);
        dfs(img, r, c+1, orgCol, col);
    }
}