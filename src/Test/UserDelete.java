package Test;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserDelete extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserDelete frame = new UserDelete();
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
	/*			UserDelete功能介绍
	 * 1.已存在的用户
	 * 		密码错误
	 * 		密码正确——》已删除用户
	 * 
	 * 2.不存在的用户
	 * 、	显示：用户不存在
	 * 
	 */
	public UserDelete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u7528\u6237\u540D");
		label.setBounds(81, 66, 54, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801");
		label_1.setBounds(81, 128, 54, 15);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(163, 63, 66, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(163, 125, 66, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("\u5220\u9664");			//"确认"按钮
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String url="jdbc:sqlserver://localhost:1433;DatabaseName=图书管理系统";
					String sql_select="select username,password from admin_table where username=? and password=?";
					String sql_delete="delete from admin_table where username=? and password=?";
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();//加载驱动
					Connection con=DriverManager.getConnection(url, "sa", "1234");//创建连接
					PreparedStatement ps=con.prepareStatement(sql_select);
					ps.setString(1, textField.getText());
					ps.setString(2, textField_1.getText());
					ResultSet rs=ps.executeQuery();
					if(rs.next()){
						PreparedStatement ps_delete=con.prepareStatement(sql_delete);
						ps_delete.setString(1,textField.getText());
						ps_delete.setString(2, textField_1.getText());
						int count=ps_delete.executeUpdate();
						////？？？
						if(count>=1){
							label_4.setVisible(true);//删除成功
						}else{
							
						}
					}else{
						label_3.setVisible(false);//"用户不存在"
					}
					}catch(Exception e1){
						System.out.println(""+e1);
					}
			}
		});
		button.setBounds(61, 195, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u53D6\u6D88");			//取消
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	System.exit(0);
				Main main_q=new Main();
				main_q.setVisible(true);
			}
		});
		button_1.setBounds(197, 195, 93, 23);
		contentPane.add(button_1);
		
		label_2 = new JLabel("\u5BC6\u7801\u9519\u8BEF");
		label_2.setBounds(262, 128, 99, 15);
		contentPane.add(label_2);
		
	    label_3 = new JLabel("\u7528\u6237\u4E0D\u5B58\u5728");
		label_3.setBounds(262, 66, 99, 15);
		contentPane.add(label_3);
		
		 label_4 = new JLabel("\u5220\u9664\u6210\u529F");
		label_4.setBounds(148, 156, 54, 15);
		contentPane.add(label_4);
		label_2.setVisible(false);
		label_3.setVisible(false);
		label_4.setVisible(false);
	}
}
