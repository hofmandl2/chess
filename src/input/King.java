package input;

public class King extends Figur {

	public King(char art, Color color) {
		super(art, color);
	}

	@Override
	public boolean canMove(Point von, Point nach) {
		int xDiff = Math.abs(von.getXIndex() - nach.getXIndex());
		int yDiff = Math.abs(von.getYIndex() - nach.getYIndex());
		if (xDiff == 0 && yDiff == 0) {
			return false;
		}
		if (xDiff > 1 || xDiff < 0) {
			return false;
		}
		if (yDiff > 1 || yDiff < 0) {
			return false;
		}
		return true;
	}

}
