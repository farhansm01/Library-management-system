package entities;
import java.lang.*;

public class BookBorrow
{
	private String bookBorrowId, bookId, userId, borrowDate ;
	
	public BookBorrow()
	{
	}
	
	public BookBorrow(String bookBorrowId,String bookId, String userId, String borrowDate)
	{
		this.bookBorrowId=bookBorrowId;
		this.bookId=bookId;
		this.userId=userId;
		this.borrowDate=borrowDate;
		
	}
	
	public void setBookBorrowId(String bookBorrowId)
	{
		this.bookBorrowId=bookBorrowId;
	}
	
	public void setBookId(String bookId)
	{
		this.bookId=bookId;
	}
	
	public void setUserId(String userId)
	{
		this.userId=userId;
	}
	
	public void setBorrowDate(String borrowDate)
	{
		this.borrowDate=borrowDate;
	}
	
	public String getBookBorrowId()
	{
		return this.bookBorrowId;
	}
	
	public String getBookId()
	{
		return this.bookId;
	}
	
	public String getUserId()
	{
		return this.userId;
	}
	
	public String getBorrowDate()
	{
		return this.borrowDate;
	}
	
	public String toStringBookBorrow()
	{
		String str=this.bookBorrowId+","+this.bookId+","+this.userId+","+this.borrowDate+"\n";
		return str;
	}
	
	public BookBorrow formBookBorrow(String str)
	{
		String[] info=str.split(",");
		BookBorrow bb=new BookBorrow();
		bb.setBookBorrowId(info[0]);
		bb.setBookId(info[1]);
		bb.setUserId(info[2]);
		bb.setBorrowDate(info[3]);
		return bb;
	}
}