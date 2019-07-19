package Test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;

public class Main_Test1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Test1 frame = new Main_Test1();///
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
	public Main_Test1() {
		setTitle("\u56FE\u4E66\u7BA1\u7406\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/*
		JButton btnNewButton = new JButton("\u7CFB\u7EDF\u7BA1\u7406");						//"系统管理"按钮
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				
			}
		});
		*/
		/*
		btnNewButton.setBounds(0, 0, 104, 23);
		contentPane.add(btnNewButton);
		*/
		
		JButton btnNewButton_1 = new JButton("\u4E66\u7C4D\u7BA1\u7406");				//”书籍管理“按钮
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(103, 0, 83, 23);
		contentPane.add(btnNewButton_1);
		
		JButton button = new JButton("\u501F\u4E66\u7BA1\u7406");
		button.setBounds(185, 0, 93, 23);
		contentPane.add(button);
		
		JButton btnNewButton_2 = new JButton("\u8FD8\u4E66\u7BA1\u7406");
		btnNewButton_2.setBounds(275, 0, 93, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnXinxich = new JButton("\u4FE1\u606F\u67E5\u8BE2");
		btnXinxich.setBounds(366, 0, 93, 23);
		contentPane.add(btnXinxich);
		
		JButton button_1 = new JButton("\u89C6\u56FE");
		button_1.setBounds(459, 0, 93, 23);
		contentPane.add(button_1);
		
		JButton btnNewButton_3 = new JButton("\u5E2E\u52A9");
		btnNewButton_3.setBounds(529, 0, 93, 23);
		contentPane.add(btnNewButton_3);

	}
}
