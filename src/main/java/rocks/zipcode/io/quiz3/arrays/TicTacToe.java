package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] board;
    String[] result = new String[3];

    public TicTacToe(String[][] board) {

        this.board = board;

    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        result[0] = board[value][0];
        result[1] = board[value][1];
        result[2] = board[value][2];

        return result;
    }

    public String[] getColumn(Integer value) {
        result[0] = board[0][value];
        result[1] = board[1][value];
        result[2] = board[2][value];

        return result;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {

        if(board[rowIndex][0] == board[rowIndex][1] &&
                board[rowIndex][1] == board[rowIndex][2])
            return true;

        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {

        if(board[0][columnIndex] == board[1][columnIndex] &&
                board[1][columnIndex] == board[2][columnIndex])
            return true;

        return false;
    }

    public String getWinner() {
        for (int i = 0; i < 3; i++) {
            //checking for rows
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != " ") {

                if (board[i][0] == "X") {
                    return "X";
                } else if (board[i][0] == "O") {
                    return "O";
                } else {
                    return "";
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            //checking for columns
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != " ") {
                if (board[0][i] == "X") {
                    return "X";
                } else if (board[0][i] == "O") {
                    return "O";
                } else {
                    return "";
                }
            }
        }

        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != " ") {

            if (board[0][0] == "X") {
                return "X";
            } else if (board[0][0] == "O") {
                return "O";
            } else {
                return "";
            }
        }

        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != " ") {
            if (board[0][2] == "X") {
                return "X";
            } else if (board[0][2] == "O") {
                return "O";
            } else {
                return "";
            }
        }

        return "";

    }


    public String[][] getBoard() {
        return null;
    }
}
