class Solution {
    public List<List<String>> solveNQueens(int n) {

        char[][] board  = new char[n][n];

        for(int i = 0;i < n;i++){
            Arrays.fill(board[i],'.');
        }
        List<List<String>> ans = new ArrayList<>();

        // we are going to check col wise.
        solve(0,ans,n,board);

        return ans;
    }

    private  void solve(int col, List<List<String>> ans, int n, char[][] board) {

        if(col == n) {
            ans.add(construct(board));
            return;
        }

        for(int row =0; row < n;row++) {

            if (isSafe(board, col, row, n)) {

                board[row][col] = 'Q';

                solve(col + 1, ans, n, board);

                board[row][col]='.';

            }
        }

    }

    private  boolean isSafe(char[][] board, int col, int row, int n) {

        //left side row
        for(int j=0;j < col; j++){
            if(board[row][j]=='Q') return false;
        }
        //upper left
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--){
            if(board[i][j]=='Q') return false;
        }
        // Check lower-left diagonal
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    private List<String> construct(char[][] board) {

        List<String> ds = new ArrayList<>();
        for(char[] ch : board){

            ds.add(new String(ch));

        }
        return ds;
    }
    }

