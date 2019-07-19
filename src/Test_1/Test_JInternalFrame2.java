package Test_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test_JInternalFrame2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test_JInternalFrame2 frame = new Test_JInternalFrame2();
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
	public Test_JInternalFrame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(10, 29, 414, 232);
		contentPane.add(desktopPane);								//将desktopPane嵌套到contentPane上
		
		JButton button = new JButton("\u7CFB\u7EDF\u7BA1\u7406");	//按钮“系统管理”
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame",true,true,true);	
				internalFrame.setBounds(10, 10, 246, 150);
				desktopPane.add(internalFrame);								//将internalFrame嵌套到desktopPane上
				internalFrame.setVisible(true);
				internalFrame.getContentPane().setLayout(null);
			}
		});
		button.setBounds(0, -4, 93, 23);							//按钮“系统管理”
		contentPane.add(button);
		

	}
}
