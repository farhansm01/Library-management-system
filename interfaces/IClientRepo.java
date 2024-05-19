package interfaces;
import java.lang.*;
import entities.*;


public interface IClientRepo
{
	void addClient(Client c);
	void removeClient(String key);
	void updateClient(Client c);
	Client searchClientByUserId(String id);
	Client[] getAllClient();
	
}