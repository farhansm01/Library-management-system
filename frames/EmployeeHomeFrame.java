package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import entities.*;
import repositories.*;


public class EmployeeHomeFrame extends JFrame implements ActionListener
{
	
	private JButton clientBtn, bookBorrowBtn, bookReturnBtn, bookBtn, bookBorrowListBtn, bookReturnListBtn, profileBtn, passBtn;
	private JPanel panel;
	private User u;
	
	public EmployeeHomeFrame(User u)
	{
		super("Employee Home Frame");
		this.setSize(800,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.panel=new JPanel();
		this.panel.setLayout(null);
		
		
		this.bookBorrowBtn=new JButton("Borrow Book");
		this.bookBorrowBtn.setBounds(50,50,150,30);
		this.bookBorrowBtn.addActionListener(this);
		this.panel.add(bookBorrowBtn);
		
		
		this.bookReturnBtn=new JButton("Return Book");
		this.bookReturnBtn.setBounds(220,50,150,30);
		this.bookReturnBtn.addActionListener(this);
		this.panel.add(bookReturnBtn);
		
		this.clientBtn=new JButton("Client operation");
		this.clientBtn.setBounds(390,50,150,30);
		this.clientBtn.addActionListener(this);
		this.panel.add(clientBtn);
		
		this.bookBtn=new JButton("Book Operation");
		this.bookBtn.setBounds(50,100,150,30);
		this.bookBtn.addActionListener(this);
		this.panel.add(bookBtn);
		
		this.bookBorrowListBtn=new JButton("View Borrow List");
		this.bookBorrowListBtn.setBounds(220,100,150,30);
		this.bookBorrowListBtn.addActionListener(this);
		this.panel.add(bookBorrowListBtn);
		
		this.bookReturnListBtn=new JButton("View Borrow List");
		this.bookReturnListBtn.setBounds(390,100,150,30);
		this.bookReturnListBtn.addActionListener(this);
		this.panel.add(bookReturnListBtn);
		
		
		this.profileBtn=new JButton("Update Profile");
		this.profileBtn.setBounds(50,150,150,30);
		this.profileBtn.addActionListener(this);
		this.panel.add(profileBtn);
		
		this.passBtn=new JButton("Update Password");
		this.passBtn.setBounds(220,150,150,30);
		this.passBtn.addActionListener(this);
		this.panel.add(passBtn);
		
		
		
		
		
		this.add(panel);
		
		this.u=u;
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		/*String command=ae.getActionCommand();
		
		if(command.equals(bookBtn.getText()))
		{
			FacultySectionRegistrationFrame fsrf= new FacultySectionRegistrationFrame(this.u);
			this.setVisible(false);
			fsrf.setVisible(true);
		}*/
	}
	
}
