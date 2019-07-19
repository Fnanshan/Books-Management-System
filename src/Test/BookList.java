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
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class BookList extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
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
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JLabel label_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel label_3;
	private JLabel label_4;
	private JComboBox comboBox;
	private JButton button_1;
	JInternalFrame internalFrame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookList frame = new BookList();
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
	public BookList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 internalFrame = new JInternalFrame("\u4E66\u7C4D\u4FE1\u606F\u67E5\u8BE2",true,true,true);
		internalFrame.setBounds(29, 10, 800, 541);
		contentPane.add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(36, 41, 625, 136);
		internalFrame.getContentPane().add(panel);
		
		textField = new JTextField();
		textField.setText("   ISBN");
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(10, 10, 66, 21);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("   \u4E66\u540D");
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(77, 10, 66, 21);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText(" \u56FE\u4E66\u7C7B\u578B");
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(144, 10, 66, 21);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("   \u4F5C\u8005");
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(211, 10, 66, 21);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("   \u4EF7\u683C");
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(278, 10, 66, 21);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("  \u51FA\u7248\u793E");
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(345, 10, 66, 21);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText(" \u51FA\u7248\u65E5\u671F");
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(412, 10, 66, 21);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("   \u6570\u91CF");
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(479, 10, 66, 21);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText(" \u501F\u51FA\u6570\u91CF");
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(546, 10, 66, 21);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(546, 41, 66, 21);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(479, 41, 66, 21);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(412, 41, 66, 21);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(345, 41, 66, 21);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(278, 41, 66, 21);
		panel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(211, 41, 66, 21);
		panel.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(144, 41, 66, 21);
		panel.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBounds(77, 41, 66, 21);
		panel.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(10, 41, 66, 21);
		panel.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBounds(10, 66, 66, 21);
		panel.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBounds(77, 66, 66, 21);
		panel.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBounds(144, 66, 66, 21);
		panel.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBounds(211, 66, 66, 21);
		panel.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBounds(278, 66, 66, 21);
		panel.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBounds(345, 66, 66, 21);
		panel.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setEditable(false);
		textField_24.setColumns(10);
		textField_24.setBounds(412, 66, 66, 21);
		panel.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setEditable(false);
		textField_25.setColumns(10);
		textField_25.setBounds(479, 66, 66, 21);
		panel.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setEditable(false);
		textField_26.setColumns(10);
		textField_26.setBounds(546, 66, 66, 21);
		panel.add(textField_26);
		
		JLabel label = new JLabel("\u7ED3\u679C");
		label.setBounds(36, 23, 89, 15);
		internalFrame.getContentPane().add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.BLACK);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(36, 201, 625, 288);
		internalFrame.getContentPane().add(panel_1);
		
		JRadioButton radioButton = new JRadioButton("ISBN");
		buttonGroup.add(radioButton);
		radioButton.setBounds(60, 21, 58, 23);
		panel_1.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u4E66\u540D");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(120, 21, 58, 23);
		panel_1.add(radioButton_1);
		
		textField_27 = new JTextField();
		textField_27.setText("\u300A\u300B");
		textField_27.setColumns(10);
		textField_27.setBounds(203, 22, 271, 21);
		panel_1.add(textField_27);
		
		JButton button = new JButton("\u67E5\u627E"); 						  //查找
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String url="jdbc:sqlserver://localhost:1433;DatabaseName=图书管理系统";
					String sql_select="select * from book_infomation_table where bookname=? or isbn=? or author=? or booktypeid=? or press=? or (pressdate>=? and pressdate<=?)";
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();//加载驱动
					Connection con=DriverManager.getConnection(url, "sa", "1234");//创建连接
					PreparedStatement sm=con.prepareStatement(sql_select);
					 sm.setString(1, textField_27.getText());
					 sm.setString(2,textField_27.getText());
					 sm.setString(3, textField_28.getText());
					 //图书类型如下：
					 sm.setString(4,comboBox.getSelectedItem().toString());
					// System.out.println(comboBox.getSelectedItem().toString());
					 //
					 sm.setString(5, textField_29.getText());
					 sm.setString(6, textField_30.getText());
					 sm.setString(7, textField_31.getText());
					 //System.out.println("ISBN IS NULL000");
					 String ISBN=textField_27.getText();
					 
					 /*
					 if(textField_27.getText()==""){
						 //sm.setString(3, textField_28.getText());
						 System.out.println("ISBN IS NULL");
							 if(textField_28.getText()==""){
								 sm.setString(4,comboBox.getSelectedItem().toString());
								 if(comboBox.getSelectedItem().toString()==""){
									 sm.setString(5, textField_29.getText());
									 if(textField_29.getText()==""){
										 sm.setString(6, textField_30.getText());
										 if(textField_30.getText()==""){
											 sm.setString(7, textField_31.getText());
											 if(textField_31.getText()==""){
												 //System.out.println("没有书籍");
											 }
										 }
									 }
								 }
							 }
					 }
					 */
					ResultSet rs=sm.executeQuery();		
					 if(rs.next()){
						 
						textField_17.setText(rs.getString(6));
						textField_16.setText(rs.getString(2));
						textField_15.setText(rs.getString(3));
						textField_14.setText(rs.getString(5));
						textField_13.setText(rs.getString(7));
						textField_12.setText(rs.getString(4));
						textField_11.setText(rs.getString(12));
						textField_10.setText(rs.getString(10));
						textField_9.setText(rs.getString(11));	
						
						 label_3.setVisible(true);//查找成功
						 label_4.setVisible(false);
						
					}else{
						label_4.setVisible(true);//查找失败
						label_3.setVisible(false);
						textField_17.setText("");
						textField_16.setText("");
						textField_15.setText("");
						textField_14.setText("");
						textField_13.setText("");
						textField_12.setText("");
						textField_11.setText("");
						textField_10.setText("");
						textField_9.setText("");	
					}
					
					}catch(Exception e1){
						System.out.println(""+e1);
					}
			}
		});
		button.setBounds(492, 21, 93, 23);
		panel_1.add(button);
		
		JCheckBox checkBox = new JCheckBox("\u4F5C\u8005");
		checkBox.setBounds(120, 71, 58, 23);
		panel_1.add(checkBox);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(203, 72, 271, 21);
		panel_1.add(textField_28);
		
		comboBox = new JComboBox();
		comboBox.setBounds(203, 118, 158, 21);
		panel_1.add(comboBox);
		comboBox.addItem("请选择图书类型");
		comboBox.addItem("小说");
		comboBox.addItem("漫画");
		comboBox.addItem("历史");
		
		JLabel label_1 = new JLabel(" \u56FE\u4E66\u7C7B\u578B\uFF1A");
		label_1.setBounds(120, 121, 77, 15);
		panel_1.add(label_1);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(203, 161, 271, 21);
		panel_1.add(textField_29);
		
		JCheckBox checkBox_1 = new JCheckBox("\u51FA\u7248\u793E");
		checkBox_1.setBounds(120, 160, 71, 23);
		panel_1.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("\u51FA\u7248\u65E5\u671F");
		checkBox_2.setBounds(120, 204, 77, 23);
		panel_1.add(checkBox_2);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(203, 205, 136, 21);
		panel_1.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(382, 205, 136, 21);
		panel_1.add(textField_31);
		
		label_2 = new JLabel("\u5230");
		label_2.setBounds(357, 208, 17, 15);
		panel_1.add(label_2);
		
		label_3 = new JLabel("\u67E5\u627E\u6210\u529F");//查找成功
		label_3.setBounds(492, 75, 54, 15);
		panel_1.add(label_3);
		label_3.setVisible(false);
		
		label_4 = new JLabel("\u67E5\u627E\u5931\u8D25");//查找失败
		label_4.setBounds(492, 118, 54, 15);
		panel_1.add(label_4);
		
		button_1 = new JButton("\u53D6\u6D88");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main main_q=new Main();
				main_q.setVisible(true);
			 internalFrame.setVisible(false);
			}
		});
		button_1.setBounds(492, 238, 93, 23);
		panel_1.add(button_1);
		label_4.setVisible(false);
		internalFrame.setVisible(true);
	}

}
