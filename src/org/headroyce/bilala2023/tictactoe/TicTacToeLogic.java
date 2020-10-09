package org.headroyce.bilala2023.tictactoe;

public class TicTacToeLogic {

    private int[] board;
    private int turn;           // 1 = X, -1 = O
    private int winner;
    private boolean gameOver;   // starts at false

    public TicTacToeLogic() {
        board = new int[numRows()*numRows()];

        reset();
    }

    public void reset() {
        turn = 1;
        gameOver = false;

        board = new int[numRows() * numRows()];


    }

    public boolean makeMove(int spot) {
        if (gameOver == true){
            return false;
        }

        // EDIT: Is your choice on the board
        if (spot < 0 || spot >= board.length) {
            return false;
        }

        // EDIT: Finds if your picking a occupied spot
        if (board[spot] == 1 || (board[spot] == -1)) {
            return false;
        }

        // EDIT: Changes turns
        this.board[spot] = turn;
        turn *= -1;




        return true;
    }

    public String checkWinner() {

		// Check Rows
        for (int row = 0; row < 3; row++) {
            int sum = 0;
            int spot = row * 3;
            while (spot <= 3 * row + 2) {
                sum = board[spot] + sum;
                spot++ ;
            }
            if (sum == 3) {
                gameOver = true;
                return "X";
            } else if(sum == -3){
                gameOver = true;
                return "O";
            }
        }

        // Check Columns
        for (int column = 0; column < 3; column++){
            int sum = 0;
            int spot = column;
            while (spot <= column + 6) {
                sum = board[spot] + sum;
                spot = spot + 3;
            }
            if (sum == 3) {
                gameOver = true;
                return "X";
            } else if (sum == -3) {
                gameOver = true;
                return "O";
            }
        }


		// Check Diagonals
        for (int d = 0; d < 3; d++) {
            int sum = 0;
            int spot = 0;
            while (spot <= 8) {
                sum = board[spot] + sum;
                spot = spot + 4 ;
            }
            if (sum == 3) {
                gameOver = true;
                return "X";
            } else if(sum == -3){
                gameOver = true;
                return "O";
            }
        }

        for (int d2 = 0; d2 < 3; d2++) {
            int sum = 0;
            int spot = 2;
            while (spot <= 6) {
                sum = board[spot] + sum;
                spot = spot + 2;
            }
            if (sum == 3) {
                gameOver = true;
                return "X";
            } else if(sum == -3){
                gameOver = true;
                return "O";
            }
        }

        // NOT TIE
        for (int tie = 0; tie < 9; tie++) {
            if (board[tie] == 0) {
                return " ";
            }
        }

        gameOver = true;
        return "TIE";
    }



    public String getPlayer(int spot) {
        if (spot < 0 || spot >= board.length) {
            return null;
        }

        int player = board[spot];
        if (player == -1) {
            return "O";
        } else if (player == 1) {
            return "X";
        }
        return "";
    }

    public int numRows() {
        return 3;
    }


    public boolean isGameOver() {
        return gameOver;
    }

    public String whoseTurn() {
        if (turn == 1) {
            return "X";
        } else if (turn == -1) {
            return "O";
        }
        return "";
    }
}
