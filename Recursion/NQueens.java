public class NQueens {

    static boolean[] col, diag1, diag2;
    static int[] board;

    static boolean solve(int row, int n) {
        if (row == n) {
            for (int i=0;i<n;i++) {
                for (int j=0;j<n;j++) {
                    if (board[i]==j) System.out.print("Q ");
                    else System.out.print(". ");
                }
                System.out.println();
            }
            return true;
        }

        for (int c=0;c<n;c++) {
            if (!col[c] && !diag1[row-c+n-1] && !diag2[row+c]) {
                board[row] = c;
                col[c] = diag1[row-c+n-1] = diag2[row+c] = true;

                if (solve(row+1,n)) return true;

                col[c] = diag1[row-c+n-1] = diag2[row+c] = false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 4;
        col = new boolean[n];
        diag1 = new boolean[2*n];
        diag2 = new boolean[2*n];
        board = new int[n];

        solve(0,n);
    }
}