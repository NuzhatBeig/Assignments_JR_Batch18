package constructors;

public class Employee {
	
	public String name;
	public int employee_id;//I dont want this to be public but how do I access it from a subpackage then?
	public int salary;
	public String designation;
	public String ssn;//I tried to make it long but it didnt work?
	public int age;
	
	
    //create a constructor
	public Employee(String name,int employee_id){
		this.name = name;
		this.employee_id = employee_id;
		
	}
	
	public Employee(String assignedName,int assignedEmployee_id,int assignedSalary){
		this(assignedName,assignedEmployee_id);
		salary = assignedSalary;
		
		
	}
	public Employee(String name,int employee_id,int salary, String designation){
		this(name,employee_id,salary);
		this.designation = designation;
		
	}
	
	/*public Employee(String assignedName,int assignedEmployee_id, 
			int assignedSalary, String assignedDesignation){
		this(assignedName,assignedEmployee_id,assignedSalary);
		designation = assignedDesignation;
		
	}*/
	public Employee(String name,int employee_id,int salary, String designation , String ssn, int age){
		this(name,employee_id,salary,designation);
		this.ssn= ssn;	
		this.age = age;
		
		
	}

}
