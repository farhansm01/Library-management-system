package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import entities.*;
import repositories.*;


public class AdminHomeFrame extends JFrame implements ActionListener
{
	
	private JButton adminBtn, clientBtn, employeeBtn, bookBtn, bookBorrowBtn,bookReturnBtn, profileBtn, passBtn;
	private JPanel panel;
	private User u;
	
	public AdminHomeFrame(User u)
	{
		
		super("Admin Home Frame");
		this.setSize(800,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.panel=new JPanel();
		this.panel.setLayout(null);
		
		
		this.adminBtn=new JButton("Admin operation");
		this.adminBtn.setBounds(50,50,150,30);
		this.adminBtn.addActionListener(this);
		this.panel.add(adminBtn);
		
		this.clientBtn=new JButton("Client operation");
		this.clientBtn.setBounds(210,50,150,30);
		this.clientBtn.addActionListener(this);
		this.panel.add(clientBtn);
		
		this.employeeBtn=new JButton("Employee operation");
		this.employeeBtn.setBounds(370,50,150,30);
		this.employeeBtn.addActionListener(this);
		this.panel.add(employeeBtn);
		
		this.bookBtn=new JButton("View All Book");
		this.bookBtn.setBounds(530,50,150,30);
		this.bookBtn.addActionListener(this);
		this.panel.add(bookBtn);
		
		this.bookBorrowBtn=new JButton("View Borrow List");
		this.bookBorrowBtn.setBounds(50,100,150,30);
		this.bookBorrowBtn.addActionListener(this);
		this.panel.add(bookBorrowBtn);
		
		this.bookReturnBtn=new JButton("View Return List");
		this.bookReturnBtn.setBounds(210,100,150,30);
		this.bookReturnBtn.addActionListener(this);
		this.panel.add(bookReturnBtn);
		
		this.profileBtn=new JButton("Update Profile");
		this.profileBtn.setBounds(490,150,150,30);
		this.profileBtn.addActionListener(this);
		this.panel.add(profileBtn);
		
		this.passBtn=new JButton("Update Password");
		this.passBtn.setBounds(660,150,130,30);
		this.passBtn.addActionListener(this);
		this.panel.add(passBtn);
		
		
		
		
		
		this.add(panel);
		this.u=u;
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String command=ae.getActionCommand();
		
		if(command.equals(adminBtn.getText()))
		{
			AdminOperationFrame aof=new AdminOperationFrame(this.u);
			this.setVisible(false);
			aof.setVisible(true);
		}
		
		if(command.equals(clientBtn.getText()))
		{
			ClientOperationFrame cof=new ClientOperationFrame(this.u);
			this.setVisible(false);
			cof.setVisible(true);
		}
		
		if(command.equals(employeeBtn.getText()))
		{
			EmployeeOperationFrame eof=new EmployeeOperationFrame(this.u);
			this.setVisible(false);
			eof.setVisible(true);
		}
		
		/*if(command.equals(profileBtn.getText()))
		{
			AdminUpdateProfileFrame aof=new AdminUpdateProfileFrame(this.u);
			this.setVisible(false);
			aof.setVisible(true);
		}
		
		/*if(command.equals(passBtn.getText()))
		{
			AdminUpdatePasswordFrame aof=new AdminUpdatePasswordFrame(this.u);
			this.setVisible(false);
			aof.setVisible(true);
		}*/
		
		
		
	}
	
}
