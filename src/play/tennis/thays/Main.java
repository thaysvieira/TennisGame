package play.tennis.thays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador victor = new Jugador("Victor");
		Jugador sarah = new Jugador("Sarah");
		Game game = new Game(victor, sarah);
		victor.winBall();
	    sarah.winBall();

		System.out.println(game.getScore());
		System.out.println(game.getJugadorPrincipal().getName());
	}

}
