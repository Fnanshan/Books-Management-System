/*
Statement
	PreparedStatement:
		1能输入条件式SQL语句（SQL中包含了变量）
		2利用set***的方法指定条件式SQL命令中的每一个变量的值
		3
		Example：String sql="insert to admin_table (username,password) ualues (?,?,?)";
		接下来就是设置在SQL命令中预留变量的值：set***()方法
		Example：setString()方法：
			setString(int parameterIndex, String x)
				parameterIndex:表示要设置SQL命令中的第几个变量
				x:

*/
package Test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class tips_JDBC extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tips_JDBC frame = new tips_JDBC();
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
	public tips_JDBC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
