public class Car{
	String name;
	String brand;
	int year;
	
	Car(String n,String b,int y)
	{
		name = n;
		brand = b;
		year = y;
	}
	void start(){
		System.out.println("car "+ name +"brand is "+ brand  +"and it staring "+ year);
	}
}
public class Main{
	public static void main(String[] args)
	{
		Car c1 = new Car("vessel","hybrid",1855);
		
		c1.start();
	}
}