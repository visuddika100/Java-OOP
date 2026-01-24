public class Car{
	String name;
	String brand;
	int year;
	
	public Car(String n,String b,int y)
	{
		name = n;
		brand = b;
		year = y;
	}
	public void start(){
		System.out.println("car "+ name +" brand is "+ brand  +" and it staring "+ year);
	}
}
 class Main{
	public static void main(String[] args)
	{
		Car c1 = new Car("vessel","hybrid",1855);
		Car c2 = new Car("BMW","Honda", 1456);
		
		c1.start();
		c2.start();
	}
}