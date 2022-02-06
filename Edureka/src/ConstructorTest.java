
public class ConstructorTest {

	int empno;
	String name;
	float sal;
	
	 void setValue() {														// by method
		 empno=2;
		 name="Kumar";
		 sal=5000;	
	}
	 ConstructorTest(){
		 empno=0;
		 name="BLANK";
		 sal=(float)0.0;
		 displayDetails();
		 System.out.println("==============================");
	 }
	
	public static void main(String[] args) {
		
		ConstructorTest emp1=new ConstructorTest();
		ConstructorTest emp2=new ConstructorTest();
		ConstructorTest emp3=new ConstructorTest();
		
		
		System.out.println("************************");
		System.out.println(emp1.empno+" | "+emp1.name+" | "+emp1.sal); 		// by reference
		System.out.println("==================================");
		
		emp2.empno=1;
		emp2.name="Gaurav";
		emp2.sal=2000;
		emp2.displayDetails();
		System.out.println("=======================================");
		
		emp3.setValue();
		emp3.displayDetails();
	}

	private void displayDetails() {
		System.out.println(empno+" | "+name+" | "+sal);
	}


}
