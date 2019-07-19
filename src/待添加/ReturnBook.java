package Test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JInternalFrame;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;

public class ReturnBook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtIsbn;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
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
	private JPanel panel_2;
	private JButton button_2;
	private JButton button_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReturnBook frame = new ReturnBook();
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
	public ReturnBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JInternalFrame internalFrame = new JInternalFrame("\u8FD8\u4E66",true,true,true);
		internalFrame.setBounds(29, 10, 800, 400);
		contentPane.add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 26, 625, 73);
		internalFrame.getContentPane().add(panel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(131, 22, 238, 21);
		panel.add(textField);
		
		JButton button = new JButton("\u67E5\u8BE2");
		button.setBounds(379, 21, 93, 23);
		panel.add(button);
		
		JLabel label = new JLabel("\u56FE\u4E66\u7F16\u53F7\uFF1A");
		label.setBounds(48, 22, 73, 15);
		panel.add(label);
		
		JButton button_1 = new JButton("\u8FD8\u4E66");
		button_1.setBounds(495, 21, 93, 23);
		panel.add(button_1);
		
		JLabel label_1 = new JLabel("\u8FD8\u4E66\u4FE1\u606F");
		label_1.setBounds(10, 121, 89, 15);
		internalFrame.getContentPane().add(label_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.BLACK);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 139, 625, 97);
		internalFrame.getContentPane().add(panel_1);
		
		textField_1 = new JTextField();
		textField_1.setText(" \u56FE\u4E66\u7F16\u53F7");
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(10, 10, 66, 21);
		panel_1.add(textField_1);
		
		txtIsbn = new JTextField();
		txtIsbn.setText("   ISBN");
		txtIsbn.setEditable(false);
		txtIsbn.setColumns(10);
		txtIsbn.setBounds(77, 10, 66, 21);
		panel_1.add(txtIsbn);
		
		textField_3 = new JTextField();
		textField_3.setText("   \u4E66\u540D");
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(144, 10, 66, 21);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText(" \u501F\u4E66\u7F16\u53F7");
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(211, 10, 66, 21);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText(" \u501F\u9605\u65E5\u671F");
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(278, 10, 66, 21);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText(" \u53EF\u501F\u5929\u6570");
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(345, 10, 66, 21);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText(" \u8D85\u671F\u5929\u6570");
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(412, 10, 66, 21);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText(" \u5904\u7F5A\u91D1\u989D");
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(479, 10, 66, 21);
		panel_1.add(textField_8);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(479, 41, 66, 21);
		panel_1.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(412, 41, 66, 21);
		panel_1.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(345, 41, 66, 21);
		panel_1.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(278, 41, 66, 21);
		panel_1.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(211, 41, 66, 21);
		panel_1.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBounds(144, 41, 66, 21);
		panel_1.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(77, 41, 66, 21);
		panel_1.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBounds(10, 41, 66, 21);
		panel_1.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBounds(10, 66, 66, 21);
		panel_1.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBounds(77, 66, 66, 21);
		panel_1.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBounds(144, 66, 66, 21);
		panel_1.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBounds(211, 66, 66, 21);
		panel_1.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBounds(278, 66, 66, 21);
		panel_1.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setEditable(false);
		textField_24.setColumns(10);
		textField_24.setBounds(345, 66, 66, 21);
		panel_1.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setEditable(false);
		textField_25.setColumns(10);
		textField_25.setBounds(412, 66, 66, 21);
		panel_1.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setEditable(false);
		textField_26.setColumns(10);
		textField_26.setBounds(479, 66, 66, 21);
		panel_1.add(textField_26);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setForeground(Color.BLACK);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 270, 625, 67);
		internalFrame.getContentPane().add(panel_2);
		
		button_2 = new JButton("\u6E05\u7A7A");
		button_2.setBounds(306, 23, 93, 23);
		panel_2.add(button_2);
		
		button_3 = new JButton("\u53D6\u6D88");
		button_3.setBounds(440, 23, 93, 23);
		panel_2.add(button_3);
		
		JCheckBox checkBox = new JCheckBox("\u8D85\u671F\u7F5A\u6B3E");
		checkBox.setBounds(78, 23, 103, 23);
		panel_2.add(checkBox);
		internalFrame.setVisible(true);
	}
}
