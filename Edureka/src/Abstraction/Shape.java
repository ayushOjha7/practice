package Abstraction;

abstract class Shape {
	
	String colour;
	
	void setColour(String colour) {
		this.colour=colour;
	}
	
	void getColour() {
		System.out.println("Colour is : "+colour);
	}

	abstract void area();

}
