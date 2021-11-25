package observer;

public class GameObserverDemo {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        Observer spectator = event -> System.out.println("Zaobserwowałem " + event);
        gameBoard.addObserver(spectator);
        //..
        gameBoard.action();
        gameBoard.move();

    }
}
