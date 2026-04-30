public class Word Search {
    
}
public class WordSearch {

    static int[] dx = {-1,-1,-1,0,0,1,1,1};
    static int[] dy = {-1,0,1,-1,1,-1,0,1};

    static boolean search(char[][] grid, String word, int i, int j, int index) {
        if (index == word.length()) return true;

        if (i<0 || j<0 || i>=4 || j>=4 || grid[i][j] != word.charAt(index))
            return false;

        char temp = grid[i][j];
        grid[i][j] = '#';

        for (int d = 0; d < 8; d++) {
            if (search(grid, word, i+dx[d], j+dy[d], index+1))
                return true;
        }

        grid[i][j] = temp;
        return false;
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'C','A','T','S'},
                {'O','R','E','A'},
                {'D','E','A','M'},
                {'E','L','L','S'}
        };

        String word = "DREAM";

        for (int i=0;i<4;i++) {
            for (int j=0;j<4;j++) {
                if (search(grid, word, i, j, 0)) {
                    System.out.println("Found");
                    return;
                }
            }
        }
        System.out.println("Not Found");
    }
}