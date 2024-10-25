package LLDTicTacToe;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.initGame();
        System.out.println("Player "+ game.startGame() +" is winner");
    }
}
