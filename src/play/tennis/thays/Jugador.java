package play.tennis.thays;

import java.util.Arrays;
import java.util.List;

public class Jugador {
	public static final List<String> descripcionPuntos = Arrays.asList("love", "fifteen", "thirty", "forty");

    private int score;
    public int getScore() {
        return score;
    }
    String name;
    public String getName() {
        return name;
    }

    public void winBall() {
        this.score = this.score + 1;
    }

    public Jugador(String name) {
        this.name = name;
    }

    public String getScoreDescripcion(){
        return descripcionPuntos.get(score);
    }
}
