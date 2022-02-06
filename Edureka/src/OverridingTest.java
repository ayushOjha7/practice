
class First{
	int a=10;
	void display() {
		System.out.println("In First class, A = "+a);
	}
}

class Second extends First{
	int a=20;
	@Override
	void display() {
		System.out.println("In Second class, A = "+this.a+" | From First class, A : "+super.a);
		super.display();
	}
}
public class OverridingTest {

	public static void main(String[] args) {
		Second sc=new Second();
		sc.display();	

	}
}
