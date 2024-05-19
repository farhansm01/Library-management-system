package repositories;
import java.lang.*;
import java.util.*;
import entities.*;
import interfaces.*;
public class BookBorrowRepo implements IBookBorrowRepo
{
	public void addBookBorrow(BookBorrow bb)
	{
		BookBorrow[] bookBorrowList=this.getAllBookBorrow();
		
		for(int i=0;i<bookBorrowList.length;i++)
		{
			if(bookBorrowList[i]==null)
			{
				bookBorrowList[i]=bb;
				break;
			}
		}
		
		this.write(bookBorrowList);
	}
	public void removeBookBorrow(String key)
	{
		BookBorrow[] bookBorrowList=this.getAllBookBorrow();
		
		for(int i=0;i<bookBorrowList.length;i++)
		{
			if(bookBorrowList[i]!=null)
			{
				if(bookBorrowList[i].getBookBorrowId().equals(key))
				{
					bookBorrowList[i]=null;
					break;
				}
			}
			
		}
		
		this.write(bookBorrowList);
	}
	public void updateBookBorrow(BookBorrow bb)
	{
		BookBorrow[] bookBorrowList=this.getAllBookBorrow();
		
		for(int i=0;i<bookBorrowList.length;i++)
		{
			if(bookBorrowList[i]!=null)
			{
				if(bookBorrowList[i].getBookBorrowId().equals(bb.getBookBorrowId()))
				{
					bookBorrowList[i]=bb;
					break;
				}
			}
			
		}
		
		this.write(bookBorrowList);
	}
	public BookBorrow searchBookBorrowByBookBorrowId(String id)
	{
		BookBorrow[] bookBorrowList=this.getAllBookBorrow();
		
		for(int i=0;i<bookBorrowList.length;i++)
		{
			if(bookBorrowList[i]!=null)
			{
				if(bookBorrowList[i].getBookBorrowId().equals(id))
				{
					return bookBorrowList[i];
				}
			}
			
		}

		return null;
	}
	
	public BookBorrow[] searchBookBorrowByBookId(String id)
	{
		BookBorrow[] bookBorrowList=this.getAllBookBorrow();
		BookBorrow[] foundBookBorrow=new BookBorrow[100];
		
		for(int i=0;i<bookBorrowList.length;i++)
		{
			if(bookBorrowList[i]!=null)
			{
				if(bookBorrowList[i].getBookId().equals(id))
				{
					foundBookBorrow[i]=bookBorrowList[i];
				}
			}
			
		}

		return foundBookBorrow;
	}
	
	public BookBorrow[] searchBookBorrowByUserId(String id)
	{
		BookBorrow[] bookBorrowList=this.getAllBookBorrow();
		BookBorrow[] foundBookBorrow=new BookBorrow[100];
		
		for(int i=0;i<bookBorrowList.length;i++)
		{
			if(bookBorrowList[i]!=null)
			{
				if(bookBorrowList[i].getUserId().equals(id))
				{
					foundBookBorrow[i]=bookBorrowList[i];
				}
			}
			
		}

		return foundBookBorrow;
	}
	
	public BookBorrow[] getAllBookBorrow()
	{
		FileIO fio=new FileIO();
		String[] data= fio.readFile("repositories/data/bookBorrow.txt");
		
		
		BookBorrow bb=new BookBorrow();
		BookBorrow[] bookBorrowList=new BookBorrow[100];
		int i=0;
		for(String str:data)
		{
			
			if(str!=null)
			{
				System.out.println(str);
				bookBorrowList[i]=bb.formBookBorrow(str);
				
			}
			
			i++;
		}
		
		return bookBorrowList;
	}
	
	public void write(BookBorrow[] bookBorrowList)
	{
		String[] data=new String[100];
		for(int i=0;i<100;i++)
		{
			if(bookBorrowList[i]!=null)
			{
				data[i]=bookBorrowList [i].toStringBookBorrow();
			}
			
		}
		FileIO fio=new FileIO();
		fio.writeFile(data, "repositories/data/bookBorrow.txt");
	}
}