public class Queens {
    //time complexity - O(n^n)

    public boolean isSafe(int row, int col, char[][]board){
        //checking horizontal line
        for(int j= 0; j<board.length; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        //checking vertically
        for(int i=0; i<board.length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //checking upper left
        int r = row;
        for(int c = col; c>=0 && r>=0; c--; r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //checking upper right
        r = row;
        for(int c = col; c<board.length && r>=0; r--; c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //checking lower left
        r = row;
        for(int c=col; c>=0 && r<board.length; r++; c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // checking lower right
        for(int c = col; c>board.length && row>board.length; c++; r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        return true;
    }


    public void saveBoard(char[][] board, List<List<String>> allBoards){
        String row = "";
        List<String>newBoard = new ArrayList<>();

        for(int i=0; i<board.length; i++){
            row ="";
            for(int j=0; j<board.length; j++){
                if(board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }

            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }
    public void helper(char[][] board, List<List<String>> allBoards, int col){
        if(col == board.length){
            saveBoard(board, allBoards);
            return;
        }
        for(int row = 0; row<board.length; row++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col] = '.';
            }
        }
    }


    public List<List<String>> solveQueens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new board[n][n];

        helper(board, allBoards, 0);
        return allBoards;
    }    
}
