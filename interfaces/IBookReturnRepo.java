package interfaces;
import java.lang.*;
import entities.*;


public interface IBookReturnRepo
{
	void addBookReturn(BookReturn br);
	void removeBookReturn(String key);
	void updateBookReturn(BookReturn br);
	BookReturn searchBookReturnByBookReturnId(String id);
	BookReturn[] searchBookReturnByBookId(String id);
	BookReturn[] searchBookReturnByUserId(String id);
	BookReturn[] getAllBookReturn();
	
}