class Solution {
    public int findPaths(int m, int n, int maxMove,
                         int startRow, int startColumn) {

        int MOD = 1000000007;

        int[][] dp = new int[m][n];

        dp[startRow][startColumn] = 1;

        int ans = 0;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int move = 1; move <= maxMove; move++) {

            int[][] temp = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    if (dp[i][j] == 0) {
                        continue;
                    }

                    for (int d = 0; d < 4; d++) {

                        int nr = i + dr[d];
                        int nc = j + dc[d];

                        if (nr < 0 || nr >= m ||
                            nc < 0 || nc >= n) {

                            ans = (ans + dp[i][j]) % MOD;

                        } else {

                            temp[nr][nc] =
                                (temp[nr][nc] + dp[i][j]) % MOD;
                        }
                    }
                }
            }

            dp = temp;
        }

        return ans;
    }
}
