package entities;
import java.lang.*;

public class Employee extends User
{
	private String designation;
	private int salary;
	
	public Employee()
	{
		super();
	}
	
	public Employee(String userId, String name, String email, String phoneNo, String gender,int age, String address, int role,String securityAns, String password, String designation,int numberOfPapers, int salary)
	{
		super(userId, name, email, phoneNo, gender, age, address, role, securityAns, password);
		this.designation=designation;
		this.salary=salary;
	}
	
	public void setDesignation(String designation)
	{
		this.designation=designation;
	}
	
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	
	
	public String toStringEmployee()
	{
		String str=this.userId+","+this.name+","+this.email+","+this.phoneNo+","+this.gender+","+this.age+","+this.address+","+this.designation+","+","+this.salary+"\n";
		return str;
	}
	
	public Employee formEmployee(String str)
	{
		String[] info=str.split(",");
		Employee f=new Employee();
		f.setUserId(info[0]);
		f.setName(info[1]);
		f.setEmail(info[2]);
		f.setPhoneNo(info[3]);
		f.setGender(info[4]);
		f.setAge(Integer.parseInt(info[5]));
		f.setAddress(info[6]);
		f.setDesignation(info[7]);
		f.setSalary(Integer.parseInt(info[8]));
		
		return f;
	}
	
	
}