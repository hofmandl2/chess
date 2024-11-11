package input;

public class Field {
	private Figur figur;
	
	public Field(Figur figur) {
		this.figur = figur;
	}

	public Figur getFigur() {
		return this.figur;
	}
	
	public void setFigur(Figur figur) {
		this.figur = figur;
	}
	
	public void print() {
		if (figur == null) {
			System.out.print("_");
		} else {
			figur.print();
		}
	}
}
