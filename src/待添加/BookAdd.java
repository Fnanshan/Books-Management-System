package Test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class BookAdd extends JFrame {

	private JPanel contentPane;
	private JTextField txtIsbn;
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
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JPanel panel;
	private JTextField textField_35;
	private JTextField textField_37;
	private JTextField textField_39;
	private JTextField textField_36;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookAdd frame = new BookAdd();
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
	public BookAdd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JInternalFrame internalFrame = new JInternalFrame("\u589E\u52A0\u56FE\u4E66\u4FE1\u606F",true,true,true);
		internalFrame.setBounds(29, 10, 800, 541);
		contentPane.add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		
		txtIsbn = new JTextField();
		txtIsbn.setEditable(false);
		txtIsbn.setText("   ISBN");
		txtIsbn.setBounds(51, 40, 66, 21);
		internalFrame.getContentPane().add(txtIsbn);
		txtIsbn.setColumns(10);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setText("   \u4E66\u540D");
		textField.setBounds(118, 40, 66, 21);
		internalFrame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setText(" \u56FE\u4E66\u7C7B\u578B");
		textField_1.setBounds(185, 40, 66, 21);
		internalFrame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setText("   \u4F5C\u8005");
		textField_2.setBounds(252, 40, 66, 21);
		internalFrame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setText("   \u4EF7\u683C");
		textField_3.setBounds(319, 40, 66, 21);
		internalFrame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setText("  \u51FA\u7248\u793E");
		textField_4.setBounds(386, 40, 66, 21);
		internalFrame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setText(" \u51FA\u7248\u65E5\u671F");
		textField_5.setBounds(453, 40, 66, 21);
		internalFrame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setText("   \u6570\u91CF");
		textField_6.setBounds(520, 40, 66, 21);
		internalFrame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setText("   \u5185\u5BB9");
		textField_7.setBounds(587, 40, 66, 21);
		internalFrame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBounds(51, 71, 66, 21);
		internalFrame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(118, 71, 66, 21);
		internalFrame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(185, 71, 66, 21);
		internalFrame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(252, 71, 66, 21);
		internalFrame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(319, 71, 66, 21);
		internalFrame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(386, 71, 66, 21);
		internalFrame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(453, 71, 66, 21);
		internalFrame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(520, 71, 66, 21);
		internalFrame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBounds(587, 71, 66, 21);
		internalFrame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(587, 96, 66, 21);
		internalFrame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBounds(520, 96, 66, 21);
		internalFrame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBounds(453, 96, 66, 21);
		internalFrame.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBounds(386, 96, 66, 21);
		internalFrame.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBounds(319, 96, 66, 21);
		internalFrame.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBounds(252, 96, 66, 21);
		internalFrame.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBounds(185, 96, 66, 21);
		internalFrame.getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setEditable(false);
		textField_24.setColumns(10);
		textField_24.setBounds(118, 96, 66, 21);
		internalFrame.getContentPane().add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setEditable(false);
		textField_25.setColumns(10);
		textField_25.setBounds(51, 96, 66, 21);
		internalFrame.getContentPane().add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setEditable(false);
		textField_26.setColumns(10);
		textField_26.setBounds(51, 121, 66, 21);
		internalFrame.getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setEditable(false);
		textField_27.setColumns(10);
		textField_27.setBounds(118, 121, 66, 21);
		internalFrame.getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setEditable(false);
		textField_28.setColumns(10);
		textField_28.setBounds(185, 121, 66, 21);
		internalFrame.getContentPane().add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setEditable(false);
		textField_29.setColumns(10);
		textField_29.setBounds(252, 121, 66, 21);
		internalFrame.getContentPane().add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setEditable(false);
		textField_30.setColumns(10);
		textField_30.setBounds(319, 121, 66, 21);
		internalFrame.getContentPane().add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setEditable(false);
		textField_31.setColumns(10);
		textField_31.setBounds(386, 121, 66, 21);
		internalFrame.getContentPane().add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setEditable(false);
		textField_32.setColumns(10);
		textField_32.setBounds(453, 121, 66, 21);
		internalFrame.getContentPane().add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setEditable(false);
		textField_33.setColumns(10);
		textField_33.setBounds(520, 121, 66, 21);
		internalFrame.getContentPane().add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setEditable(false);
		textField_34.setColumns(10);
		textField_34.setBounds(587, 121, 66, 21);
		internalFrame.getContentPane().add(textField_34);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setForeground(Color.BLACK);
		panel.setBounds(40, 28, 625, 142);
		internalFrame.getContentPane().add(panel);
		
		JLabel label = new JLabel("\u589E\u52A0\u56FE\u4E66\u4FE1\u606F");
		label.setBounds(40, 10, 89, 15);
		internalFrame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("  ISBN\uFF1A");
		lblNewLabel.setBounds(51, 204, 54, 15);
		internalFrame.getContentPane().add(lblNewLabel);
		
		textField_35 = new JTextField();
		textField_35.setBounds(118, 201, 133, 21);
		internalFrame.getContentPane().add(textField_35);
		textField_35.setColumns(10);
		
		JLabel label_1 = new JLabel("  \u4E66\u540D\uFF1A");
		label_1.setBounds(273, 204, 54, 15);
		internalFrame.getContentPane().add(label_1);
		
		textField_37 = new JTextField();
		textField_37.setEditable(false);
		textField_37.setBounds(504, 230, 133, 121);
		internalFrame.getContentPane().add(textField_37);
		textField_37.setColumns(10);
		
		JButton button = new JButton("\u6D4F\u89C8");
		button.setBounds(527, 361, 93, 23);
		internalFrame.getContentPane().add(button);
		
		JLabel label_2 = new JLabel(" \u56FE\u4E66\u7C7B\u578B\uFF1A");
		label_2.setBounds(51, 254, 77, 15);
		internalFrame.getContentPane().add(label_2);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(334, 251, 133, 21);
		internalFrame.getContentPane().add(textField_39);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(337, 201, 133, 21);
		internalFrame.getContentPane().add(textField_36);
		
		JLabel label_3 = new JLabel("\u51FA\u7248\u793E\uFF1A");
		label_3.setBounds(283, 254, 54, 15);
		internalFrame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("  \u4F5C\u8005\uFF1A");
		label_4.setBounds(51, 307, 54, 15);
		internalFrame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("  \u4EF7\u683C\uFF1A");
		label_5.setBounds(273, 307, 54, 15);
		internalFrame.getContentPane().add(label_5);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(118, 304, 133, 21);
		internalFrame.getContentPane().add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(334, 304, 133, 21);
		internalFrame.getContentPane().add(textField_41);
		
		JLabel label_6 = new JLabel(" \u51FA\u7248\u65E5\u671F\uFF1A");
		label_6.setBounds(52, 351, 77, 15);
		internalFrame.getContentPane().add(label_6);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(118, 348, 133, 21);
		internalFrame.getContentPane().add(textField_42);
		
		JLabel label_7 = new JLabel("  \u6570\u91CF\uFF1A");
		label_7.setBounds(273, 351, 54, 15);
		internalFrame.getContentPane().add(label_7);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(334, 348, 133, 21);
		internalFrame.getContentPane().add(textField_43);
		
		JLabel label_8 = new JLabel(" \u5185\u5BB9\uFF1A");
		label_8.setBounds(51, 392, 77, 15);
		internalFrame.getContentPane().add(label_8);
		
		textField_44 = new JTextField();
		textField_44.setBounds(118, 389, 349, 21);
		internalFrame.getContentPane().add(textField_44);
		textField_44.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.BLACK);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(40, 183, 625, 238);
		internalFrame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(79, 69, 132, 21);
		panel_1.add(comboBox);
		comboBox.addItem("请选择图书类型");
		comboBox.addItem("小说");
		comboBox.addItem("漫画");
		comboBox.addItem("历史");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(40, 432, 625, 69);
		internalFrame.getContentPane().add(panel_2);
		panel_2.setForeground(Color.BLACK);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setLayout(null);
		
		JButton button_1 = new JButton("\u6DFB\u52A0");
		button_1.setBounds(339, 36, 93, 23);
		panel_2.add(button_1);
		
		JButton button_2 = new JButton("\u5220\u9664");
		button_2.setBounds(466, 36, 93, 23);
		panel_2.add(button_2);
		internalFrame.setVisible(true);
	}
}
