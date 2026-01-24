class Vehical{
	int speed;
	
	Vehical(int speed){
		this.speed = speed;
	}
	
	void DisplayDetails(){
		System.out.println("The speed of: "+speed);
	}
	
	void start(){
		System.out.println("Vehical started!");
	}
}

class Car extends Vehical{
	
	Car(int speed){
		super(speed);
	}
	void DisplayDetails(){
		System.out.println("The Speed of: "+super.speed);
	}
	
	void PlayList(){
		System.out.println("Classic music");
	}
}
class Main{
	public static void main(String []args)
	{
		Car c1 = new Car(80);
		Vehical v1 = new Vehical(100);
		
		
		v1.start();
		c1.PlayList();
		c1.DisplayDetails();
		v1.DisplayDetails();
	}
}