package input;

import java.util.Scanner;

public class Point {
	private char x; // A-H
	private int y; // 1-8

	public static Point fromInput(String prompt, Scanner s) {
		while (true) {
			System.out.println(prompt);
			String line = s.nextLine().strip();
			if (line.length() != 2) {
				System.out.println("Invalid input length, specify e.g. A2");
				continue;
			}
			char x = line.charAt(0);
			int y = Integer.parseInt("" + line.charAt(1));
			try {
				return new Point(x, y);
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid input: " + e.getMessage());
				continue;
			}
		}
	}
	
	public Point(char x, int y) {
		if (x < 'A' || x > 'H') {
			throw new IllegalArgumentException("x must be between A and H inclusive, got " + x);
		}
		if (y < 1 || y > 8) {
			throw new IllegalArgumentException("y must be between 1 and 8 inclusive, got " + y);
		}
		this.x = x;
		this.y = y;
	}
	
	public int getXIndex() {
		return this.x /* 65 - 73 */ - 'A' /* 65 */;
	}
	
	public int getYIndex() {
		return this.y - 1;
	}


}