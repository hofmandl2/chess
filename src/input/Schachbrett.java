package input;


public class Schachbrett {
	private Field[][] fields = new Field[8][8]; // 8*8 Felder
	
	public Schachbrett() {
		for (int i = 0; i<8; ++i) {
			for (int j = 0; j<8; ++j) {
				fields[i][j] = new Field(null);
			}
		}
		fields[3][4] = new Field(new Turm('T', Color.Black));
		fields[3][5] = new Field(new King('K', Color.White));
	}

	private Field getField(Point p) {
		int x = p.getXIndex();
		int y = p.getYIndex();
		return fields[x][y];
	}
	
	public Figur get(Point p) {
		return getField(p).getFigur();
	}

	public void move(Point von, Point nach) {
		Field vonField = getField(von);
		Figur vonFigur = vonField.getFigur();
		if (vonFigur == null) {
			throw new IllegalArgumentException("Bei Von ist gar keine Figur!");
		}
		if (!vonFigur.canMove(von, nach)) {
			throw new IllegalArgumentException("So kann " + vonFigur.toString() + " nicht ziehen!");
		}

		Field nachField = getField(nach);
		nachField.setFigur(vonFigur);
		vonField.setFigur(null);
	}
	
	public void print() {
		for (int x = 0; x<8; ++x) {
			for (int y = 0; y<8; ++y) {
				fields[y][x].print();
				System.out.print("|");
			}
			System.out.print(x + 1);
			System.out.println();
		}
		for (int x = 0; x<8; ++x) {
			System.out.print((char)('A' + x));
			System.out.print(" ");
		}
		System.out.println();
	}



}
