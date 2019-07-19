package Test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;

public class BookDelete extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	JInternalFrame internalFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookDelete frame = new BookDelete();
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
	public BookDelete() {
		setTitle("\u5220\u9664\u4E66\u7C4D");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	 internalFrame = new JInternalFrame("New JInternalFrame",true,true,true);
		internalFrame.setBounds(88, 157, 278, 233);
		contentPane.add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u8981\u5220\u9664\u7684\u4E66\u540D\uFF1A");
		label.setBounds(67, 10, 141, 27);
		internalFrame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(79, 47, 83, 27);
		internalFrame.getContentPane().add(textField);
		textField.setText("\u300A\u300B");
		textField.setColumns(10);
		
		JButton button = new JButton("\u786E\u5B9A");     //确定
		button.setBounds(10, 95, 93, 23);
		internalFrame.getContentPane().add(button);
		
		JButton btnNewButton = new JButton("\u9000\u51FA");   //取消
		btnNewButton.setBounds(128, 95, 93, 23);
		internalFrame.getContentPane().add(btnNewButton);
		
		JLabel label_1 = new JLabel("\u4E66\u7C4D\u4E0D\u5B58\u5728");//书籍不存在
		label_1.setBounds(20, 132, 75, 15);
		internalFrame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u5220\u9664\u6210\u529F");//删除成功
		label_2.setBounds(138, 132, 83, 15);
		internalFrame.getContentPane().add(label_2);
		label_2.setVisible(false);
		label_1.setVisible(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main main_q=new Main();
				main_q.setVisible(true);
			 internalFrame.setVisible(false);
				
				
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String url="jdbc:sqlserver://localhost:1433;DatabaseName=图书管理系统";
					String sql_select_bookname="select * from book_infomation_table where bookname=?";
					String sql_delete="delete from book_infomation_table where bookname=?";
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();//加载驱动
					Connection con=DriverManager.getConnection(url, "sa", "1234");//创建连接
					PreparedStatement sm_select_book=con.prepareStatement(sql_select_bookname);		//根据书籍名称查找书籍
					sm_select_book.setString(1,textField.getText());
					ResultSet rs1=sm_select_book.executeQuery();
					if(rs1.next()){
						PreparedStatement sm_delete=con.prepareStatement(sql_delete);	
						sm_delete.setString(1,textField.getText());
						int count=sm_delete.executeUpdate();
						if(count>0){
							label_2.setVisible(true);	//删除成功
							label_1.setVisible(false);	//书籍存在
						}else{
							
						}
						label_2.setVisible(true);	//删除成功
						label_1.setVisible(false);	//书籍存在
					}else{
						label_1.setVisible(true);	//书籍不存在
						label_2.setVisible(false);//删除失败
					}
				}catch(Exception e3){
					System.out.println(""+e3);
				}
			}
		});
		internalFrame.setVisible(true);
	}

}
