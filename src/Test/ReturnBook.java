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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReturnBook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtIsbn;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JPanel panel_2;
	private JButton button_2;
	private JButton button_3;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReturnBook frame = new ReturnBook();
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
	public ReturnBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JInternalFrame internalFrame = new JInternalFrame("\u8FD8\u4E66",true,true,true);
		internalFrame.setBounds(29, 10, 800, 400);
		contentPane.add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 26, 625, 73);
		internalFrame.getContentPane().add(panel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(131, 22, 238, 21);
		panel.add(textField);
		
		JButton button = new JButton("\u67E5\u8BE2");    //查找
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String url="jdbc:sqlserver://localhost:1433;DatabaseName=图书管理系统";
					String sql_select="select borrow_book_table.bookNumber,borrow_book_table.sid,borrowdate,book_id_table.isbn,bookname,borrowdays   from borrow_book_table,book_id_table,book_infomation_table,student_table,student_type_table where borrow_book_table.bookNumber=book_id_table.bookNumber  and book_infomation_table.isbn=book_id_table.isbn and borrow_book_table.sid=student_table.sid and student_table.stypeid=student_type_table.stypeid and borrow_book_table.bookNumber=?";
					String sql_update="Update admin_table set username=?,password=?";
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();//加载驱动
					Connection con=DriverManager.getConnection(url, "sa", "1234");//创建连接
					PreparedStatement sm=con.prepareStatement(sql_select);
					sm.setString(1, textField.getText());
					ResultSet rs=sm.executeQuery();
					if(rs.next()){
						textField_18.setText(rs.getString(1));
						textField_17.setText(rs.getString(4));
						textField_16.setText(rs.getString(5));
						textField_15.setText(rs.getString(2));
						textField_14.setText(rs.getString(3));
						textField_13.setText(rs.getString(6));	
						label_2.setVisible(true);
						label_3.setVisible(false);
					}else{
						label_3.setVisible(true);
						label_2.setVisible(false);
						
					}
				
					}catch(Exception e1){
						System.out.println(""+e1);
					}
				
			}
		});
		button.setBounds(379, 21, 93, 23);
		panel.add(button);
		
		JLabel label = new JLabel("\u56FE\u4E66\u7F16\u53F7\uFF1A");
		label.setBounds(48, 22, 73, 15);
		panel.add(label);
		
		JButton button_1 = new JButton("\u8FD8\u4E66");   //还书
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String url="jdbc:sqlserver://localhost:1433;DatabaseName=图书管理系统";
					
					String sql_delete="delete borrow_book_table where bookNumber=? and sid=?";
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();//加载驱动
					Connection con=DriverManager.getConnection(url, "sa", "1234");//创建连接
					PreparedStatement sm=con.prepareStatement(sql_delete);
					sm.setString(1,textField.getText());
					sm.setString(2,textField_15.getText());
					int count=sm.executeUpdate();
					if(count>=1){
						label_4.setVisible(true);
						label_5.setVisible(false);
					}else{
						label_4.setVisible(false);
						label_5.setVisible(true);
					}
					
					}catch(Exception e1){
						System.out.println(""+e1);
					}	
			}
		});
		button_1.setBounds(495, 21, 93, 23);
		panel.add(button_1);
		
		 label_2 = new JLabel("\u67E5\u8BE2\u6210\u529F");
		label_2.setBounds(141, 53, 54, 15);
		panel.add(label_2);
		 label_3 = new JLabel("\u67E5\u8BE2\u5931\u8D25");
		label_3.setBounds(240, 53, 54, 15);
		panel.add(label_3);
		
		label_4 = new JLabel("\u8FD8\u4E66\u6210\u529F");
		label_4.setBounds(412, 54, 54, 15);
		panel.add(label_4);
		label_5 = new JLabel("\u8FD8\u4E66\u5931\u8D25");
		label_5.setBounds(495, 54, 54, 15);
		panel.add(label_5);
		label_2.setVisible(false);
		label_3.setVisible(false);
		label_4.setVisible(false);
		label_5.setVisible(false);
		
		JLabel label_1 = new JLabel("\u8FD8\u4E66\u4FE1\u606F");
		label_1.setBounds(10, 121, 89, 15);
		internalFrame.getContentPane().add(label_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.BLACK);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 139, 625, 97);
		internalFrame.getContentPane().add(panel_1);
		
		textField_1 = new JTextField();
		textField_1.setText(" \u56FE\u4E66\u7F16\u53F7");
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(10, 10, 66, 21);
		panel_1.add(textField_1);
		
		txtIsbn = new JTextField();
		txtIsbn.setText("   ISBN");
		txtIsbn.setEditable(false);
		txtIsbn.setColumns(10);
		txtIsbn.setBounds(77, 10, 66, 21);
		panel_1.add(txtIsbn);
		
		textField_3 = new JTextField();
		textField_3.setText("   \u4E66\u540D");
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(144, 10, 66, 21);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText(" \u501F\u4E66\u7F16\u53F7");
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(211, 10, 66, 21);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText(" \u501F\u9605\u65E5\u671F");
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(278, 10, 99, 21);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText(" \u53EF\u501F\u5929\u6570");
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(377, 10, 99, 21);
		panel_1.add(textField_6);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(377, 41, 99, 21);
		panel_1.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(278, 41, 99, 21);
		panel_1.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(211, 41, 66, 21);
		panel_1.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBounds(144, 41, 66, 21);
		panel_1.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(77, 41, 66, 21);
		panel_1.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBounds(10, 41, 66, 21);
		panel_1.add(textField_18);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setForeground(Color.BLACK);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 270, 625, 67);
		internalFrame.getContentPane().add(panel_2);
		
		button_2 = new JButton("\u6E05\u7A7A");   //清空
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_18.setText("");
				textField_17.setText("");
				textField_16.setText("");
				textField_15.setText("");
				textField_14.setText("");
				textField_13.setText("");	
			}
		});
		button_2.setBounds(306, 23, 93, 23);
		panel_2.add(button_2);
		
		button_3 = new JButton("\u53D6\u6D88");    //取消
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				internalFrame.setVisible(false);
				Main main_q=new Main();
				main_q.setVisible(true);
			}
		});
		button_3.setBounds(440, 23, 93, 23);
		panel_2.add(button_3);
		internalFrame.setVisible(true);
	}
}
