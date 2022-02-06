package Abstraction;

public class Circle extends Shape {

	int radius;float area;

	@Override
	void area() {
		area=(float)3.14*radius;
		System.out.println("Area of Circle is : "+area);
	}

	public Circle(int radius,String colour) {
		super();
		this.radius = radius;
		this.colour=colour;				//via this()
	}
	

}
