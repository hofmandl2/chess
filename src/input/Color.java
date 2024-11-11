package input;

public enum Color {
	Black,
	White,
	;
	
	public char applyColor(char c) {
		if (this == Black) {
			return Character.toLowerCase(c);
		} else {
			return Character.toUpperCase(c);
		}
	}
}
