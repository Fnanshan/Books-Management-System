package Test;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.border.LineBorder;

public class Main extends JFrame {

	private JPanel contentPane;
	JDesktopPane desktopPane;
	JDesktopPane desktopPane_BookManager;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel label_2;
	//
	private JInternalFrame internalFrame_SystemManager;
	private JInternalFrame internalFrame_UserLogin;
	//private JInternalFrame Information_query;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main Main_run = new Main();
					Main_run.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setTitle("\u56FE\u4E66\u7BA1\u7406\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 647);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("\u7CFB\u7EDF\u7BA1\u7406");		//按钮“系统管理”
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 internalFrame_SystemManager = new JInternalFrame("\u7CFB\u7EDF",true,true,true);
				internalFrame_SystemManager.setBounds(29, 27, 278, 171);
				desktopPane.add(internalFrame_SystemManager);
				internalFrame_SystemManager.getContentPane().setLayout(null);
				
				JButton btnNewButton = new JButton("\u7528\u6237\u7BA1\u7406");		//用户管理
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//Test_Main_UserManager test_Main_usermanager1=new Test_Main_UserManager();
						//test_Main_usermanager1.setVisible(true);
						//test_Main_usermanager1.setVisible(true);
						Sytem_Manager sytem_manager=new Sytem_Manager();
						sytem_manager.setVisible(true);
					}
				});
				btnNewButton.setBounds(29, 10, 157, 52);
				internalFrame_SystemManager.getContentPane().add(btnNewButton);
				
				JButton btnNewButton_1 = new JButton("\u7528\u6237\u767B\u5F55");		//用户登录
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//internalFrame_UserLogin.setVisible(true);
						//internalFrame_SystemManager.setVisible(false);
						UserLogin button_UserLogin=new UserLogin();
						button_UserLogin.setVisible(true);
					}
				});
				btnNewButton_1.setBounds(29, 72, 157, 52);
				internalFrame_SystemManager.getContentPane().add(btnNewButton_1);
				/*
				JButton btnNewButton_2 = new JButton("close");		//取消
				btnNewButton_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						internalFrame.setVisible(false);
					}
				});
				btnNewButton_2.setBounds(29, 100, 80, 40);
				internalFrame.getContentPane().add(btnNewButton_2);
				*/
				internalFrame_SystemManager.setVisible(true);
				
				
			}
		});

		btnNewButton_2.setBounds(0, 10, 93, 23);
		contentPane.add(btnNewButton_2);
		
		 desktopPane = new JDesktopPane();			//系统管理的黑盒子
		desktopPane.setBounds(0, 30, 880, 500);
		contentPane.add(desktopPane);
		
		 internalFrame_UserLogin = new JInternalFrame("\u7528\u6237\u767B\u5F55",true,true,true);
		internalFrame_UserLogin.setBounds(26, 10, 314, 237);
		desktopPane.add(internalFrame_UserLogin);
		internalFrame_UserLogin.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u7528\u6237\u540D");
		label.setBounds(54, 25, 54, 15);
		internalFrame_UserLogin.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(118, 22, 66, 21);
		internalFrame_UserLogin.getContentPane().add(textField);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801");
		label_1.setBounds(54, 64, 54, 15);
		internalFrame_UserLogin.getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(118, 61, 66, 21);
		internalFrame_UserLogin.getContentPane().add(textField_1);
		
		label_2 = new JLabel("\u7C7B\u578B");
		label_2.setBounds(54, 108, 54, 15);
		internalFrame_UserLogin.getContentPane().add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u7CFB\u7EDF\u7BA1\u7406\u5458\uFF0C\u5B66\u751F"}));
		comboBox.setBounds(111, 105, 107, 21);
		internalFrame_UserLogin.getContentPane().add(comboBox);
		
		JButton button_7 = new JButton("\u767B\u5F55");
		button_7.setBounds(10, 154, 93, 23);
		internalFrame_UserLogin.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("\u53D6\u6D88");//取消
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		button_8.setBounds(125, 154, 93, 23);
		internalFrame_UserLogin.getContentPane().add(button_8);
		internalFrame_UserLogin.setVisible(false);
		/*
		desktopPane_BookManager = new JDesktopPane();//JDesktopPane_BookManager书籍管理的黑盒子
		desktopPane_BookManager.setBounds(56, 29, 300, 196);
		contentPane.add(desktopPane_BookManager);
		*/
		
		//
		
		btnNewButton_3 = new JButton("\u4E66\u7C4D\u7BA1\u7406");//书籍管理“按钮
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				JInternalFrame internalFrame_BookManager = new JInternalFrame("\u4E66\u7C4D\u7BA1\u7406",true,true,true);	//书籍管理
				internalFrame_BookManager.setBounds(0, 0, 300, 196);
				desktopPane.add(internalFrame_BookManager);
				internalFrame_BookManager.getContentPane().setLayout(null);
				
				JButton button = new JButton("\u6DFB\u52A0\u4E66\u7C4D");		//添加书籍
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						Main main_q=new Main();
						main_q.setVisible(true);
						BookAdd bookadd=new BookAdd();
						bookadd.setVisible(true);
						
					}
				});
				button.setBounds(61, 26, 137, 23);
				internalFrame_BookManager.getContentPane().add(button);
				
				JButton button_1 = new JButton("\u4FEE\u6539\u4E66\u7C4D\u4FE1\u606F");//修改书籍信息
				button_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						BookModify bookmodify=new BookModify();
						bookmodify.setVisible(true);
					}
				});
				button_1.setBounds(61, 68, 137, 23);
				internalFrame_BookManager.getContentPane().add(button_1);
				
				JButton button_2 = new JButton("\u5220\u9664\u4E66\u7C4D\u4FE1\u606F");//删除书籍信息
				button_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						BookDelete bookdelete=new BookDelete();
						bookdelete.setVisible(true);
					}
				});
				button_2.setBounds(61, 109, 137, 23);
				internalFrame_BookManager.getContentPane().add(button_2);
				internalFrame_BookManager.setVisible(true);
				//
			}
		});
		btnNewButton_3.setBounds(92, 10, 93, 23);
		contentPane.add(btnNewButton_3);
		//\
		 desktopPane = new JDesktopPane();			//系统管理的黑盒子
			desktopPane.setBounds(0, 30, 880, 500);
			contentPane.add(desktopPane);
			
			btnNewButton_4 = new JButton("\u501F\u4E66\u7BA1\u7406");
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					BorrowBook borrowbook=new BorrowBook();
					borrowbook.setVisible(true);
				}
			});
			btnNewButton_4.setBounds(184, 10, 93, 23);
			contentPane.add(btnNewButton_4);
			
			button_3 = new JButton("\u8FD8\u4E66\u7BA1\u7406");//还书管理
			button_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ReturnBook returnbook=new ReturnBook();
					returnbook.setVisible(true);
				}
			});
			button_3.setBounds(277, 10, 93, 23);
			contentPane.add(button_3);
			
			button_4 = new JButton("\u4FE1\u606F\u67E5\u8BE2");//信息查询
			button_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Information_query information_query=new Information_query();
					information_query.setVisible(true);
				}
			});
			button_4.setBounds(371, 10, 93, 23);
			contentPane.add(button_4);
			
			button_5 = new JButton("\u89C6\u56FE");
			button_5.setBounds(464, 10, 93, 23);
			contentPane.add(button_5);
			
			button_6 = new JButton("\u5E2E\u52A9");
			button_6.setBounds(558, 10, 93, 23);
			contentPane.add(button_6);
			
			JPanel panel = new JPanel();
			panel.setForeground(Color.RED);
			panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			panel.setBounds(0, 540, 874, 66);
			contentPane.add(panel);
			panel.setLayout(null);
			
			JLabel label_3 = new JLabel("           \u5DE5\u4F5C\u5BA4\uFF1A329       &&                                \u7248\u6743\u6240\u6709\uFF0C\u8FDD\u8005\u5FC5\u7A76");
			label_3.setBounds(25, 10, 670, 46);
			panel.add(label_3);

	}
}
