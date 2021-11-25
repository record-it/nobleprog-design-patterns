package observer;

public class GameObserverDemo {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        Observer spectator = event -> {
            Thread.sleep(5000);
            System.out.println("Zaobserwowałem " + event);
        };
        gameBoard.addObserver(spectator);
        //..
        gameBoard.action();
        gameBoard.move();
        PlayerObserver player = new PlayerObserver(gameBoard);
        gameBoard.addObserver(player);
        player.move();
    }
}
