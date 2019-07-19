package Test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;

public class JInternalFrame_system extends JFrame {

	private JPanel contentPane;
	JDesktopPane desktopPane;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JInternalFrame_system frame = new JInternalFrame_system();
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
	public JInternalFrame_system() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("\u7CFB\u7EDF\u7BA1\u7406");		//按钮“系统管理”
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JInternalFrame internalFrame = new JInternalFrame("\u7CFB\u7EDF",true,true,true);
				internalFrame.setBounds(29, 27, 278, 171);
				desktopPane.add(internalFrame);
				internalFrame.getContentPane().setLayout(null);
				
				JButton btnNewButton = new JButton("\u7528\u6237\u7BA1\u7406");		//用户管理
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnNewButton.setBounds(29, 10, 157, 52);
				internalFrame.getContentPane().add(btnNewButton);
				
				JButton btnNewButton_1 = new JButton("\u7528\u6237\u767B\u5F55");		//用户登录
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnNewButton_1.setBounds(29, 72, 157, 52);
				internalFrame.getContentPane().add(btnNewButton_1);
				internalFrame.setVisible(true);
				
				
			}
		});

		btnNewButton_2.setBounds(0, 10, 93, 23);
		contentPane.add(btnNewButton_2);
		
		 desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 30, 880, 500);
		contentPane.add(desktopPane);
		
		btnNewButton_3 = new JButton("\u4E66\u7C4D\u7BA1\u7406");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(92, 10, 93, 23);
		contentPane.add(btnNewButton_3);
		

	}
}
