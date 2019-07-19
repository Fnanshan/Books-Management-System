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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BorrowBookList extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	//
	JLabel label_8;
	JLabel label_9;
	JInternalFrame internalFrame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BorrowBookList frame = new BorrowBookList();
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
	public BorrowBookList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 internalFrame = new JInternalFrame("\u501F\u9605\u4FE1\u606F\u67E5\u8BE2",true,true,true);
		internalFrame.setBounds(29, 10, 800, 400);
		contentPane.add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(69, 26, 625, 101);
		internalFrame.getContentPane().add(panel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(137, 22, 285, 21);
		panel.add(textField);
		
		JButton button = new JButton("\u67E5\u627E");     //查找功能
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String url="jdbc:sqlserver://localhost:1433;DatabaseName=图书管理系统";
					/*
					String sql_select_sname="select sname from borrow_book_table,student_table where borrow_book_table.sid=student_table.sid and borrow_book_table.sid=?";
					String sql_select_isbn_bookname="select book_infomation_table.isbn ,bookname from book_infomation_table,book_id_table"
												+ " where book_id_table.isbn=book_infomation_table.isbn "
													+ "and book_infomation_table.isbn "
															+ "in("
															+ "select ISBN from borrow_book_table,book_id_table "
															+ "where borrow_book_table.bookNumber=book_id_table.bookNumber)";
					*/
					String sql="select DISTINCT student_table.sname,	book_infomation_table.isbn ,	bookname"
							+ " from student_table,	book_infomation_table,	book_id_table,	borrow_book_table where student_table.sid=borrow_book_table.sid "
							+ "and book_id_table.isbn=book_infomation_table.isbn"
							+ " and book_infomation_table.isbn "
							+ "in("
							+ "select ISBN "
							+ "from borrow_book_table,book_id_table"
							+ " where borrow_book_table.bookNumber=book_id_table.bookNumber"
							+ " and book_id_table.bookNumber in("
								+ "select bookNumber from  borrow_book_table "
								+ "where borrow_book_table.sid=?))";
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();//加载驱动
					Connection con=DriverManager.getConnection(url, "sa", "1234");//创建连接
					PreparedStatement sm_sname=con.prepareStatement(sql);
				    sm_sname.setString(1, textField.getText());
				    ResultSet rs_sname=sm_sname.executeQuery();
				    if(rs_sname.next()){
				    	label_8.setVisible(true);
				    	label_9.setVisible(false);
				    	textField_1.setText(rs_sname.getString(1));
				    	textField_2.setText(rs_sname.getString(2));
				    	textField_5.setText(rs_sname.getString(3));//第一行：姓名/ISBN/书籍名字
				    	if(rs_sname.next()){
				    		textField_3.setText(rs_sname.getString(2));
				    		textField_6.setText(rs_sname.getString(3));
				    		
				    		if(rs_sname.next()){
				    			textField_4.setText(rs_sname.getString(2));
					    		textField_7.setText(rs_sname.getString(3));
				    		}
			
				    	}
				    	
				    	
				    }else{
				    	label_9.setVisible(true);
				    	label_8.setVisible(false);
				    	textField_1.setText("");
				    	textField_2.setText("");
				    	textField_5.setText("");
				    	textField_3.setText("");
				    	textField_4.setText("");
				    	textField_6.setText("");
				    	textField_7.setText("");
				    	
				    	
				    }
					
					
					}catch(Exception e1){
						System.out.println(""+e1);
					}
			}
		});
		button.setBounds(444, 21, 93, 23);
		panel.add(button);
		
		JLabel label = new JLabel("\u501F\u4E66\u7F16\u53F7\uFF1A");
		label.setBounds(59, 25, 68, 15);
		panel.add(label);
		
		 label_8 = new JLabel("\u67E5\u627E\u6210\u529F");//查找成功
		label_8.setBounds(137, 76, 54, 15);
		panel.add(label_8);
		 label_9 = new JLabel("\u67E5\u627E\u5931\u8D25");//查找失败
		label_9.setBounds(242, 76, 54, 15);
		panel.add(label_9);
		label_8.setVisible(false);
		label_9.setVisible(false);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.BLACK);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(69, 137, 625, 203);
		internalFrame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_1 = new JLabel("\u59D3\u540D\uFF1A");
		label_1.setBounds(37, 27, 54, 15);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("\u501F\u9605\u56FE\u4E66\u5982\u4E0B\uFF1A");
		label_2.setBounds(37, 57, 100, 15);
		panel_1.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(80, 24, 84, 21);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblIsbn = new JLabel("ISBN:");
		lblIsbn.setBounds(37, 87, 54, 15);
		panel_1.add(lblIsbn);
		
		JLabel label_3 = new JLabel("ISBN:");
		label_3.setBounds(37, 112, 54, 15);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("ISBN:");
		label_4.setBounds(37, 137, 54, 15);
		panel_1.add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(68, 82, 66, 21);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(68, 112, 66, 21);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(68, 137, 66, 21);
		panel_1.add(textField_4);
		
		JLabel label_5 = new JLabel("\u4E66\u540D\uFF1A");
		label_5.setBounds(158, 87, 42, 15);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("\u4E66\u540D\uFF1A");
		label_6.setBounds(158, 112, 42, 15);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("\u4E66\u540D\uFF1A");
		label_7.setBounds(158, 137, 42, 15);
		panel_1.add(label_7);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(194, 84, 66, 21);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(194, 109, 66, 21);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(194, 134, 66, 21);
		panel_1.add(textField_7);
		
		JButton button_1 = new JButton("\u53D6\u6D88");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main main_q=new Main();
				main_q.setVisible(true);
				internalFrame.setVisible(false);
			}
		});
		button_1.setBounds(462, 156, 93, 23);
		panel_1.add(button_1);
		internalFrame.setVisible(true);
	}
}
