package Singleton;

public class Employee {
	private Employee() {
		System.out.println("its me");
	}

	static Employee emp;
	public static Employee add() {
		if(emp==null) {
			emp=new Employee();
		}
		// TODO
		System.out.println(emp);
		return emp;

	}
	public static void main(String[] args) {
		 Employee add = Employee.add();
		 System.out.println(add);
	}
}
