/*
Statement
	PreparedStatement:
		1����������ʽSQL��䣨SQL�а����˱�����
		2����set***�ķ���ָ������ʽSQL�����е�ÿһ��������ֵ
		3
		Example��String sql="insert to admin_table (username,password) ualues (?,?,?)";
		����������������SQL������Ԥ��������ֵ��set***()����
		Example��setString()������
			setString(int parameterIndex, String x)
				parameterIndex:��ʾҪ����SQL�����еĵڼ�������
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
