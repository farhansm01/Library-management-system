package entities;
import java.lang.*;

public class Book
{
	private String bookId, bookName, category, authorName, isbn, details ;
	private int noOfPage, price, availableQuantity;
	
	public Book()
	{
	}
	
	public Book(String bookId, String bookName, String category, String authorName, String isbn, String details, int noOfPage, int price, int availableQuantity)
	{
		this.bookId=bookId;
		this.bookName=bookName;
		this.category=category;
		this.authorName=authorName;
		this.isbn=isbn;
		this.details=details;
		this.noOfPage=noOfPage;
		this.price=price;
		this.availableQuantity=availableQuantity;
	}
	
	public void setBookId(String bookId)
	{
		this.bookId=bookId;
	}
	
	public void setBookName(String bookName)
	{
		this.bookName=bookName;
	}
	
	public void setCategory(String category)
	{
		this.category=category;
	}
	
	public void setAuthorName(String authorName)
	{
		this.authorName=authorName;
	}
	
	public void setIsbn(String isbn)
	{
		this.isbn=isbn;
	}
	
	public void setDetails(String details)
	{
		this.details=details;
	}
	
	public void setNoOfPage(int noOfPage)
	{
		this.noOfPage=noOfPage;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	public void setAvailableQuantity(int availableQuantity)
	{
		this.availableQuantity= availableQuantity;
	}
	
	
	public String getBookId()
	{
		return this.bookId;
	}
	
	public String getBookName()
	{
		return this.bookName;
	}
	
	public String getCategory()
	{
		return this.category;
	}
	
	public String getAuthorName()
	{
		return this.authorName;
	}
	
	public String getIsbn()
	{
		return this.isbn;
	}
	
	public String getDetails()
	{
		return this.details;
	}
	
	public int getNoOfPage()
	{
		return this.noOfPage;
	}
	
	public int getPrice()
	{
		return this.price;
	}
	
	public int getAvailableQuantity()
	{
		this.availableQuantity;
	}
	
	
	public String toStringBook()
	{
		String str=this.bookId+","+this.bookName+","+this.category+","+this.authorName+","+this.isbn+this.details+","+this.noOfPage+","+this.price+","+this.availableQuantity+"\n";
		return str;
	}
	
	public Book formBook(String str)
	{
		String[] info=str.split(",");
		Book b=new Book();
		b.setBookId(info[0]);
		b.setBookName(info[1]);
		b.setCategory(info[2]);
		b.setAuthorName(info[3]);
		b.setIsbn(info[4]);
		b.setDetails(info[5]);
		b.setNoOfPage(info[6]);
		b.setPrice(info[7]);
		b.setAvailableQuantity(info[8]);
		return b;
	}
}