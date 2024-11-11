package input;

public abstract class Figur {
	private final char art;
	private final Color color;

	public Figur(char art, Color color) {
		this.art = art;
		this.color = color;
	}

	public abstract boolean canMove(Point von, Point nach);

	public void print() {
		System.out.print(toString());
	}
	
	@Override
	public String toString() {
		return "" + color.applyColor(art);
	}
}
