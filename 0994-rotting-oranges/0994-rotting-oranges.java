import java.util.*;

class Solution {

    public int orangesRotting(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        int fresh = 0;

        Queue<int[]> q = new ArrayDeque<>();

        // Count fresh oranges and add rotten oranges to queue
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 1) {
                    fresh++;
                }
                else if (grid[i][j] == 2) {
                    q.add(new int[]{i, j});
                }
            }
        }

        int mins = 0;

        int[][] dir = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };

        while (!q.isEmpty() && fresh > 0) {

            int size = q.size();

            for (int i = 0; i < size; i++) {

                int[] curr = q.poll();

                int curr_row = curr[0];
                int curr_col = curr[1];

                for (int j = 0; j < 4; j++) {

                    int nr = curr_row + dir[j][0];
                    int nc = curr_col + dir[j][1];

                    if (nr >= 0 && nr < rows &&
                        nc >= 0 && nc < cols &&
                        grid[nr][nc] == 1) {

                        grid[nr][nc] = 2;

                        fresh--;

                        q.offer(new int[]{nr, nc});
                    }
                }
            }

            mins++;
        }

        return fresh == 0 ? mins : -1;
    }
}



//dir[][] = {{1,0}, {-1, 0}, {0,1}, {0,-1}}-------------its called direction array----traverse by for loop
//

// i, j = (i+1, j) , (i-1, j), (i, j+1), (i, j-1)