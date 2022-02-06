package Abstraction;

public class Traingle extends Shape {

	int length,base;float area;

	@Override
	void area() {
		area=(float)0.5*length*base;	
		System.out.println("Area of Triangle is : "+area);
	}

	public Traingle(int length, int base, String colour) {
		super();
		this.length = length;
		this.base = base;
		super.setColour(colour);			//via super()
	}
	

}
