package LLDTicTacToe.Objects;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public int size;
    public Piece[][]board;

    public Board(int size) {
        this.size = size;
        board = new Piece[size][size];
    }

    public void addPiece(int row,int col,Piece piece){
        // implementation
    }

    public List<Pair<Integer,Integer>> getFreeCells (){
        List<Pair<Integer,Integer>> coordinates = new ArrayList<>();
        coordinates.add(new Pair<>(1,2));
        return coordinates;
    }

}
