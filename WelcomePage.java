import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.JComboBox;

public class WelcomePage {

	private JFrame frame;
	private JTextField StudentNumber;
	private JTextField FirstName;
	private JTextField LastName;

	/**
	 * Launch the application.
	 */
	public static void newFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage window = new WelcomePage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WelcomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 673, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Number:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(92, 129, 140, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFirstName.setBounds(92, 178, 140, 51);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLastName.setBounds(92, 226, 140, 51);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblStudentType = new JLabel("Student Type:");
		lblStudentType.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStudentType.setBounds(92, 276, 140, 51);
		frame.getContentPane().add(lblStudentType);
		
		JLabel lblCourse = new JLabel("Course:");
		lblCourse.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCourse.setBounds(92, 328, 140, 51);
		frame.getContentPane().add(lblCourse);
		
		StudentNumber = new JTextField();
		StudentNumber.setBounds(236, 129, 240, 37);
		frame.getContentPane().add(StudentNumber);
		StudentNumber.setColumns(10);
		
		FirstName = new JTextField();
		FirstName.setColumns(10);
		FirstName.setBounds(236, 178, 240, 37);
		frame.getContentPane().add(FirstName);
		
		LastName = new JTextField();
		LastName.setColumns(10);
		LastName.setBounds(236, 226, 240, 37);
		frame.getContentPane().add(LastName);
		
		JComboBox Course = new JComboBox();
		Course.setFont(new Font("Tahoma", Font.BOLD, 15));
		Course.setBounds(238, 328, 238, 37);
		frame.getContentPane().add(Course);
		Course.addItem("Choose a Course");
		Course.addItem("Tourism");
		Course.addItem("Computer Science");
		Course.addItem("Engineering");
		Course.addItem("Nursing");
		Course.addItem("Architecture");
		
		JComboBox StudentType = new JComboBox();
		StudentType.setFont(new Font("Tahoma", Font.BOLD, 15));
		StudentType.setBounds(238, 276, 238, 37);
		frame.getContentPane().add(StudentType);
		StudentType.addItem("Choose a Type");
		StudentType.addItem("Gold");
		StudentType.addItem("Blue");
		StudentType.addItem("White");
		StudentType.addItem("Continuing");
		StudentType.addItem("Walk-In");
		
		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double TF = 0;
				double Mc = 0;
				double fee = 0;
				if(Course.getSelectedItem().toString().equals("Tourism")) {
					TF = 10000;
					Mc = 22500;
					if(StudentType.getSelectedItem().toString().equals("Gold")) {
						fee = ((TF + Mc)-((TF + Mc)*0.5));
					} else if(StudentType.getSelectedItem().toString().equals("Blue")){
						fee = ((TF + Mc)-((TF + Mc)*0.3));
					} else if(StudentType.getSelectedItem().toString().equals("White")){
						fee = ((TF + Mc)-((TF + Mc)*0.2));
					} else if(StudentType.getSelectedItem().toString().equals("Walk-In")){
						fee = TF + Mc;
					} else if(StudentType.getSelectedItem().toString().equals("Continuing")){
						fee = ((TF + Mc)-(TF*0.1));
					} else { JOptionPane.showMessageDialog(null,fee);}
					
					JOptionPane.showMessageDialog(null,"Your Tuition Fee: " + TF + "\nYour Miscellaneous Fee: " + Mc + "\nYour Total is: " + fee);
					return;
					
				} else if(Course.getSelectedItem().toString().equals("Computer Science")){
					TF = 20000;
					Mc = 11000;
					if(StudentType.getSelectedItem().toString().equals("Gold")) {
						fee = ((TF + Mc)-((TF + Mc)*0.5));
					} else if(StudentType.getSelectedItem().toString().equals("Blue")){
						fee = ((TF + Mc)-((TF + Mc)*0.3));
					} else if(StudentType.getSelectedItem().toString().equals("White")){
						fee = ((TF + Mc)-((TF + Mc)*0.2));
					} else if(StudentType.getSelectedItem().toString().equals("Walk-In")){
						fee = TF + Mc;
					} else if(StudentType.getSelectedItem().toString().equals("Continuing")){
						fee = ((TF + Mc)-(TF*0.1));
					} else { JOptionPane.showMessageDialog(null,fee);}
					
					JOptionPane.showMessageDialog(null,"Your Tuition Fee: " + TF + "\nYour Miscellaneous Fee: " + Mc + "\nYour Total is: " + fee);
					return;

				} else if(Course.getSelectedItem().toString().equals("Engineering")){
					TF = 30000;
					Mc = 22500;
					
					if(StudentType.getSelectedItem().toString().equals("Gold")) {
						fee = ((TF + Mc)-((TF + Mc)*0.5));
					} else if(StudentType.getSelectedItem().toString().equals("Blue")){
						fee = ((TF + Mc)-((TF + Mc)*0.3));
					} else if(StudentType.getSelectedItem().toString().equals("White")){
						fee = ((TF + Mc)-((TF + Mc)*0.2));
					} else if(StudentType.getSelectedItem().toString().equals("Walk-In")){
						fee = TF + Mc;
					} else if(StudentType.getSelectedItem().toString().equals("Continuing")){
						fee = ((TF + Mc)-(TF*0.1));
					} else { JOptionPane.showMessageDialog(null,fee);}
					
					JOptionPane.showMessageDialog(null,"Your Tuition Fee: " + TF + "\nYour Miscellaneous Fee: " + Mc + "\nYour Total is: " + fee);
					return;
					

				} else if(Course.getSelectedItem().toString().equals("Nursing")){
					TF = 15000;
					Mc = 15000;
					
					if(StudentType.getSelectedItem().toString().equals("Gold")) {
						fee = ((TF + Mc)-((TF + Mc)*0.5));
					} else if(StudentType.getSelectedItem().toString().equals("Blue")){
						fee = ((TF + Mc)-((TF + Mc)*0.3));
					} else if(StudentType.getSelectedItem().toString().equals("White")){
						fee = ((TF + Mc)-((TF + Mc)*0.2));
					} else if(StudentType.getSelectedItem().toString().equals("Walk-In")){
						fee = TF + Mc;
					} else if(StudentType.getSelectedItem().toString().equals("Continuing")){
						fee = ((TF + Mc)-(TF*0.1));
					} else { JOptionPane.showMessageDialog(null,fee);}
					
					JOptionPane.showMessageDialog(null,"Your Tuition Fee: " + TF + "\nYour Miscellaneous Fee: " + Mc + "\nYour Total is: " + fee);
					return;

				} else if(Course.getSelectedItem().toString().equals("Architecture")){
					TF = 25000;
					Mc = 23500;
					
					if(StudentType.getSelectedItem().toString().equals("Gold")) {
						fee = ((TF + Mc)-((TF + Mc)*0.5));
					} else if(StudentType.getSelectedItem().toString().equals("Blue")){
						fee = ((TF + Mc)-((TF + Mc)*0.3));
					} else if(StudentType.getSelectedItem().toString().equals("White")){
						fee = ((TF + Mc)-((TF + Mc)*0.2));
					} else if(StudentType.getSelectedItem().toString().equals("Walk-In")){
						fee = TF + Mc;
					} else if(StudentType.getSelectedItem().toString().equals("Continuing")){
						fee = ((TF + Mc)-(TF*0.1));
					} else { JOptionPane.showMessageDialog(null,fee);}
					
					JOptionPane.showMessageDialog(null,"Your Tuition Fee: " + TF + "\nYour Miscellaneous Fee: " + Mc + "\nYour Total is: " + fee);
					return;

				} else {
					JOptionPane.showMessageDialog(null,"Invalid");
					WelcomePage next = new WelcomePage();
					next.initialize();
					StudentNumber.setText(null);
					FirstName.setText(null);
					LastName.setText(null);
					
				} 
				
				
			}
		});
		Submit.setBounds(374, 378, 101, 43);
		frame.getContentPane().add(Submit);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginModule window = new LoginModule();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnLogOut.setBounds(10, 408, 101, 23);
		frame.getContentPane().add(btnLogOut);
		
		JLabel lblNewLabel_2 = new JLabel("Enrollment");
		lblNewLabel_2.setFont(new Font("Myanmar Text", Font.BOLD, 15));
		lblNewLabel_2.setBounds(49, 70, 129, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(new Color(91, 126, 249));
		editorPane.setBounds(0, 51, 664, 393);
		frame.getContentPane().add(editorPane);
		
		JLabel lblNewLabel_1 = new JLabel("HONORATA NATIONAL HIGH SCHOOL");
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.BOLD, 28));
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setBounds(10, 0, 587, 51);
		frame.getContentPane().add(lblNewLabel_1);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBackground(new Color(255, 255, 111));
		editorPane_1.setBounds(0, 0, 664, 59);
		frame.getContentPane().add(editorPane_1);
		
		
		
		
		
	}
}
