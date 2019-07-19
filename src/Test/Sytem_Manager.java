package Test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sytem_Manager extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sytem_Manager frame = new Sytem_Manager();
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
	public Sytem_Manager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("\u7528\u6237\u5217\u8868");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserList userlist=new UserList();
				userlist.setVisible(true);
			}
		});
		button.setBounds(95, 37, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u6DFB\u52A0\u7528\u6237");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userAdd useradd=new userAdd();
				useradd.setVisible(true);
			}
		});
		button_1.setBounds(95, 100, 93, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u4FEE\u6539\u7528\u6237\u4FE1\u606F");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserModify usermodify=new UserModify();
				usermodify.setVisible(true);
			}
		});
		button_2.setBounds(95, 158, 112, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\u5220\u9664\u7528\u6237");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserDelete userdelete=new UserDelete();
				userdelete.setVisible(true);
			}
		});
		button_3.setBounds(95, 214, 93, 23);
		contentPane.add(button_3);
	}

}
