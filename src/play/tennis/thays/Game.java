package play.tennis.thays;

public class Game {
	private Jugador jugador1;
	private Jugador jugador2;

	public Game(Jugador jugador1, Jugador jugador2) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	}

	public String getScore() {
		if (jugador1.getScore() >= 3 && jugador2.getScore() >= 3) {
			if (Math.abs(jugador2.getScore() - jugador1.getScore()) >= 2) {
				return getJugadorPrincipal().getName() + " ha ganado";
			} else if (jugador1.getScore() == jugador2.getScore()) {
				return "deuce";
			} else {
				return "advantage " + getJugadorPrincipal().getName();
			}
		} else {
			return jugador1.getScoreDescripcion() + ", " + jugador2.getScoreDescripcion();
		}
	}

	public Jugador getJugadorPrincipal() {
		return (jugador1.getScore() > jugador2.getScore()) ? jugador1 : jugador2;
	}
}
