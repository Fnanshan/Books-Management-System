package Test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Information_query extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Information_query frame = new Information_query();
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
	public Information_query() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 217);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("\u4E66\u7C4D\u4FE1\u606F\u67E5\u8BE2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookList booklist=new BookList();
				booklist.setVisible(true);
			}
		});
		button.setBounds(81, 45, 145, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u501F\u9605\u4FE1\u606F\u67E5\u8BE2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BorrowBookList borrowbooklist=new BorrowBookList();
				borrowbooklist.setVisible(true);
			}
		});
		button_1.setBounds(81, 106, 145, 23);
		contentPane.add(button_1);
	}

}
