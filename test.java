package my_library;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class test extends JFrame  {

	protected static final Component frame = null;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)  {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("          Admin Registration");
		lblNewLabel.setBounds(138, 11, 161, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("             Name :");
		lblNewLabel_1.setBounds(68, 50, 121, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("            Address 1 :");
		lblNewLabel_2.setBounds(68, 78, 138, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("            City :");
		lblNewLabel_3.setBounds(68, 103, 138, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("            Country :");
		lblNewLabel_4.setBounds(68, 128, 138, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("             Post Code :");
		lblNewLabel_5.setBounds(68, 153, 121, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("              Telephone :");
		lblNewLabel_6.setBounds(63, 178, 143, 14);
		contentPane.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(225, 50, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(225, 75, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(225, 100, 96, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(225, 125, 96, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(225, 150, 96, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(225, 175, 96, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
//		JButton btnNewButton = new JButton("CANCEL");
//		btnNewButton.setBounds(117, 214, 89, 23);
//		contentPane.add(btnNewButton);
//		
//		JButton btnNewButton_1 = new JButton("SUBMIT");
//		
//btnNewButton_1.setBounds(225, 214, 89, 23);
//contentPane.add(btnNewButton_1);
////		 ActionListener al = null;
////		    = new ActionListener() {
//		 btnNewButton_1.addActionListener((ActionListener) new ActionListener(){
//            public void actionPerformed(ActionEvent e) {
//                String namet = lblNewLabel_1.getText();
//                String addt = lblNewLabel_2.getText();
//                String cityt = lblNewLabel_3.getText();
//                String countryt = lblNewLabel_4.getText();
//                String pint = lblNewLabel_5.getText();
//                String telt = lblNewLabel_6.getText();
//      
////                System.out.println("Your user name is: "+namet);
////                System.out.println("Your user name is: "+addt);
////                System.out.println("Your user name is: "+cityt);
////                System.out.println("Your user name is: "+countryt);
////                System.out.println("Your user name is: "+pint);
////                System.out.println("Your user name is: "+telt);
//                
//                
//                if (namet.equals("mdtbz") && addt.equals("begur") && cityt.equals("bengaluru") && countryt.equals("india") 
//                		&& pint.equals("560068") && telt.equals("9886828564"))
//                {
//                	JOptionPane.showMessageDialog (frame, "Data registered Successfully");
//                	
//                	Issued_things newt = new Issued_things();
//                	newt.setVisible(true);
//                	
//                	test_1 hello = new test_1();
//                	hello.setVisible(true);
//                	
//                }
////                else
////	        	{
////	        		JOptionPane.showMessageDialog (frame, "Please enter missing fields");
////	        	}
//    }
//    });
////		 btnNewButton_1.addActionListener(al);
////	c.gridx = 1;
////	c.gridy = 9;
////	c.gridwidth = 5;
////	c.fill = GridBagConstraints.HORIZONTAL;
////	pane.add(submit, c);
////
////	frame.add(pane);
////	frame.pack();
////	submit.addActionListener(al);
////	frame.setVisible(true);
		
		
		
		
		
		
		
		
		
		JButton submit = new JButton("Create");
		 submit.setBounds(225, 214, 89, 23);
		  contentPane.add(submit);
//	    ActionListener al = null ;
//	    = new ActionListener() 
	    	submit.addActionListener((ActionListener) new ActionListener(){
	    	
	        public void actionPerformed(ActionEvent e) {

	        	String namet = lblNewLabel_1.getText();
              String addt = lblNewLabel_2.getText();
              String cityt = lblNewLabel_3.getText();
              String countryt = lblNewLabel_4.getText();
              String pint = lblNewLabel_5.getText();
              String telt = lblNewLabel_6.getText();
	        	
              if (namet.equals("mdtbz") && addt.equals("begur") && cityt.equals("bengaluru") && countryt.equals("india") 
              		&& pint.equals("560068") && telt.equals("9886828564"))
              {
              	JOptionPane.showMessageDialog (frame, "Data registered Successfully");
              	
              	Issued_things newt = new Issued_things();
              	newt.setVisible(true);
              	
//              	test_1 hello = new test_1();
//              	hello.setVisible(true);
              	
              }
//              else
//	        	{
//	        		JOptionPane.showMessageDialog (frame, "Please enter missing fields");
//	        	}
//	        
	        	
	        	
	   
	        	
//	        	JOptionPane.showMessageDialog (frame, "you are sucessfully logined");
//	        	JOptionPane.showMessageDialog (frame, "Invalid username or password");
//	        	btnLogin.setBounds (171, 197, 89, 23);
//	        	((JFrame) frame).getContentPane().add (submit);
	}
	});
//	    
//	    submit.addActionListener(al);
	    
	 
//		c.gridx = 1;
//		c.gridy = 9;
//		c.gridwidth = 5;
//		c.fill = GridBagConstraints.HORIZONTAL;
//		pane.add(submit, c);
//
//		frame.add(pane);
//		frame.pack();
//		submit.addActionListener(al);
//		frame.setVisible(true);
	        }
		}
		
