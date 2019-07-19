package Test;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JInternalFrame;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserList extends JFrame {

	private JPanel contentPane;
	private JTextField textField_3;
	private JTextField textField_14;
	private JTextField textField_21;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JPanel panel_1;
	private JLabel label_1;
	private JTextField textField_25;
	private JLabel label_2;
	private JTextField textField_26;
	private JLabel label_3;
	private JTextField textField_27;
	private JLabel label_4;
	private JTextField textField_28;
	private JLabel label_5;
	private JTextField textField_29;
	private JButton button;
	private JButton button_1;

	//
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserList frame = new UserList();
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
	public UserList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JInternalFrame internalFrame = new JInternalFrame("\u7528\u6237\u5217\u8868",true,true,true);
		internalFrame.setBounds(29, 10, 800, 541);
		contentPane.add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(52, 52, 635, 164);
		internalFrame.getContentPane().add(panel);
		
		textField_3 = new JTextField();
		textField_3.setText("      \u7F16\u53F7");
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(30, 10, 108, 21);
		panel.add(textField_3);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(30, 41, 108, 21);
		panel.add(textField_14);
		
		textField_21 = new JTextField();
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBounds(30, 66, 108, 21);
		panel.add(textField_21);
		
		textField = new JTextField();
		textField.setText("     \u7528\u6237\u540D");
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(148, 10, 108, 21);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(148, 41, 108, 21);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(148, 66, 108, 21);
		panel.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setText("      \u5BC6\u7801");
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(266, 10, 108, 21);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(266, 41, 108, 21);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(266, 66, 108, 21);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("      \u6743\u9650");
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(384, 10, 108, 21);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(384, 41, 108, 21);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(384, 66, 108, 21);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText("      \u5907\u6CE8");
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(502, 10, 108, 21);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(502, 41, 108, 21);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(502, 66, 108, 21);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(30, 91, 108, 21);
		panel.add(textField_13);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(148, 91, 108, 21);
		panel.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBounds(266, 91, 108, 21);
		panel.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(384, 91, 108, 21);
		panel.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBounds(502, 91, 108, 21);
		panel.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBounds(30, 115, 108, 21);
		panel.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBounds(148, 115, 108, 21);
		panel.add(textField_20);
		
		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBounds(266, 115, 108, 21);
		panel.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBounds(384, 115, 108, 21);
		panel.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setEditable(false);
		textField_24.setColumns(10);
		textField_24.setBounds(502, 115, 108, 21);
		panel.add(textField_24);
		
		JLabel label = new JLabel("\u7528\u6237\u5217\u8868");
		label.setBounds(52, 34, 89, 15);
		internalFrame.getContentPane().add(label);
		
		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.BLACK);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(62, 226, 625, 238);
		internalFrame.getContentPane().add(panel_1);
		
		label_1 = new JLabel("\u7F16\u53F7\uFF1A");
		label_1.setBounds(55, 24, 54, 15);
		panel_1.add(label_1);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(122, 21, 84, 21);
		panel_1.add(textField_25);
		
		label_2 = new JLabel("  \u6743\u9650\uFF1A");
		label_2.setBounds(216, 24, 54, 15);
		panel_1.add(label_2);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(335, 21, 101, 21);
		panel_1.add(textField_26);
		
		label_3 = new JLabel("\u7528\u6237\u540D\uFF1A");
		label_3.setBounds(55, 60, 54, 15);
		panel_1.add(label_3);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(122, 57, 259, 21);
		panel_1.add(textField_27);
		
		label_4 = new JLabel("\u5BC6\u7801\uFF1A");
		label_4.setBounds(55, 97, 54, 15);
		panel_1.add(label_4);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(122, 94, 259, 21);
		panel_1.add(textField_28);
		
		label_5 = new JLabel("\u5907\u6CE8\uFF1A");
		label_5.setBounds(55, 138, 54, 15);
		panel_1.add(label_5);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(122, 135, 259, 21);
		panel_1.add(textField_29);
		
		button = new JButton("\u4FEE\u6539");   										 //修改
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String url="jdbc:sqlserver://localhost:1433;DatabaseName=图书管理系统";
					String sql_update="  update admin_table set username=?,password=?,remark=?,des=?  where id=?";
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();//加载驱动
					Connection con=DriverManager.getConnection(url, "sa", "1234");//创建连接
					PreparedStatement sm=con.prepareStatement(sql_update);	
					sm.setString(1,textField_27.getText());
					sm.setString(2,textField_28.getText());
					sm.setString(3,textField_26.getText());
					sm.setString(4,textField_29.getText());	
					sm.setString(5, textField_25.getText());
					int count=sm.executeUpdate();
					if(count>=1){
						label_6.setVisible(true);//修改成功
						label_7.setVisible(false);
					}else{
						label_7.setVisible(true);//修改失败
						label_6.setVisible(false);
					}
					
					}catch(Exception e1){
						System.out.println(""+e1);
					}
				
			}
		});
		button.setBounds(113, 186, 93, 23);
		panel_1.add(button);
		
		button_1 = new JButton("\u53D6\u6D88");    //取消
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				internalFrame.setVisible(false);
				Main main_q=new Main();
				main_q.setVisible(true);
			}
		});
		button_1.setBounds(267, 186, 93, 23);
		panel_1.add(button_1);
		
		 label_6 = new JLabel("\u4FEE\u6539\u6210\u529F");//修改成功
		label_6.setBounds(428, 138, 54, 15);
		panel_1.add(label_6);
		 label_7 = new JLabel("\u4FEE\u6539\u5931\u8D25");//修改失败
		label_7.setBounds(527, 138, 54, 15);
		panel_1.add(label_7);
		
		label_8 = new JLabel("(\u7BA1\u7406\u5458/\u5B66\u751F)");
		label_8.setBounds(256, 24, 93, 15);
		panel_1.add(label_8);
		label_6.setVisible(false);
		label_7.setVisible(false);
		
		JButton button_2 = new JButton("\u67E5\u770B\u6240\u6709\u7528\u6237");//按钮：查看所有用户
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String url="jdbc:sqlserver://localhost:1433;DatabaseName=图书管理系统";
					String sql_select="  select id,username,password,remark,des from admin_table";
					
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();//加载驱动
					Connection con=DriverManager.getConnection(url, "sa", "1234");//创建连接
					PreparedStatement sm=con.prepareStatement(sql_select);	
					ResultSet rs=sm.executeQuery();
					if(rs.next()){
						textField_14.setText(rs.getString(1));
						textField_1.setText(rs.getString(2));
						textField_5.setText(rs.getString(3));
						textField_8.setText(rs.getString(4));
						textField_11.setText(rs.getString(5));
						if(rs.next()){
							textField_21.setText(rs.getString(1));
							textField_2.setText(rs.getString(2));
							textField_6.setText(rs.getString(3));
							textField_9.setText(rs.getString(4));
							textField_12.setText(rs.getString(5));
						}
						if(rs.next()){
							textField_13.setText(rs.getString(1));
							textField_15.setText(rs.getString(2));
							textField_16.setText(rs.getString(3));
							textField_17.setText(rs.getString(4));
							textField_18.setText(rs.getString(5));
						}
					}
					
					}catch(Exception e1){
						System.out.println(""+e1);
					}
			}
		});
		button_2.setBounds(48, 1, 133, 23);
		internalFrame.getContentPane().add(button_2);
		internalFrame.setVisible(true);
	}
}
