package LLDTicTacToe;

import LLDTicTacToe.Objects.*;

import java.util.*;

public class Game {
    Deque<Player> playerList;
    Board board;

    public void initGame(){
    Player player1 = new Player(1,new PieceX());
    Player player2 = new Player(2, new PieceO());
    playerList = new ArrayDeque<Player>();
    playerList.add(player1);
    playerList.add(player2);
    board = new Board(3);
    }
    public int startGame(){
        boolean noWinner = true;
        while(noWinner){
            Player playingPlayer = playerList.getFirst();

            List<Pair<Integer, Integer>> freeSpaces =  board.getFreeCells();
            if(freeSpaces.isEmpty()) {
                noWinner = false;
                continue;
            }

            System.out.print("Player:" + playingPlayer.id + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            board.addPiece(inputRow,inputColumn,playingPlayer.piece);

            playerList.removeFirst();
            playerList.addLast(playingPlayer);

            boolean winner = isThereWinner(inputRow, inputColumn, playingPlayer.piece.pieceType);
            if(winner) {
                return playingPlayer.id;
            }
        }
        return -1;
    }
    public boolean isThereWinner(int row, int column, PieceType pieceType) {
        return true;
    }
}
