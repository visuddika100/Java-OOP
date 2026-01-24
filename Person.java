class Person{
	String name;
	
	Person(String name){
		this.name = name;
	}
	
	void showName(){
		System.out.println("Name is: "+ name);
	}
}

class Student extends Person{
	int rollNumber;
	
	Student(int rollNumber,String name){
		super(name);
		this.rollNumber = rollNumber;
		
	}
	
	void showStudent(){
		System.out.println("The roll number is: "+rollNumber);
	}
}

class Main{
	public static void main(String[] args)
	{
		Student s1 = new Student(0005,"Kamal");
		
		s1.showName();
		s1.showStudent();
	}
}