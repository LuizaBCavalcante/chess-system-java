package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class  ChessPiece extends Piece {
    private Color color;
    private int moveCount;
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    public ChessPosition getChessPosition(){
        return ChessPosition.fromPosition(position);
    }
    public int getMoveCount(){
        return moveCount;
    }
    public void increaseMoveCount(){
        moveCount++;
    }
    public void decreaseMoveCount(){
        moveCount--;
    }

    protected boolean isThereOpponentpiece(Position position){
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p!=null && p.getColor() != color;
    }
}
