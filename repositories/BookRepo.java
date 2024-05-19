package repositories;
import java.lang.*;
import java.util.*;
import entities.*;
import interfaces.*;
public class BookRepo implements IBookRepo
{
	public void addBook(Book b)
	{
		Book[] bookList=this.getAllBook();
		
		for(int i=0;i<bookList.length;i++)
		{
			if(bookList[i]==null)
			{
				bookList[i]=b;
				break;
			}
		}
		
		this.write(bookList);
	}
	public void removeBook(String key)
	{
		Book[] bookList=this.getAllBook();
		
		for(int i=0;i<bookList.length;i++)
		{
			if(bookList[i]!=null)
			{
				if(bookList[i].getBookId().equals(key))
				{
					bookList[i]=null;
					break;
				}
			}
			
		}
		
		this.write(bookList);
	}
	public void updateBook(Book b)
	{
		Book[] bookList=this.getAllBook();
		
		for(int i=0;i<bookList.length;i++)
		{
			if(bookList[i]!=null)
			{
				if(bookList[i].getBookId().equals(b.getBookId()))
				{
					bookList[i]=b;
					break;
				}
			}
			
		}
		
		this.write(bookList);
	}
	public Book searchBookByBookId(String id)
	{
		Book[] bookList=this.getAllBook();
		
		for(int i=0;i<bookList.length;i++)
		{
			if(bookList[i]!=null)
			{
				if(bookList[i].getBookId().equals(id))
				{
					return bookList[i];
				}
			}
			
		}

		return null;
	}
	public Book[] getAllBook()
	{
		FileIO fio=new FileIO();
		String[] data= fio.readFile("repositories/data/book.txt");
		
		
		Book b=new Book();
		Book[] bookList=new Book[100];
		int i=0;
		for(String str:data)
		{
			
			if(str!=null)
			{
				System.out.println(str);
				bookList[i]=b.formBook(str);
				
			}
			
			i++;
		}
		
		return bookList;
	}
	
	public void write(Book[] bookList)
	{
		String[] data=new String[100];
		for(int i=0;i<100;i++)
		{
			if(bookList[i]!=null)
			{
				data[i]=bookList [i].toStringBook();
			}
			
		}
		FileIO fio=new FileIO();
		fio.writeFile(data, "repositories/data/book.txt");
	}
}