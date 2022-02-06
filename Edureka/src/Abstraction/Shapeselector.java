package Abstraction;

public class Shapeselector {

	public static void main(String[] args) {

		Shape sh;
		
		sh=new Traingle(10,15,"Green");
		sh.area();
		sh.getColour();
		sh=new Circle(7,"red");
		sh.area();
		sh.getColour();
		sh=new Square(10,"blue");
		sh.area();
		sh.getColour();
	}

}
