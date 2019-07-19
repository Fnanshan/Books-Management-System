package Test_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Test.UserModify;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test_UserModify extends JFrame {

	private JPanel contentPane;
	private JTextField textField_0;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel label_3;
	private JLabel label_4;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserModify frame = new UserModify();
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
	/*修改用户密码功能
	 * 1.已经存在的用户名
	 * 		。。。。
	 * 2.不存在的用户名
	 * 		提示”*******“
	 */
	public Test_UserModify() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u4FEE\u6539\u5BC6\u7801");
		lblNewLabel.setBounds(66, 45, 70, 30);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u786E\u8BA4");				//"确认"按钮
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//更新密码时sql语句用：Update
				//先判断username是否为空
				String url="jdbc:sqlserver://localhost:1433;DatabaseName=图书管理系统";
				String sql_select="select username,password form admin_table where username=? and password=?";
				try{
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
					Connection con=DriverManager.getConnection(url,"sa","1234");
					PreparedStatement sm=con.prepareStatement(sql_select);
					sm.setString(1,textField_0.getText());
					sm.setString(2,textField_1.getText());
					ResultSet rs=sm.execute(sql_select);
					if(rs.next()){
						System.out.println("ok0");
					}			
			}catch(Exception e2){
				System.out.println(""+e2);
			}
		}
		});
		btnNewButton.setBounds(172, 228, 93, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\u53D6\u6D88");
		button.setBounds(293, 228, 93, 23);
		contentPane.add(button);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		layeredPane.setBounds(39, 58, 347, 147);
		contentPane.add(layeredPane);
		layeredPane.setLayout(null);
		
		JLabel label = new JLabel("\u7528\u6237\u540D");
		label.setBounds(42, 33, 54, 15);
		layeredPane.add(label);
		
		JLabel label_1 = new JLabel("\u65E7\u5BC6\u7801");
		label_1.setBounds(42, 73, 54, 15);
		layeredPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u65B0\u5BC6\u7801");
		label_2.setBounds(42, 111, 54, 15);
		layeredPane.add(label_2);
		
		textField_0 = new JTextField();
		textField_0.setText("admin");
		textField_0.setBounds(106, 30, 150, 21);
		layeredPane.add(textField_0);
		textField_0.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 70, 150, 21);
		layeredPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(106, 108, 150, 21);
		layeredPane.add(textField_2);
		textField_2.setColumns(10);
		
	    label_3 = new JLabel("\u7528\u6237\u4E0D\u5B58\u5728");//用户不存在
		label_3.setBounds(266, 33, 81, 15);
		layeredPane.add(label_3);
		
		 label_4 = new JLabel("\u7528\u6237\u5B58\u5728");
		label_4.setBounds(266, 58, 54, 15);
		layeredPane.add(label_4);
		label_3.setVisible(false);//用户不存在
		label_4.setVisible(false);
	
	}
}
