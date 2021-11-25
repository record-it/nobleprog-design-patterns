package observer;
/*
Zdefiniuj poniższą klasę jako obserwator dla Gameboard
Jednocześnie tak klasa powinna mieć dostęp do gameBoard
aby wykonywać też metody action i move
Dodaj kod rejestrujacy tę klasę jako obserwatora.
 */
public class PlayerObserver implements Observer{
    private final GameBoard gameBoard;

    public PlayerObserver(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
    }

    @Override
    public void update(String event) {
        System.out.println("Wykonano ruch " + event);
    }

    public void move(){
        gameBoard.move();
    }
}
