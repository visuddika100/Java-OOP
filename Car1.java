public class Car1 {
    String brand;
    int year;

    Car1(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void display() {
        System.out.println(brand + " - " + year);
    }
}
 class Main{
	public static void main (String[] arg)
	{
		Car1 c1 = new Car1("Toyota", 2022);
		Car1 c2 = new Car1("BMW", 2023);

		c1.display();
		c2.display();

	}
}