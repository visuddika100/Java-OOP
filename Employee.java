public class Employee {
	protected String name;
	protected int employeeId;


	public Employee(String name, int employeeId) {
	this.name = name;
	this.employeeId = employeeId;
	}


	public void displayDetails() {
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Name: " + name);
	}


	public double calculateSalary() {
		return 0.0;
	}
	public double calculateSalary(double basicSalary){
		return basicSalary;
	}
}

 class PermanentEmployee extends Employee{
	private double basicSalary;
	
	public PermanentEmployee(String name, int employeeId, double basicSalary) {
        super(name, employeeId);
        this.basicSalary = basicSalary;
	}
	
	@Override
	public double calculateSalary(){
		return basicSalary+(basicSalary*0.2);
	}
}

 class ContractEmployee extends Employee{
	private double hourlyRate;
	private int hoursWork;
	
	 public ContractEmployee(String name, int employeeId, double hourlyRate, int hoursWork) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWork = hoursWork;
	 }
	
	@Override
	public double calculateSalary(){
		return hourlyRate*hoursWork;
	}
}

class InternEmployee extends Employee{
	
	private int stipend;
	
	public InternEmployee(String name,int employeeId,int stipend){
		super(name,employeeId);
		this.stipend = stipend;
	}
	
	@Override
	public double calculateSalary(){
		return stipend;
	}
}


 class PayrollSystem {
	public static void main(String[] args) {
		
		Employee emp1 = new PermanentEmployee("Kamal.S Selva",0001,35000.00);
		Employee emp2 = new ContractEmployee("Siva.K Selva",0005,46.5,890);
		
		emp1.displayDetails();
		System.out.println("The salary:  "+emp1.calculateSalary());
		System.out.println();
		
		emp2.displayDetails();
		System.out.println("The salary: "+emp2.calculateSalary());
		System.out.println();
		
		
		Employee[] employees = new Employee[3];

        employees[0] = new PermanentEmployee("Charles", 103, 60000);
        employees[1] = new ContractEmployee("Diana", 104, 400, 35);
        employees[2] = new InternEmployee("Evan", 105, 15000);
		
		for(Employee emp : employees){
			emp.displayDetails();
			System.out.println("The Salary: "+emp.calculateSalary());
			System.out.println();
		}
	}
}