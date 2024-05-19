	package interfaces;
import java.lang.*;
import entities.*;


public interface IBookBorrowRepo
{
	void addBookBorrow(BookBorrow bb);
	void removeBookBorrow(String key);
	void updateBookBorrow(BookBorrow bb);
	BookBorrow searchBookBorrowByBookBorrowId(String id);
	BookBorrow[] searchBookBorrowByBookId(String id);
	BookBorrow[] searchBookBorrowByUserId(String id);
	BookBorrow[] getAllBookBorrow();
	
}