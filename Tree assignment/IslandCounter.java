import java.util.*;

public class IslandCounter {

    static int[][] grid = {
            {1,1,0,0,0},
            {1,1,0,0,1},
            {0,0,1,0,1},
            {0,0,0,1,1}
    };

    static int n = grid.length, m = grid[0].length;

    static void dfs(int i, int j) {
        if (i<0 || j<0 || i>=n || j>=m || grid[i][j]==0) return;
        grid[i][j] = 0;
        dfs(i+1,j);
        dfs(i-1,j);
        dfs(i,j+1);
        dfs(i,j-1);
    }

    static int countIslandsDFS() {
        int count = 0;
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                if (grid[i][j]==1) {
                    count++;
                    dfs(i,j);
                }
            }
        }
        return count;
    }

    static int countIslandsBFS(int[][] g) {
        int count = 0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        int r = g.length, c = g[0].length;

        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                if (g[i][j]==1) {
                    count++;
                    Queue<int[]> q = new LinkedList<>();
                    q.add(new int[]{i,j});
                    g[i][j]=0;

                    while(!q.isEmpty()) {
                        int[] cur = q.poll();
                        for (int[] d: dirs) {
                            int ni = cur[0]+d[0];
                            int nj = cur[1]+d[1];
                            if (ni>=0 && nj>=0 && ni<r && nj<c && g[ni][nj]==1) {
                                g[ni][nj]=0;
                                q.add(new int[]{ni,nj});
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] gridCopy = {
                {1,1,0,0,0},
                {1,1,0,0,1},
                {0,0,1,0,1},
                {0,0,0,1,1}
        };

        System.out.println(countIslandsDFS());
        System.out.println(countIslandsBFS(gridCopy));
    }
}