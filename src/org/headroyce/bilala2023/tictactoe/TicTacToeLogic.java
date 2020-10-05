package org.headroyce.bilala2023.tictactoe;

public class TicTacToeLogic {

    private int[] board;
    private int turn;           // 1 = X, -1 = O
    private boolean gameOver;   // starts at false

    public TicTacToeLogic() {
        board = new int[numRows()*numRows()];

        reset();
    }

    /**
     * Resets the board to starting positions
     */
    public void reset() {

        turn = 1;

        // TODO: Complete this method
		// Reset the board spaces
    }

    /**
     * Attempts to make a move on the board
     *
     * @param spot the location to move [0, (numRows^2)]
     * @return true if a valid is made, false otherwise
     */
    public boolean makeMove(int spot) {
        // TODO: Complete Me
		// Turn doesn't change
		// Can pick the same space twice

        // EDIT: Is your choice on the board
        if (spot < 0 || spot > board.length) {
            return false;
        }

        // EDIT: Finds if your picking a occupied spot
        if (board[spot] == 1 || (board[spot] == -1)) {
            return false;
        }

        // EDIT: Changes turns
        this.board[spot] = turn;
        turn *= -1;

        return true ;
    }

    /**
     * Checks for a winner
     *
     * @return the Winner, "TIE" if a tie occurs, or empty string if there is no winner but the game is not over
     */
    public String checkWinner() {

        // TODO: Complete this method. Test after each step

		// Check Rows
        int row = 0;
        int spot = 0;

		// Check Columns

		// Check Diagonals

		// Check for NOT a tie

        return "";
    }

    /**
     * Gets the player name of the spot asked
     *
     * @param spot the spot to check
     * @return the name of the player, empty string is the space is not occupied, or null for invalid locations
     */
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

    /**
     * Is the game over?
     *
     * @return true if the game is over, false otherwise
     */
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
