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
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JInternalFrame;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BorrowBook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtIsbn;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JPanel panel_4;
	private JButton button_5;
	//
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	//
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BorrowBook frame = new BorrowBook();
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
	public BorrowBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JInternalFrame internalFrame = new JInternalFrame("\u501F\u9605\u4E66\u7C4D",true,true,true);
		internalFrame.setBounds(29, 10, 800, 541);
		contentPane.add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 20, 625, 72);
		internalFrame.getContentPane().add(panel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(131, 22, 318, 21);
		panel.add(textField);
		
		JButton button = new JButton("\u67E5\u627E");  //查找1
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String url="jdbc:sqlserver://localhost:1433;DatabaseName=图书管理系统";
					String sql_select="select username,password from admin_table where username=? and password=?";
					String sql_update="Update admin_table set username=?,password=?";
					//String sql_find_bookNumber="select * from book_infomation_table where isbn in(select isbn from book_id_table where bookNumber=?)";
					String sql_find_bookNumber="select bookNumber,book_id_table.isbn,bookname,booktypeid,author,press,pressdate from book_id_table,book_infomation_table where book_id_table.isbn=book_infomation_table.isbn and bookNumber=?";
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();//加载驱动
					Connection con=DriverManager.getConnection(url, "sa", "1234");//创建连接
					PreparedStatement sm=con.prepareStatement(sql_find_bookNumber);
					sm.setString(1, textField.getText());
					ResultSet rs=sm.executeQuery();
					if(rs.next()){
						textField_18.setText(rs.getString(1));
						textField_17.setText(rs.getString(2));
						textField_16.setText(rs.getString(3));
						textField_15.setText(rs.getString(4));
						textField_14.setText(rs.getString(5));
						textField_13.setText(rs.getString(6));
						textField_12.setText(rs.getString(7));
						label_6.setVisible(true);
						label_7.setVisible(false);
					}else{
						label_6.setVisible(false);
						label_7.setVisible(true);
						textField_18.setText("");
						textField_17.setText("");
						textField_16.setText("");
						textField_15.setText("");
						textField_14.setText("");
						textField_13.setText("");
						textField_12.setText("");
						
					}
					
					}catch(Exception e2){
						System.out.println(""+e2);
					}
			}
		});
		button.setBounds(492, 21, 93, 23);
		panel.add(button);
		
		JLabel label = new JLabel("\u56FE\u4E66\u7F16\u53F7\uFF1A");
		label.setBounds(48, 22, 73, 15);
		panel.add(label);
		
		label_6 = new JLabel("\u67E5\u627E\u6210\u529F");//查找成功1
		label_6.setBounds(141, 53, 54, 15);
		panel.add(label_6);
		label_7 = new JLabel("\u67E5\u627E\u5931\u8D25");//查找失败1
		label_7.setBounds(247, 53, 54, 15);
		panel.add(label_7);
		label_6.setVisible(false);
		label_7.setVisible(false);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.BLACK);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 117, 625, 97);
		internalFrame.getContentPane().add(panel_1);
		
		textField_1 = new JTextField();
		textField_1.setText(" \u56FE\u4E66\u7F16\u53F7");
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(10, 10, 78, 21);
		panel_1.add(textField_1);
		
		txtIsbn = new JTextField();
		txtIsbn.setText("   ISBN");
		txtIsbn.setEditable(false);
		txtIsbn.setColumns(10);
		txtIsbn.setBounds(86, 10, 87, 21);
		panel_1.add(txtIsbn);
		
		textField_3 = new JTextField();
		textField_3.setText("   \u4E66\u540D");
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(172, 10, 73, 21);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText(" \u56FE\u4E66\u7C7B\u578B");
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(244, 10, 66, 21);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("   \u4F5C\u8005");
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(310, 10, 84, 21);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("  \u51FA\u7248\u793E");
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(392, 10, 84, 21);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText(" \u51FA\u7248\u65E5\u671F");
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(476, 10, 139, 21);
		panel_1.add(textField_7);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(476, 29, 139, 21);
		panel_1.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(392, 29, 84, 21);
		panel_1.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(310, 29, 84, 21);
		panel_1.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(244, 29, 66, 21);
		panel_1.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBounds(172, 29, 73, 21);
		panel_1.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(86, 29, 87, 21);
		panel_1.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBounds(10, 29, 78, 21);
		panel_1.add(textField_18);
		
		JLabel label_1 = new JLabel("\u501F\u9605\u56FE\u4E66\u4FE1\u606F");
		label_1.setBounds(10, 102, 89, 15);
		internalFrame.getContentPane().add(label_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setForeground(Color.BLACK);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 224, 625, 72);
		internalFrame.getContentPane().add(panel_2);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(131, 22, 238, 21);
		panel_2.add(textField_28);
		
		JButton button_1 = new JButton("\u67E5\u627E");    //查找2
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String url="jdbc:sqlserver://localhost:1433;DatabaseName=图书管理系统";
					String sql_select_find_sid="select sid,sname,stypename,sborrowedCount,borrowcount-sborrowedCount,borrowdays,reDate,reDate+useYear "
							+ " from student_table,student_type_table "
							+ "where student_table.stypeid=student_type_table.stypeid "
							+ "and sid=?";
					//String sql_update="Update admin_table set username=?,password=?";
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();//加载驱动
					Connection con=DriverManager.getConnection(url, "sa", "1234");//创建连接
					PreparedStatement sm=con.prepareStatement(sql_select_find_sid);
					sm.setString(1, textField_28.getText());
					ResultSet rs=sm.executeQuery();
					if(rs.next()){
						textField_46.setText(rs.getString(1));
						textField_45.setText(rs.getString(2));
						textField_44.setText(rs.getString(3));
						textField_43.setText(rs.getString(4));
						textField_42.setText(rs.getString(5));
						textField_41.setText(rs.getString(6));
						textField_40.setText(rs.getString(7));
						textField_39.setText(rs.getString(8));
						label_5.setVisible(false);
						label_4.setVisible(true);
					}else{
						label_4.setVisible(false);
						label_5.setVisible(true);
						textField_46.setText("");
						textField_45.setText("");
						textField_44.setText("");
						textField_43.setText("");
						textField_42.setText("");
						textField_41.setText("");
						textField_40.setText("");
						textField_39.setText("");
					}
					
					}catch(Exception e1){
						System.out.println(""+e1);
					}
				
			}
		});
		button_1.setBounds(379, 21, 93, 23);
		panel_2.add(button_1);
		
		JLabel label_2 = new JLabel("\u501F\u4E66\u7F16\u53F7\uFF1A");
		label_2.setBounds(48, 22, 73, 15);
		panel_2.add(label_2);
		
		JButton button_2 = new JButton("\u501F\u4E66");    //借书
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String url="jdbc:sqlserver://localhost:1433;DatabaseName=图书管理系统";
					String sql_update=" insert into borrow_book_table(sid,bookNumber) values(?,?)";
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();//加载驱动
					Connection con=DriverManager.getConnection(url, "sa", "1234");//创建连接
					PreparedStatement sm=con.prepareStatement(sql_update);
					sm.setString(1, textField_28.getText());
					sm.setString(2,textField.getText());
					int count=sm.executeUpdate();
					//if(textField_28.getText()!=""&&textField.getText()!=""){
					if(count>=1){
						label_8.setVisible(true);//借书成功
						label_9.setVisible(false);
						
					}else{
						label_9.setVisible(true);//借书失败
						label_8.setVisible(false);
					}
					}catch(Exception e1){
						System.out.println(""+e1);
					}
			}
		});
		button_2.setBounds(495, 21, 93, 23);
		panel_2.add(button_2);
		
		 label_4 = new JLabel("\u67E5\u627E\u6210\u529F");//查找成功
		label_4.setBounds(141, 53, 73, 15);
		panel_2.add(label_4);
		 label_5 = new JLabel("\u67E5\u627E\u5931\u8D25");//查找失败
		label_5.setBounds(241, 53, 54, 15);
		panel_2.add(label_5);
		
		label_8 = new JLabel("\u501F\u4E66\u6210\u529F");//借书成功
		label_8.setBounds(332, 53, 54, 15);
		panel_2.add(label_8);
		label_9 = new JLabel("\u501F\u4E66\u5931\u8D25");//借书失败
		label_9.setBounds(420, 54, 54, 15);
		panel_2.add(label_9);
		label_4.setVisible(false);
		label_5.setVisible(false);
		label_8.setVisible(false);
		label_9.setVisible(false);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setForeground(Color.BLACK);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(10, 324, 674, 97);
		internalFrame.getContentPane().add(panel_3);
		
		textField_29 = new JTextField();
		textField_29.setText(" \u501F\u4E66\u7F16\u53F7");
		textField_29.setEditable(false);
		textField_29.setColumns(10);
		textField_29.setBounds(10, 10, 66, 21);
		panel_3.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setText("   \u59D3\u540D");
		textField_30.setEditable(false);
		textField_30.setColumns(10);
		textField_30.setBounds(77, 10, 66, 21);
		panel_3.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setText("   \u7C7B\u578B");
		textField_31.setEditable(false);
		textField_31.setColumns(10);
		textField_31.setBounds(144, 10, 66, 21);
		panel_3.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setText(" \u672A\u8FD8\u4E66");
		textField_32.setEditable(false);
		textField_32.setColumns(10);
		textField_32.setBounds(211, 10, 66, 21);
		panel_3.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setText("  \u53EF\u501F\u4E66");
		textField_33.setEditable(false);
		textField_33.setColumns(10);
		textField_33.setBounds(278, 10, 66, 21);
		panel_3.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setText(" \u501F\u9605\u671F\u9650");
		textField_34.setEditable(false);
		textField_34.setColumns(10);
		textField_34.setBounds(345, 10, 94, 21);
		panel_3.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setText(" \u6CE8\u518C\u65E5\u671F");
		textField_35.setEditable(false);
		textField_35.setColumns(10);
		textField_35.setBounds(439, 10, 74, 21);
		panel_3.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setText(" \u4F7F\u7528\u65F6\u95F4");
		textField_36.setEditable(false);
		textField_36.setColumns(10);
		textField_36.setBounds(511, 10, 66, 21);
		panel_3.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setText(" \u5230\u671F\u65F6\u95F4");
		textField_37.setEditable(false);
		textField_37.setColumns(10);
		textField_37.setBounds(575, 10, 89, 21);
		panel_3.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setEditable(false);
		textField_38.setColumns(10);
		textField_38.setBounds(575, 41, 89, 21);
		panel_3.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setEditable(false);
		textField_39.setColumns(10);
		textField_39.setBounds(511, 41, 66, 21);
		panel_3.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setEditable(false);
		textField_40.setColumns(10);
		textField_40.setBounds(439, 41, 74, 21);
		panel_3.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setEditable(false);
		textField_41.setColumns(10);
		textField_41.setBounds(345, 41, 94, 21);
		panel_3.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setEditable(false);
		textField_42.setColumns(10);
		textField_42.setBounds(278, 41, 66, 21);
		panel_3.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setEditable(false);
		textField_43.setColumns(10);
		textField_43.setBounds(211, 41, 66, 21);
		panel_3.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setEditable(false);
		textField_44.setColumns(10);
		textField_44.setBounds(144, 41, 66, 21);
		panel_3.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setEditable(false);
		textField_45.setColumns(10);
		textField_45.setBounds(77, 41, 66, 21);
		panel_3.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setEditable(false);
		textField_46.setColumns(10);
		textField_46.setBounds(10, 41, 66, 21);
		panel_3.add(textField_46);
		
		JLabel label_3 = new JLabel("\u501F\u9605\u56FE\u4E66\u4FE1\u606F");
		label_3.setBounds(10, 306, 89, 15);
		internalFrame.getContentPane().add(label_3);
		
		panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setForeground(Color.BLACK);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(10, 448, 625, 53);
		internalFrame.getContentPane().add(panel_4);
		
		button_5 = new JButton("\u5173\u95ED");    //关闭
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				internalFrame.setVisible(false);
				Main main_q=new Main();
				main_q.setVisible(true);
			}
		});
		button_5.setBounds(508, 20, 93, 23);
		panel_4.add(button_5);
		internalFrame.setVisible(true);
	}
}
