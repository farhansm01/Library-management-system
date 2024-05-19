	package interfaces;
import java.lang.*;
import entities.*;


public interface IBookRepo
{
	void addBook(Book b);
	void removeBook(String key);
	void updateBook(Book b);
	Book searchBookByBookId(String id);
	Book[] getAllBook();
	
}