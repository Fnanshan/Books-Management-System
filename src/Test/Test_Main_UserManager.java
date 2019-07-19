package Test;

import java.awt.EventQueue;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JInternalFrame;
import javax.swing.JButton;

public class Test_Main_UserManager extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test_Main_UserManager test_Main_usermanager = new Test_Main_UserManager();
					test_Main_usermanager.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Test_Main_UserManager() {
		setBounds(100, 100, 293, 199);
		getContentPane().setLayout(null);
		
		JButton button = new JButton("\u6DFB\u52A0\u7528\u6237");
		button.setBounds(59, 32, 117, 23);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("\u4FEE\u6539\u7528\u6237\u5BC6\u7801");
		button_1.setBounds(59, 79, 117, 23);
		getContentPane().add(button_1);
		
		JButton btnNewButton = new JButton("\u5220\u9664\u7528\u6237");
		btnNewButton.setBounds(59, 125, 117, 23);
		getContentPane().add(btnNewButton);

	}

}
