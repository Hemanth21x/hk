package projects;

public class Book {
	int id;
	String name;
	String author;
	int quantity;
	
	public Book(int id,String name,String author,int quanity) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.quantity=quantity;
	}
	public void display() {
		System.out.println("Book Id : "+id);
		System.out.println("Book Name : "+name);
		System.out.println("Author : "+author);
		System.out.println("Quantity : "+quantity);
		System.out.println("--------------------------");
	}

}

public class LibaryManagement{
	static Book[] books=new Book[10];
	
	
	
}
