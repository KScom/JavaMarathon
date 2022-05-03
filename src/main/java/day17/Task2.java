package day17;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        char[][] board = new char[8][8];

        for (int i = 0; i < 8; i++)
           Arrays.fill(board[i],ChessPiece.EMPTY.getFigure());

        board[0][0] = ChessPiece.ROOK_BLACK.getFigure();
        board[0][5] = ChessPiece.ROOK_BLACK.getFigure();
        board[0][6] = ChessPiece.QUEEN_BLACK.getFigure();
        board[1][1] = ChessPiece.ROOK_WHITE.getFigure();
        board[1][4] = ChessPiece.PAWN_BLACK.getFigure();
        board[1][5] = ChessPiece.PAWN_BLACK.getFigure();
        board[1][7] = ChessPiece.PAWN_BLACK.getFigure();
        board[2][0] = ChessPiece.PAWN_BLACK.getFigure();
        board[2][2] = ChessPiece.KNIGHT_BLACK.getFigure();
        board[2][6] = ChessPiece.PAWN_BLACK.getFigure();
        board[3][0] = ChessPiece.KING_BLACK.getFigure();
        board[3][3] = ChessPiece.BISHOP_WHITE.getFigure();
        board[4][3] = ChessPiece.BISHOP_BLACK.getFigure();
        board[4][4] = ChessPiece.PAWN_WHITE.getFigure();
        board[5][4] = ChessPiece.BISHOP_WHITE.getFigure();
        board[5][5] = ChessPiece.PAWN_WHITE.getFigure();
        board[6][0] = ChessPiece.PAWN_WHITE.getFigure();
        board[6][3] = ChessPiece.KING_WHITE.getFigure();
        board[6][5] = ChessPiece.PAWN_WHITE.getFigure();
        board[6][7] = ChessPiece.PAWN_WHITE.getFigure();
        board[7][5] = ChessPiece.ROOK_WHITE.getFigure();
        board[7][6] = ChessPiece.QUEEN_WHITE.getFigure();

        ChessBoard chessBoard = new ChessBoard(board);
        chessBoard.print();

    }
}
