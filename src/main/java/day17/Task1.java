package day17;

public class Task1 {
    public static void main(String[] args) {
        char[] figures=new char[8];

        for (int i = 0; i < 4; i++){
            figures[i] = ChessPiece.PAWN_WHITE.getFigure();
            figures[i+4] = ChessPiece.ROOK_BLACK.getFigure();
        }

        for (int i = 0; i < figures.length; i++)
            System.out.print(figures[i] + " ");
    }
}