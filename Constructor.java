class Car {
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void display() {
        System.out.println(brand + " - " + year);
    }
}
public class Main{
	public static void main (String[] arg)
	{
		Car c1 = new Car("Toyota", 2022);
		Car c2 = new Car("BMW", 2023);

		c1.display();
		c2.display();

	}
}