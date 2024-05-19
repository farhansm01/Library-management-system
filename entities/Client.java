package entities;
import java.lang.*;

public class Client extends User
{
	private String membershipType;
	
	public Client()
	{
		super();
	}
	
	public Client(String userId, String name, String email, String phoneNo, String gender,int age, String address, int role,String securityAns, String password, String membershipType)
	{
		super(userId, name, email, phoneNo, gender, age, address, role, securityAns, password);
		this.membershipType=membershipType;
	}
	
	public void setMembershipType(String membershipType)
	{
		this.membershipType=membershipType;
	}
	
	
	public String getMembershipType()
	{
		return this.membershipType;
	}
	
	
	public String toStringClient()
	{
		String str=this.userId+","+this.name+","+this.email+","+this.phoneNo+","+this.gender+","+this.age+","+this.address+","+this.membershipType+","+"\n";
		return str;
	}
	
	public Client formClient(String str)
	{
		String[] info=str.split(",");
		Client c=new Client();
		c.setUserId(info[0]);
		c.setName(info[1]);
		c.setEmail(info[2]);
		c.setPhoneNo(info[3]);
		c.setGender(info[4]);
		c.setAge(Integer.parseInt(info[5]));
		c.setAddress(info[6]);
		c.setMembershipType(info[7]);
		
		return c;
	}
	
	
}