
public class Employee {

	int empno;
	String name;
	float sal;
	
	 void setValue() {														// by method
		 empno=2;
		 name="Ayush";
		 sal=5000;	
	}
	
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		
		System.out.println(emp.empno+" | "+emp.name+" | "+emp.sal); 		// by reference
		System.out.println("=======================================");
		
		emp.empno=1;
		emp.name="Gaurav";
		emp.sal=2000;
		emp.displayDetails();
		System.out.println("=======================================");
		
		emp.setValue();
		emp.displayDetails();
	}

	private void displayDetails() {
		System.out.println(empno+" | "+name+" | "+sal);
	}


}
