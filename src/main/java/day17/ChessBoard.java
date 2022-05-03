package day17;

public class ChessBoard {

    char[][] board = new char[8][8];

    public ChessBoard(char[][] board){
        this.board = board;
    }

    public void print(){

        for (int i = 0; i < 8; i++)
            System.out.println(board[i]);

    }

}
