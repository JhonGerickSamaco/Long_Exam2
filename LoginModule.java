import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JEditorPane;
import javax.swing.SwingConstants;

public class LoginModule {

	JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginModule window = new LoginModule();
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
	public LoginModule() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 245, 245));
		frame.setBounds(100, 100, 709, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblLoginModule = new JLabel("Sign in to GitHub");
		lblLoginModule.setForeground(new Color(0, 0, 0));
		lblLoginModule.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblLoginModule.setBounds(224, 45, 290, 95);
		frame.getContentPane().add(lblLoginModule);
		
		JLabel lblUsername = new JLabel("Username or Email address");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsername.setBounds(228, 135, 182, 22);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPassword.setBounds(228, 201, 84, 22);
		frame.getContentPane().add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(230, 168, 230, 22);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JButton btnSubmit = new JButton("Sign In");
		btnSubmit.setBackground(new Color(128, 255, 128));
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtUsername.getText().equals("Admin")&& txtPassword.getText().equals("password1")) {
				JOptionPane.showMessageDialog(null,"Log-In Successful");
				WelcomePage wow = new WelcomePage();
				wow.newFrame();
				txtUsername.setText(null);
				txtPassword.setText(null);
				}
				else if(txtUsername.getText().equals("Secretary")&& txtPassword.getText().equals("password2")){
					JOptionPane.showMessageDialog(null,"Log-In Successful");
					WelcomePage wow = new WelcomePage();
					wow.newFrame();
					txtUsername.setText(null);
					txtPassword.setText(null);
					
					}
				else {
					JOptionPane.showMessageDialog(null,"Invalid Credentials");
					
				}
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSubmit.setBounds(230, 272, 230, 22);
		frame.getContentPane().add(btnSubmit);
		
//		JButton btnReset = new JButton("RESET");
//		btnReset.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				txtUsername.setText(null);
//				txtPassword.setText(null);
//			}
//		});
//		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
//		btnReset.setBounds(29, 360, 98, 25);
//		frame.getContentPane().add(btnReset);
//		
		JCheckBox chckbxShowPass = new JCheckBox("Show Password");
		chckbxShowPass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxShowPass.isSelected()) {
					txtPassword.setEchoChar((char)0); 
				   } else {
					txtPassword.setEchoChar('\u25cf');
				   }
			}
			
		});
		chckbxShowPass.setBackground(new Color(255, 255, 255));
		chckbxShowPass.setForeground(new Color(0, 0, 0));
		chckbxShowPass.setBounds(360, 245, 116, 23);
		frame.getContentPane().add(chckbxShowPass);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(228, 223, 230, 22);
		frame.getContentPane().add(txtPassword);
		
		
		JLabel lblForgetPass = new JLabel("Forget Password?");
		lblForgetPass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		            if (txtUsername.getText().equals ("Admin")) {
		                JOptionPane.showMessageDialog(null, "Your password is: password1");
		            } else if (txtUsername.getText().equals ("Secretary")) {
		                JOptionPane.showMessageDialog(null, "Your password is: password2");
		            } else if (txtUsername.getText().equals ("")) {
		                JOptionPane.showMessageDialog(null, "Kindly Input your Username");
		            } else {
		                JOptionPane.showMessageDialog(null, "Invalid Username");
		                txtUsername.setText(null);
						txtPassword.setText(null);
		            }
		        }
			
		});
		lblForgetPass.setForeground(new Color(0, 0, 255));
		lblForgetPass.setHorizontalAlignment(SwingConstants.RIGHT);
		lblForgetPass.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblForgetPass.setBounds(343, 201, 116, 22);
		frame.getContentPane().add(lblForgetPass);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(212, 120, 271, 190);
		frame.getContentPane().add(editorPane);
		
		JLabel lblNewToGit = new JLabel("New to GitHub?");
		lblNewToGit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewToGit.setBounds(245, 321, 110, 22);
		frame.getContentPane().add(lblNewToGit);
		
		JLabel lblCreatAnAccount = new JLabel("Create an account.");
		lblCreatAnAccount.setForeground(new Color(0, 0, 255));
		lblCreatAnAccount.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCreatAnAccount.setBounds(343, 321, 110, 22);
		frame.getContentPane().add(lblCreatAnAccount);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(212, 321, 271, 23);
		frame.getContentPane().add(editorPane_1);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/1git.png"));
		lblNewLabel.setIcon(img);
		lblNewLabel.setBounds(291, 0, 149, 279);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblTerms = new JLabel("Terms");
		lblTerms.setHorizontalAlignment(SwingConstants.CENTER);
		lblTerms.setForeground(Color.BLUE);
		lblTerms.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTerms.setBounds(202, 378, 62, 22);
		frame.getContentPane().add(lblTerms);
		
		JLabel lblPrivacy = new JLabel("Privacy");
		lblPrivacy.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrivacy.setForeground(Color.BLUE);
		lblPrivacy.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrivacy.setBounds(261, 378, 62, 22);
		frame.getContentPane().add(lblPrivacy);
		
		JLabel lblSecurity = new JLabel("Security");
		lblSecurity.setHorizontalAlignment(SwingConstants.CENTER);
		lblSecurity.setForeground(Color.BLUE);
		lblSecurity.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSecurity.setBounds(333, 378, 62, 22);
		frame.getContentPane().add(lblSecurity);
		
		JLabel lblContactGithub = new JLabel("Contact GitHub");
		lblContactGithub.setHorizontalAlignment(SwingConstants.CENTER);
		lblContactGithub.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblContactGithub.setBounds(393, 378, 110, 22);
		frame.getContentPane().add(lblContactGithub);
	}
}
