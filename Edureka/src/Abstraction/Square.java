package Abstraction;

public class Square extends Shape {

	int side;float area;

	@Override
	void area() {
		area=side*side;	
		System.out.println("Area of Square is : "+area);
	}

	public Square(int side,String colour) {
		super();
		this.side = side;
		this.colour=colour;
	}
	

}
