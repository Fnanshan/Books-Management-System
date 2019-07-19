package Test;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class userAdd extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel label_4;
	private JLabel label_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userAdd frame = new userAdd();
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
	public userAdd() {
		setTitle("\u6DFB\u52A0\u7528\u6237");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u7528\u6237\u540D");
		label.setBounds(87, 35, 54, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801");
		label_1.setBounds(87, 88, 54, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u786E\u8BA4\u5BC6\u7801");
		label_2.setBounds(87, 140, 54, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u767B\u5F55\u6743\u9650");
		label_3.setBounds(87, 188, 54, 15);
		contentPane.add(label_3);
		
		textField = new JTextField();
		textField.setBounds(163, 32, 147, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(163, 85, 147, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(163, 137, 147, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton button = new JButton("\u6DFB\u52A0");				//按钮“添加”
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//先判断username是否为空
				/*if(){
					
				}
				*/
				try{
					//String url="jdbc:sqlserver://localhost:1433;DatabaseName=图书管理系统";
					String url="jdbc:sqlserver://localhost:1433;DatabaseName=图书管理系统";
					//String sql0=" insert into admin_table(id,username,password) values (textField_0.getText(),textField.getText(),textField_1.getText())";			//更新管理员列表
					String sql0=" insert into admin_table(username,password) values (?,?)";			//更新管理员列表
					//String sql1="";								    							//更新学生列表
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();//加载驱动
					Connection con=DriverManager.getConnection(url, "sa", "1234");//创建连接
					PreparedStatement sm=null;										//如果是查询的SQL命令则使用executeQuery()执行SQL命令
																					//如果是插入/修改/删除的SQL命令则使用executeUpdate()执行SQL命令
	                sm=con.prepareStatement(sql0);									//执行SQL语句
	                
	               
	                //sm.setString(1, textField_0.getText());
	                sm.setString(1, textField.getText());							//将文本框里的内容发送给sm
	                sm.setString(2, textField_1.getText());
	                
	                label_5.setVisible(true);		//显示：“添加成功”
	                /*
	                String sql_select="select * from admin_table where userrname=? and password=?";
	                ResultSet rs=null;
	                rs=sm.executeQuery(sql_select);				//返回结果集 
	                if(rs.next()){
	                	String textField_username=rs.getString(1);
	                	if(textField_username=""){
	                		label_4.setVisible(true);		//显示：“添加失败”
	                	}
	              	}
	                */
	                int a=0;
	                a=sm.executeUpdate();				//如果不能添加用户，则显示：“添加失败”
	                
	                /*
	                  if(rs.next()){
	                	label_5.setVisible(true);		//显示：“添加成功”
	              	}
	              	*/
	                if(a<=0){
	                	//label_5.setVisible(true);		//显示：“添加成功”
	                	label_4.setVisible(true);		//显示：“添加失败”
	                }
	                
				}catch(Exception e1){
					System.out.println(""+e1);
				}
			}
		});
		button.setBounds(97, 228, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u53D6\u6D88");//取消
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.exit(0);
				Main main_q=new Main();
				main_q.setVisible(true);
			}
		});
		button_1.setBounds(210, 228, 93, 23);
		contentPane.add(button_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(179, 185, 124, 21);
		contentPane.add(comboBox);
		comboBox.addItem("系统管理员");
		comboBox.addItem("学生");
		
		label_4 = new JLabel("\u6DFB\u52A0\u5931\u8D25");//添加失败
		label_4.setBounds(320, 35, 81, 15);
		contentPane.add(label_4);
		
	    label_5 = new JLabel("\u6DFB\u52A0\u6210\u529F");
		label_5.setBounds(320, 70, 81, 15);
		contentPane.add(label_5);
		label_4.setVisible(false);
		label_5.setVisible(false);
		
	}
}

/*				数据库连接教程
 * 		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				try{
					String url="jdbc:sqlserver://localhost:1433;DatabaseName=图书管理系统";
				
					String sql0=" insert into admin_table(username,password) values (?,?)";			//更新管理员列表
					String sql1="";								    							//更新学生列表
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();//加载驱动
					Connection con=DriverManager.getConnection(url, "sa", "1234");//创建连接
					Statement sm=null;										//如果是查询的SQL命令则使用executeQuery()执行SQL命令
																					//如果是插入/修改/删除的SQL命令则使用executeUpdate()执行SQL命令
	                sm=con.Statement();									//执行SQL语句
	                sm.setString(1, textField.getText());							//将文本框里的内容发送给sm
	                sm.setString(2, textField_1.getText());
	                //查询
	                String sql_select="select * from admin_table where userrname=? and password=?";
	                Statement sm2=con.createment();
	                ResultSet rs2=sm2.executeQuery(sql_select);    
	               if(rs2.next())
	                
	                int a=0;
	                a=sm.executeUpdate();				//如果不能添加用户，则显示：“添加失败”
	                    
	                  if(rs.next()){
	                	label_5.setVisible(true);		//显示：“添加成功”
	              	}
	              	
	                if(a<=0){  
	                }
	                
				}catch(Exception e1){
					System.out.println(""+e1);
				}
			}
		});
 *
 * 
 * */
