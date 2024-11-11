package input;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Schachbrett brett = new Schachbrett();
		Scanner s = new Scanner(System.in);

		while (true) {
			brett.print();
			
			Point von = Point.fromInput("Welche figur willst du bewegen ?", s);
			Figur figur = brett.get(von);
			if (figur == null) {
				System.out.println("Da ist doch gar nix!");
				continue;
			}

			try {
				Point nach = Point.fromInput("Wohin soll die Figur " + figur.toString() + " ziehen?", s);
				brett.move(von, nach);
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
	}
	
}


////
/*

// field.h

struct Field {
  Figur* figur;
};

Figur* getFigur(Field* this);

 */


