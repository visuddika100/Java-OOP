public class Book{
	String title;
	int price;
	
	Book(String title,int price)
	{
		this.title = title;
		this.price = price;
	}
	
	void showBook(){
		System.out.println("Book "+ title +" price is  "+ price); 
	}
	
	public static void main (String[] args)
	{
		Book B1 = new Book("Lovina",1400);
		
		B1.showBook();
	}
}