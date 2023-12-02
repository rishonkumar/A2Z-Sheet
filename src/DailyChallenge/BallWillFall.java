package DailyChallenge;

public class BallWillFall {

    public int[] findBall(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        if (grid == null || n == 0) return new int[0];
        int[] ans = new int[m];

        for (int i = 0; i < m; i++) {
            int currRow = 0, currCol = i;
            while (currRow < n) {
                //we go to right if current val and val to the right is equal to 1
                if (grid[currRow][currCol] == 1 && currCol + 1 < m && grid[currRow][currCol + 1] == 1) {
                    currRow++;
                    currCol++;
                }
                // we got to left if current value and val to the left is equal to -1
                else if (grid[currRow][currCol] == -1 && currCol - 1 >= 0 && grid[currRow][currCol - 1] == -1) {
                    currRow++;
                    currCol--;
                }
                //if we can't move to the left, and we can't move to right, ball is stuck
                else {
                    break;
                }
            }
            if (currRow == n) ans[i] = currCol;
            else ans[i] = -1;
        }
        return ans;
    }

    //Shorter Version
    /*
    We drop the ball at grid[0][i]
    and track ball position i1, which initlized as i.

    An observation is that,
    if the ball wants to move from i1 to i2,
    we must have the board direction grid[j][i1] == grid[j][i2]
     */
    public int[] findBallC(int[][] grid){
        int n = grid.length , m = grid[0].length;

        int[] ans = new int[m];

        for(int j = 0 ; j < m ; j++) {
            int currPos = j;
            int nextPos = -1;
            for(int i = 0 ; i < n ; i++) {
                nextPos = grid[i][currPos] + currPos;
                // if hit the wall or adjacent not in same direction
                if(nextPos < 0 || nextPos >= m || grid[i][currPos] != grid[i][nextPos]) {
                    currPos = -1;
                    break;
                }
                //update next level
                currPos = nextPos;
            }
            ans[j] = currPos;
        }
        return ans;

    }

}
