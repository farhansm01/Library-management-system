package entities;
import java.lang.*;

public class BookReturn
{
	private String bookReturnId, bookId, userId, returnId ;
	
	public BookReturn()
	{
	}
	
	public BookReturn(String bookReturnId,String bookId, String userId, String returnId)
	{
		this.bookReturnId=bookReturnId;
		this.bookId=bookId;
		this.userId=userId;
		this.returnId=returnId;
		
	}
	
	public void setBookReturnId(String bookReturnId)
	{
		this.bookReturnId=bookReturnId;
	}
	
	public void setBookId(String bookId)
	{
		this.bookId=bookId;
	}
	
	public void setUserId(String userId)
	{
		this.userId=userId;
	}
	
	public void setReturnId(String returnId)
	{
		this.returnId=returnId;
	}
	
	public String getBookReturnId()
	{
		return this.bookReturnId;
	}
	
	public String getBookId()
	{
		return this.bookId;
	}
	
	public String getUserId()
	{
		return this.userId;
	}
	
	public String getReturnId()
	{
		return this.returnId;
	}
	
	public String toStringBookReturn()
	{
		String str=this.bookReturnId+","+this.bookId+","+this.userId+","+this.returnId+"\n";
		return str;
	}
	
	public BookReturn formBookReturn(String str)
	{
		String[] info=str.split(",");
		BookReturn br=new BookReturn();
		br.setBookReturnId(info[0]);
		br.setBookId(info[1]);
		br.setUserId(info[2]);
		br.setReturnId(info[3]);
		return br;
	}
}