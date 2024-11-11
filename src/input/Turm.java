package input;

public class Turm extends Figur {

	public Turm(char art, Color color) {
		super(art, color);
	}

	@Override
	public boolean canMove(Point von, Point nach) {
		return von.getXIndex() == nach.getXIndex() || von.getYIndex() == nach.getYIndex();
	}

}
