package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import entities.*;
import repositories.*;

public class ClientOperationFrame extends JFrame implements ActionListener
{
	private JLabel userIdLabel,nameLabel, emailLabel, phoneNoLabel, genderLabel, ageLabel, addressLabel, securityQuesLabel, securityAnsLabel, passLabel, membershipTypeLabel;
	private JTextField userTF, nameTF, emailTF, phoneNoTF, ageTF, addressTF, securityAnsTF;
	private JPasswordField passPF;
	private JRadioButton maleRB, femaleRB;
	private ButtonGroup bg;
	private JComboBox membershipTypeCMB;
	private JButton addBtn, removeBtn, updateBtn, resetBtn,searchBtn, backBtn;
	private JTable clientTable;
	private JScrollPane clientTableSP;
	private JPanel panel;
	private User u;
	
	
	
	public ClientOperationFrame(User u)
	{
		super("Client Operation Frame");
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.panel=new JPanel();
		this.panel.setLayout(null);
		
		this.userIdLabel=new JLabel("User Id:");
		this.userIdLabel.setBounds(50,50,60,30);
		this.panel.add(userIdLabel);
		
		this.userTF=new JTextField();
		this.userTF.setBounds(120,50,100,30);
		this.panel.add(userTF);
		
		this.nameLabel=new JLabel("Name:");
		this.nameLabel.setBounds(50,100,60,30);
		this.panel.add(nameLabel);
		
		this.nameTF=new JTextField();
		this.nameTF.setBounds(120,100,100,30);
		this.panel.add(nameTF);
		
		this.emailLabel=new JLabel("email:");
		this.emailLabel.setBounds(50,150,60,30);
		this.panel.add(emailLabel);
		
		this.emailTF=new JTextField();
		this.emailTF.setBounds(120,150,100,30);
		this.panel.add(emailTF);
		
		this.phoneNoLabel=new JLabel("phone No:");
		this.phoneNoLabel.setBounds(50,200,60,30);
		this.panel.add(phoneNoLabel);
		
		this.phoneNoTF=new JTextField();
		this.phoneNoTF.setBounds(120,200,100,30);
		this.panel.add(phoneNoTF);
		
		this.genderLabel=new JLabel("Gender:");
		this.genderLabel.setBounds(50,250,60,30);
		this.panel.add(genderLabel);
		
		this.maleRB=new JRadioButton("Male");
		this.maleRB.setBounds(120,250,60,30);
		this.panel.add(maleRB);
		
		this.femaleRB=new JRadioButton("Female");
		this.femaleRB.setBounds(190,250,80,30);
		this.panel.add(femaleRB);
		
		this.bg=new ButtonGroup();
		bg.add(maleRB);
		bg.add(femaleRB);
		
		this.ageLabel=new JLabel("Age:");
		this.ageLabel.setBounds(50,300,60,30);
		this.panel.add(ageLabel);
		
		this.ageTF=new JTextField();
		this.ageTF.setBounds(120,300,100,30);
		this.panel.add(ageTF);
		
		this.addressLabel=new JLabel("Address:");
		this.addressLabel.setBounds(280,50,60,30);
		this.panel.add(addressLabel);
		
		this.addressTF=new JTextField();
		this.addressTF.setBounds(350,50,100,30);
		this.panel.add(addressTF);
		
		this.securityQuesLabel=new JLabel("Security Ques: What is your pet name?:");
		this.securityQuesLabel.setBounds(280,100,300,30);
		this.panel.add(securityQuesLabel);
		
		this.securityAnsLabel=new JLabel("Security Ans:");
		this.securityAnsLabel.setBounds(280,150,100,30);
		this.panel.add(securityAnsLabel);
		
		this.securityAnsTF=new JTextField();
		this.securityAnsTF.setBounds(390,150,100,30);
		this.panel.add(securityAnsTF);
		
		this.passLabel=new JLabel("Password:");
		this.passLabel.setBounds(280,200,100,30);
		this.panel.add(passLabel);
		
		this.passPF=new JPasswordField();
		this.passPF.setBounds(390,200,100,30);
		this.panel.add(passPF);
		
		this.membershipTypeLabel=new JLabel("Client Type:");
		this.membershipTypeLabel.setBounds(280,250,100,30);
		this.panel.add(membershipTypeLabel);
		
		String[] item={"Hr Client", "Academic Client"};
		this.membershipTypeCMB=new JComboBox(item);
		this.membershipTypeCMB.setBounds(390,250,200,30);
		this.panel.add(membershipTypeCMB);
		
		this.addBtn=new JButton("Add Client");
		this.addBtn.setBounds(50,350,100,30);
		this.addBtn.addActionListener(this);
		this.panel.add(addBtn);
		
		this.updateBtn=new JButton("update Client");
		this.updateBtn.setBounds(160,350,120,30);
		this.updateBtn.addActionListener(this);
		this.panel.add(updateBtn);
		
		this.removeBtn=new JButton("remove Client");
		this.removeBtn.setBounds(290,350,120,30);
		this.removeBtn.addActionListener(this);
		this.panel.add(removeBtn);
		
		this.searchBtn=new JButton("search Client");
		this.searchBtn.setBounds(420,350,120,30);
		this.searchBtn.addActionListener(this);
		this.panel.add(searchBtn);
		
		this.resetBtn=new JButton("Reset");
		this.resetBtn.setBounds(550,350,100,30);
		this.resetBtn.addActionListener(this);
		this.panel.add(resetBtn);
		
		this.backBtn=new JButton("back");
		this.backBtn.setBounds(660,350,100,30);
		this.backBtn.addActionListener(this);
		this.panel.add(backBtn);
		//getting all the clients info in Client type array
		ClientRepo arp=new ClientRepo();
		Client[] clientList=arp.getAllClient();
		//converting the Client type array in 2d String type array to put the values in the table beacuse in table there will be tow dimention. one is row, other one is colomn.
		String clientData1[][]=new String[clientList.length][8];
		for(int i=0;i<clientList.length;i++)
		{
		
			if(clientList[i]!=null)
			{
				System.out.println(clientList[i].toStringClient());
				clientData1[i][0]=clientList[i].getUserId();
				clientData1[i][1]=clientList[i].getName();
				clientData1[i][2]=clientList[i].getEmail();
				clientData1[i][3]=clientList[i].getPhoneNo();
				clientData1[i][4]=clientList[i].getGender();
				clientData1[i][5]=String.valueOf(clientList[i].getAge());
				clientData1[i][6]=clientList[i].getAddress();
				clientData1[i][7]=clientList[i].getMembershipType();
			}
			
			
			
		}
		//creating Table.
		//head1 is the colomn name;
		String head1[]={"Id","Name","Email","PhoneNo","Gender","Age","Adress","ClientType"};
		//putting value and colomn name in the table.
		this.clientTable=new JTable(clientData1,head1);
		//adding scrolling bar in the table
		this.clientTableSP=new JScrollPane(clientTable);
		this.clientTableSP.setBounds(50,380,700,200);
		this.clientTable.setEnabled(false);
		this.panel.add(clientTableSP);
		
		this.panel.revalidate();
		this.panel.repaint();
		
		this.add(panel);
		
		this.u=u;
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String command=ae.getActionCommand();
		
		if(command.equals(addBtn.getText()))
		{
			String userId,name,email,phoneNo,gender,address,securityAns,pass,membershipType;
			int age;
			//validating every field has data or not
			if((!userTF.getText().isEmpty()) && (!nameTF.getText().isEmpty()) && (!emailTF.getText().isEmpty()) && (!phoneNoTF.getText().isEmpty()) &&((maleRB.isSelected()) || (femaleRB.isSelected())) && (!ageTF.getText().isEmpty()) && (!addressTF.getText().isEmpty())&& (!securityAnsTF.getText().isEmpty()) && (!passPF.getText().isEmpty()))
			{
				//storing userTF (userID) in userId variable
				userId=userTF.getText();
				//creating a UserRepo object to perform operation in the user.txt file where we stored user login information
				UserRepo urp=new UserRepo();
				//checking whether the provide user id is unique or already assign to another user.
				User user=urp.searchUserByUserId(userId);
				// if the provided userId is unique, no User type object will be found in the user.txt file.
				//if no user if assign with the userId then we can use the userId for creating new client.
				if(user==null)
				{
					//using try catch block, so that, any type of exception can be handled. here we have a age value, which is expected to be integer.
					//but user can put string value to age varible which might cause exception.
					//to handle such exception we are using try catch block.
					try
					{
						//asign nameTF textfField value to a name variable.
						name=nameTF.getText();
						//asign emailTF textfField value to a email variable.
						email=emailTF.getText();
						//asign phoneNoTF textfField value to a phoneNo variable.
						phoneNo=phoneNoTF.getText();
						// to get gender, we use RadioButton. now to know which radioButton is selected,
						//we are applying conditions if maleRB is selected, gender variable will be assigned as maleRB's value.
						//if femaleRB is selected, gender variable will be assigned as femaleRB's value.
						//or by default maleRB's value will be assigned.
						if(maleRB.isSelected())
						{
							gender=maleRB.getText();
						}
				
						else if(femaleRB.isSelected())
						{
							gender=femaleRB.getText();
						}
				
						else
						{
							gender=maleRB.getText();
						}
						//asign ageTF textfField value to a age variable. But before assigning we have to convert the ageTF value to integer as our age varibale's expected value is integer.
						age=Integer.parseInt(ageTF.getText());
						//asign addressTF textfField value to a address variable.
						address=addressTF.getText();
						//asign role. As all the Client will have the same role, we won't have to take this value from user.
						//For client the role will be 1.
						int role=3;
						//asign securityAnsTF textfField value to a securityAns variable.
						securityAns=securityAnsTF.getText();
						//asign passPF PassField value to a pass variable.
						pass=passPF.getText();
						//asign membershipTypeCMB comboBox value to a membershipType variable.
						membershipType=membershipTypeCMB.getSelectedItem().toString();
						//Creating a client type variable with all the values that we get from the fields.
						Client a=new Client(userId,name,email,phoneNo,gender,age,address,role,securityAns,pass,membershipType);
						//to add client's user id, security ans, role and pass information in the user.txt file. as without data in the user.txt file, no user will be able to login in.
						//passing client type object to a userRepo. here polymorphic behaviour of object is used.
						urp.addUser(a);
						//creating a ClientRepo object to perform operation in the client.txt file where we stored clients information
						ClientRepo arp=new ClientRepo();
						//to add client's information in the client.txt file. because all the clients information will be stored there.
						arp.addClient(a);
						//After successful add operation a confirmation message will be shown.
						JOptionPane.showMessageDialog(this,"client added Successfully");
					}
					catch(Exception e)
					{
						//if any exception occured in the above operation, it is beacuse of string to int convertion.
						JOptionPane.showMessageDialog(this,"provide valid age");
					}
				}
				
				else
				{
					//if the provided userId is already assign to any user, this message will be shown.
					JOptionPane.showMessageDialog(this,"User Id already exists.");
				}
		
			}
			else
			{
				//if any of the field is empty, this message will be shown.
				JOptionPane.showMessageDialog(this,"please fill up all the field properly");
			}
			
		}
		
		if(command.equals(updateBtn.getText()))
		{
			
			String userId,name,email,phoneNo,gender,address,membershipType;
			int age;
			//validating every field has data or not
			if((!userTF.getText().isEmpty()) && (!nameTF.getText().isEmpty()) && (!emailTF.getText().isEmpty()) && (!phoneNoTF.getText().isEmpty()) &&((maleRB.isSelected()) || (femaleRB.isSelected())) && (!ageTF.getText().isEmpty()) && (!addressTF.getText().isEmpty()))
			{
				//storing userTF (userID) in userId variable
				userId=userTF.getText();
				//creating a ClientRepo object to perform operation in the client.txt file where we stored clients information
				ClientRepo arp=new ClientRepo();
				//checking wether the userId is associated with any client or not.
				//if associated searchClientByUserId will return an object of client type
				Client a=arp.searchClientByUserId(userId);
				//if a varible has any client object then next step will be performed. if null, that means no valid client is associated with the userId.
				if(a!=null)
				{
					//using try catch block, so that, any type of exception can be handled. here we have a age value, which is expected to be integer.
					//but user can put string value to age varible which might cause exception.
					//to handle such exception we are using try catch block.
					try
					{
						//asign updated nameTF textfField value to a name variable.
						name=nameTF.getText();
						//asign upated emailTF textfField value to a email variable.
						email=emailTF.getText();
						//asign upated phoneNo textfField value to a phoneNo variable.
						phoneNo=phoneNoTF.getText();
						// to get gender, we use RadioButton. now to know which radioButton is selected,
						//we are applying conditions if maleRB is selected, gender variable will be assigned as maleRB's value.
						//if femaleRB is selected, gender variable will be assigned as femaleRB's value.
						//or by default maleRB's value will be assigned.
						if(maleRB.isSelected())
						{
							gender=maleRB.getText();
						}
				
						else if(femaleRB.isSelected())
						{
							gender=femaleRB.getText();
						}
				
						else
						{
							gender=maleRB.getText();
						}
						//asign updated ageTF textfField value to a age variable. But before assigning we have to convert the ageTF value to integer as our age varibale's expected value is integer.
						age=Integer.parseInt(ageTF.getText());
						//asign updated addressTF textfField value to a address variable.
						address=addressTF.getText();
						//asign updated membershipTypeCMB comboBox value to a membershipType variable
						membershipType=membershipTypeCMB.getSelectedItem().toString();
					
						//we are modifying the attributes of client type object that we get by searing client by userId.
						a.setName(name);
						a.setEmail(email);
						a.setPhoneNo(phoneNo);
						a.setGender(gender);
						a.setAge(age);
						a.setAddress(address);
						a.setMembershipType(membershipType);
						//doing update operation by ClientRepo's object arp.
						arp.updateClient(a);
						//updation confirmation message.
						JOptionPane.showMessageDialog(this,"client updated Successfully");
					}
					catch(Exception e)
					{
						//if any exception occured in the above operation, it is beacuse of string to int convertion.
						JOptionPane.showMessageDialog(this,"provide valid age");
					}
				}
				
				else
				{
					//if any exception occured in the above operation, it is beacuse of string to int convertion.
					JOptionPane.showMessageDialog(this,"provide Valid user ID");
				}
		
			}
			else
			{
				//if any of the field is empty, this message will be shown.
				JOptionPane.showMessageDialog(this,"please fill up all the field properly");
			}
		}
		
		if(command.equals(removeBtn.getText()))
		{
			String userId;
			//to delete client we need to have the user id.
			//validating userTF has data or not
			if(!userTF.getText().isEmpty()) 
			{
				//storing userTF (userID) in userId variable
				userId=userTF.getText();
				//creating a ClientRepo object to perform operation in the client.txt file where we stored clients information
				ClientRepo arp=new ClientRepo();
				//checking wether the userId is associated with any client or not.
				//if associated searchClientByUserId will return an object of client type
				Client a=arp.searchClientByUserId(userId);
				//if we get an client associated with the id, we can perform the next steps.
				if(a!=null)
				{
					//if we want to delete an client, first we have to delete that client's login credentials which is stored in the user.txt file.
					//creating a UserRepo object to perform operation in the user.txt file where we stored user's login information
					UserRepo urp=new UserRepo();
					//to remove client's login information from user.txt, we have use the remove user functionality provided by UserRepo.
					urp.removeUser(userId);
					//removing client from client.txt.
					arp.removeClient(userId);
					//confirmation message of client remove operation
					JOptionPane.showMessageDialog(this,"Client removed Successfully");
				}
				
				else
				{
					JOptionPane.showMessageDialog(this,"provide Valid user ID");
				}
		
			}
			else
			{
				JOptionPane.showMessageDialog(this,"please Provide a valid userId");
			}
		}
		
		if(command.equals(searchBtn.getText()))
		{
			String userId;
			//to search client we need to have the user id.
			//validating userTF has data or not
			if(!userTF.getText().isEmpty())
			{
				//storing userTF (userID) in userId variable
				userId=userTF.getText();
				//creating a ClientRepo object to perform operation in the client.txt file where we stored clients information
				ClientRepo urp=new ClientRepo();
				//checking wether the userId is associated with any client or not.
				//if associated searchClientByUserId will return an object of client type
				Client a=urp.searchClientByUserId(userId);
				//if we get an client associated with the id, we can perform the next steps.
				if(a!=null)
				{
					//making userTF textField readonly. beacuse after search, update or delete operation will be performed.
					// to avoid user from modifying userId, we make it readonly.
					userTF.setEditable(false);
					//setting the client's name in the nameTF textField that we found by searching.
					nameTF.setText(a.getName());
					//setting the client's email in the emailTF textField that we found by searching. 
					emailTF.setText(a.getEmail());
					//setting the client's phoneNo in the nameTF textField that we found by searching.
					phoneNoTF.setText(a.getPhoneNo());
					//setting the client's gender in the maleRB or femaleRB radioButton that we found by searching. 
					if(a.getGender().equals("Male"))
					{
						maleRB.setSelected(true);
					}
					
					else
					{
						femaleRB.setSelected(true);
					}
					//setting the client's membershipType in the membershipTypeCMB comboBox that we found by searching.
					if(a.getMembershipType().equals("Hr Client"))
					{
						membershipTypeCMB.setSelectedItem("Hr Client");
					}
					else
					{
						membershipTypeCMB.setSelectedItem("Academic Client");
					}
					//setting the client's age in the ageTF textField that we found by searching.
					ageTF.setText(String.valueOf(a.getAge()));
					//setting the client's address in the addressTF textField that we found by searching.
					addressTF.setText(a.getAddress());
					//Confirmation message if client is found.
					JOptionPane.showMessageDialog(this,"client found");
				}
				
				else
				{
					//confirmation message if client is not found.
					JOptionPane.showMessageDialog(this,"client not found");
				}
			}
			
			else
			{
				//if no id is assign to perform the search operation.
				JOptionPane.showMessageDialog(this,"Please provide userId to search client.");
			}
			
		}
		
		if(command.equals(resetBtn.getText()))
		{
			//reseting all the field values.
			//making userId textField editable again.
			userTF.setEditable(true);
			userTF.setText("");
			nameTF.setText("");
			emailTF.setText("");
			phoneNoTF.setText("");
			ageTF.setText("");
			addressTF.setText("");
			securityAnsTF.setText("");
			passPF.setText("");
			JOptionPane.showMessageDialog(this,"reset successfully");
		}
		
		if(command.equals(backBtn.getText()))
		{
			//back button will take you to client home page.
			ClientHomeFrame adf=new ClientHomeFrame(this.u);
			this.setVisible(false);
			adf.setVisible(true);
		}
	}
	
}