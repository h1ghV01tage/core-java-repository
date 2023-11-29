package corejava;

public class Employee implements Cloneable {

	//declare the fields
	private String firstName;
	private String lastName;
	private double salary;
	public Address address;
	
	//declare the koncstuctor
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Employee() {
		
	}
	
	//override the toString method
	public String toString() {
		
		return this.getClass().getName() + "[" + this.firstName + " " + this.lastName + "]";
		
	}
	
	//declare the getters
	public String getFirstName() {
		
		return this.firstName;
		
	}
	
	public String getLastName() {
		
		return this.lastName;
	}
	
	//write the proper equals method
	public boolean equals(Object object) {
		
		//an object must equal itself
		if(this == object) return true;
		
		//no object equals null
		if(object == null) return false;
		
		//objects of different types are never equal
		if(this.getClass() != object.getClass()) return false;
		
		//cast to an employee and compare the fields
		Employee employee = (Employee)object;
		return this.lastName.equals(employee.getLastName())
				&& this.firstName.equals(employee.getFirstName());
		
		
	}

	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		this.lastName = lastName;
		
	}

	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		this.firstName = firstName;
	}

	public void setSalary(double salary) {
		// TODO Auto-generated method stub
		this.salary = salary;
	}
	
	//first we use the custom clone method then we use the clone method offered by the cloneable interface
	
	public Object clone() throws CloneNotSupportedException {
		
		/*
		 * Employee emp = new Employee(this.lastName, this.firstName);
		emp.setSalary(this.salary);
		return emp;
		 */
		Employee emp = new Employee();
		emp = (Employee) super.clone();
		return emp;
		
	}

	public Double getSalary() {
		// TODO Auto-generated method stub
		return this.salary;
	}
	
}
