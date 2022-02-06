class FirstClass{

	int a=10;
	void display1() {
		System.out.println("In First class");
	}
}

class SecondClass extends FirstClass{
	int b=30;
	void display2() {
		super.display1();
		System.out.println("In Second class");
	}
}

public class InheritanceTest extends SecondClass {

	public static void main(String[] args) {
		
		InheritanceTest c=new InheritanceTest();
		
		System.out.println("A : "+c.a+" | B :"+c.b);
		c.display2();
		c.display1();
		
	}

}
