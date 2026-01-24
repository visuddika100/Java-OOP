public class Getter {
	private String name;
	private double salary;
	
	void setName(String name){
		this.name=name;
	}
	
    String getName(){
		 return name;
	}
	
	void setSalary(double salary){
		if(salary>0){
			this.salary=salary;
			System.out.println("Salary: "+salary);
		}
		else{
			System.out.println("Salary must be less than 0");
		}
	}
	
	double getSalary(){
		return salary;
	}
	
}

class Main{
	public static void main(String[] args){
		
		Getter e1 = new Getter();
		
		e1.setSalary(40000);
		e1.setName("Kavin");
		System.out.println("The Employee name: "+e1.getName());
	}
}