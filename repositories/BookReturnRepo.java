package repositories;
import java.lang.*;
import java.util.*;
import entities.*;
import interfaces.*;
public class BookReturnRepo implements IBookReturnRepo
{
	public void addBookReturn(BookReturn br)
	{
		BookReturn[] bookReturnList=this.getAllBookReturn();
		
		for(int i=0;i<bookReturnList.length;i++)
		{
			if(bookReturnList[i]==null)
			{
				bookReturnList[i]=br;
				break;
			}
		}
		
		this.write(bookReturnList);
	}
	public void removeBookReturn(String key)
	{
		BookReturn[] bookReturnList=this.getAllBookReturn();
		
		for(int i=0;i<bookReturnList.length;i++)
		{
			if(bookReturnList[i]!=null)
			{
				if(bookReturnList[i].getBookReturnId().equals(key))
				{
					bookReturnList[i]=null;
					break;
				}
			}
			
		}
		
		this.write(bookReturnList);
	}
	public void updateBookReturn(BookReturn br)
	{
		BookReturn[] bookReturnList=this.getAllBookReturn();
		
		for(int i=0;i<bookReturnList.length;i++)
		{
			if(bookReturnList[i]!=null)
			{
				if(bookReturnList[i].getBookReturnId().equals(br.getBookReturnId()))
				{
					bookReturnList[i]=br;
					break;
				}
			}
			
		}
		
		this.write(bookReturnList);
	}
	public BookReturn searchBookReturnByBookReturnId(String id)
	{
		BookReturn[] bookReturnList=this.getAllBookReturn();
		
		for(int i=0;i<bookReturnList.length;i++)
		{
			if(bookReturnList[i]!=null)
			{
				if(bookReturnList[i].getBookReturnId().equals(id))
				{
					return bookReturnList[i];
				}
			}
			
		}

		return null;
	}
	
	public BookReturn[] searchBookReturnByBookId(String id)
	{
		BookReturn[] bookReturnList=this.getAllBookReturn();
		BookReturn[] foundBookReturn=new BookReturn[100];
		
		for(int i=0;i<bookReturnList.length;i++)
		{
			if(bookReturnList[i]!=null)
			{
				if(bookReturnList[i].getBookId().equals(id))
				{
					foundBookReturn[i]=bookReturnList[i];
				}
			}
			
		}

		return foundBookReturn;
	}
	
	public BookReturn[] searchBookReturnByUserId(String id)
	{
		BookReturn[] bookReturnList=this.getAllBookReturn();
		BookReturn[] foundBookReturn=new BookReturn[100];
		
		for(int i=0;i<bookReturnList.length;i++)
		{
			if(bookReturnList[i]!=null)
			{
				if(bookReturnList[i].getUserId().equals(id))
				{
					foundBookReturn[i]=bookReturnList[i];
				}
			}
			
		}

		return foundBookReturn;
	}
	
	public BookReturn[] getAllBookReturn()
	{
		FileIO fio=new FileIO();
		String[] data= fio.readFile("repositories/data/bookReturn.txt");
		
		
		BookReturn br=new BookReturn();
		BookReturn[] bookReturnList=new BookReturn[100];
		int i=0;
		for(String str:data)
		{
			
			if(str!=null)
			{
				System.out.println(str);
				bookReturnList[i]=br.formBookReturn(str);
				
			}
			
			i++;
		}
		
		return bookReturnList;
	}
	
	public void write(BookReturn[] bookReturnList)
	{
		String[] data=new String[100];
		for(int i=0;i<100;i++)
		{
			if(bookReturnList[i]!=null)
			{
				data[i]=bookReturnList [i].toStringBookReturn();
			}
			
		}
		FileIO fio=new FileIO();
		fio.writeFile(data, "repositories/data/bookReturn.txt");
	}
}