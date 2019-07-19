package Test;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	private JLabel label_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogin frame = new UserLogin();
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
	public UserLogin() {
		setTitle("\u767B\u5F55_\u56FE\u4E66\u7BA1\u7406\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u7528\u6237\u540D");				//"用户名"
		label.setBounds(64, 58, 54, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801");					//"密码"
		label_1.setBounds(64, 114, 54, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u7C7B\u578B");
		label_2.setBounds(64, 162, 54, 15);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(128, 55, 66, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(128, 111, 66, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("\u767B\u5F55");						//“确定”按钮
		button.addActionListener(new ActionListener() {						//添加事件：“确定”功能的实现
			public void actionPerformed(ActionEvent arg0) {
				try{														//编写SQL
					String url="jdbc:sqlserver://localhost:1433;DatabaseName=图书管理系统";
					String sql="select * from admin_table where username=? and password=?";
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
					Connection con=DriverManager.getConnection(url,"sa", "1234");
					PreparedStatement ps=con.prepareStatement(sql);			//条件式SQL语句
					ps.setString(1,textField.getText());
					ps.setString(2, textField_1.getText());
				    ResultSet rs=ps.executeQuery();
				    if(rs.next()){
				    	UserLogin userLogin_login=new UserLogin();
				    	userLogin_login.setVisible(false);
				    	Main main_login=new Main();
				    	main_login.setVisible(true);
				    }else{
				    	label_3.setVisible(true);
				    }
				}catch(Exception e){
					System.out.println(""+e);
				}
			}
		});
		
		button.setBounds(41, 217, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u53D6\u6D88");				//“取消”按钮
		button_1.addActionListener(new ActionListener() {			//添加事件“取消”功能的实现
			public void actionPerformed(ActionEvent arg0) {
				/*
				Main main_q=new Main();
				main_q.setVisible(true);
				UserLogin userlogin=new UserLogin();
				userlogin.setVisible(false);
				*/
				System.exit(0);
				
			}
		});
		button_1.setBounds(166, 217, 93, 23);
		contentPane.add(button_1);
		
		 label_3 = new JLabel("\u767B\u5F55\u5931\u8D25\uFF08\u7528\u6237\u540D/\u5BC6\u7801\u9519\u8BEF\uFF09");//”登录失败“
		label_3.setBounds(217, 114, 188, 15);
		contentPane.add(label_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(128, 159, 93, 21);
		contentPane.add(comboBox);
		comboBox.addItem("系统管理员");
		comboBox.addItem("学生");
		
		label_3.setVisible(false);
	}
}
