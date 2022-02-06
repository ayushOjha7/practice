
class Firstt{
	int a=10;
	void display() {
		System.out.println("In First class, A = "+a);
	}
}

class Secondd extends Firstt{
	int b=20;
	@Override
	void display() {
		System.out.println("In Second class, B = "+this.b);
	}
}

class Thirdd extends Secondd{
	int c=30;
	@Override
	void display() {
		System.out.println("In Third class, C = "+this.c);
		System.out.println("A : "+super.a);
	}
}

public class Supertest {

	public static void main(String[] args) {
		Thirdd th=new Thirdd();
		th.display();	

	}
}
