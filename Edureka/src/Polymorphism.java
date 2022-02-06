class Parent{
	void display() {
		System.out.println("In Parent class");
	}
}

class Child extends Parent{
	void display() {
		System.out.println("In Child class");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
	
		Parent c = new Child();
		c.display();			//javap -c Polymorphism -->  // Method Parent.display() but in runtime child is called

	}

}
