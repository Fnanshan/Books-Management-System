package Test;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

public class BookModify extends JFrame {

	private JPanel contentPane;
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
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_27;
	private JButton button_4;
	private JLabel label_10;
	private JLabel label_11;
	//
	private PreparedStatement sm1;
	private JLabel label_12;
	private JLabel label_0;
	private JButton button_xiugai;
	private JLabel label_ISBN;
	private JLabel label_Bookname;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookModify frame = new BookModify();
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
	public BookModify() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label;
		//
		JInternalFrame internalFrame = new JInternalFrame("\u4FEE\u6539\u56FE\u4E66\u4FE1\u606F",true,true,true);
		internalFrame.setBounds(29, 10, 800, 541);
		contentPane.add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		
		JLabel label_13;
		label_0 = new JLabel("\u4FEE\u6539\u56FE\u4E66\u4FE1\u606F");
		label_0.setBounds(40, 10, 89, 15);
		internalFrame.getContentPane().add(label_0);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(40, 28, 663, 97);
		internalFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setText("   ISBN");
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(10, 10, 66, 21);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("   \u4E66\u540D");
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(77, 10, 66, 21);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText(" \u56FE\u4E66\u7C7B\u578B");
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(144, 10, 66, 21);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("   \u4F5C\u8005");
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(211, 10, 66, 21);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("   \u4EF7\u683C");
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(278, 10, 66, 21);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("  \u51FA\u7248\u793E");
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(345, 10, 66, 21);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText(" \u51FA\u7248\u65E5\u671F");
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(412, 10, 66, 21);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("   \u6570\u91CF");
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(479, 10, 66, 21);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText("   \u5185\u5BB9");
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(546, 10, 107, 21);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(546, 41, 107, 21);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(479, 41, 66, 21);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(412, 41, 66, 21);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(345, 41, 66, 21);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(278, 41, 66, 21);
		panel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(211, 41, 66, 21);
		panel.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(144, 41, 66, 21);
		panel.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBounds(77, 41, 66, 21);
		panel.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(10, 41, 66, 21);
		panel.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBounds(10, 66, 66, 21);
		panel.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBounds(77, 66, 66, 21);
		panel.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBounds(144, 66, 66, 21);
		panel.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBounds(211, 66, 66, 21);
		panel.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBounds(278, 66, 66, 21);
		panel.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBounds(345, 66, 66, 21);
		panel.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setEditable(false);
		textField_24.setColumns(10);
		textField_24.setBounds(412, 66, 66, 21);
		panel.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setEditable(false);
		textField_25.setColumns(10);
		textField_25.setBounds(479, 66, 66, 21);
		panel.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setEditable(false);
		textField_26.setColumns(10);
		textField_26.setBounds(546, 66, 107, 21);
		panel.add(textField_26);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.BLACK);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(40, 448, 663, 53);
		internalFrame.getContentPane().add(panel_1);
		
		
		/*					�޸�ͼ����Ϣ
		 *��ѯISBN�Ƿ���� 
		 * 
		 */
		JButton button_xiugai;
		button_xiugai = new JButton("\u4FEE\u6539");     //�޸�
		button_xiugai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String url="jdbc:sqlserver://localhost:1433;DatabaseName=ͼ�����ϵͳ";
					//String sql_select_bookname="select * from book_infomation_table where bookname=?";
					//String sql_select_isbn="select * from book_infomation_table where isbn=?";
					String sql_update_book="Update  book_infomation_table set press=?,author=?,price=?,pressdate=?,bookcount=?,content=? where bookname=?";
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();//��������
					Connection con=DriverManager.getConnection(url, "sa", "1234");//��������
					PreparedStatement sm_update=con.prepareStatement(sql_update_book);		//�޸��鼮��Ϣ
					sm_update.setString(1, textField_39.getText());
					sm_update.setString(2, textField_40.getText());
					sm_update.setString(3, textField_41.getText());
					sm_update.setString(4, textField_43.getText());
					sm_update.setString(5, textField_42.getText());
					sm_update.setString(6, textField_44.getText());
					sm_update.setString(7,textField_37.getText());
					int update_count=sm_update.executeUpdate();
					if(update_count>=1){
						label_12.setVisible(true);
					}
					
				}catch(Exception e2){
					System.out.println(""+e2);
				}
			}
		});
		button_xiugai.setBounds(275, 20, 93, 23);
		panel_1.add(button_xiugai);
		
		JButton button_1 = new JButton("\u5220\u9664");    //ɾ��
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//internalFrame_BookDelete.setVisible(true);
				//����ʹ�õ���
				BookDelete button_BookDelete=new BookDelete();
				button_BookDelete.setVisible(true);
			}
		});
		button_1.setBounds(393, 20, 93, 23);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("\u53D6\u6D88");    //ȡ��
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				internalFrame.setVisible(false);
				Main main_q=new Main();
				main_q.setVisible(true);
			}
		});
		button_2.setBounds(508, 20, 93, 23);
		panel_1.add(button_2);
		
		label_12 = new JLabel("\u4FEE\u6539\u6210\u529F");
		label_12.setBounds(58, 20, 75, 15);
		panel_1.add(label_12);
		label_12.setVisible(false);
		
		JLabel label_INBN;
		label_ISBN = new JLabel("  ISBN\uFF1A");
		label_ISBN.setBounds(51, 221, 54, 15);
		internalFrame.getContentPane().add(label_ISBN);
		
		textField_36 = new JTextField();
		textField_36.setEditable(false);
		textField_36.setColumns(10);
		textField_36.setBounds(118, 218, 133, 21);
		internalFrame.getContentPane().add(textField_36);
		
		JLabel label_bookname;
		label_Bookname = new JLabel("  \u4E66\u540D\uFF1A");
		label_Bookname.setBounds(273, 221, 54, 15);
		internalFrame.getContentPane().add(label_Bookname);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(337, 218, 133, 21);
		internalFrame.getContentPane().add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setEditable(false);
		textField_38.setColumns(10);
		textField_38.setBounds(504, 247, 133, 121);
		internalFrame.getContentPane().add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(334, 268, 133, 21);
		internalFrame.getContentPane().add(textField_39);
		
		JLabel label_3 = new JLabel("\u51FA\u7248\u793E\uFF1A");
		label_3.setBounds(283, 271, 54, 15);
		internalFrame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel(" \u56FE\u4E66\u7C7B\u578B\uFF1A");
		label_4.setBounds(51, 271, 77, 15);
		internalFrame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("  \u4F5C\u8005\uFF1A");
		label_5.setBounds(51, 324, 54, 15);
		internalFrame.getContentPane().add(label_5);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(118, 321, 133, 21);
		internalFrame.getContentPane().add(textField_40);
		
		JLabel label_6 = new JLabel("  \u4EF7\u683C\uFF1A");
		label_6.setBounds(273, 324, 54, 15);
		internalFrame.getContentPane().add(label_6);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(334, 321, 133, 21);
		internalFrame.getContentPane().add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(334, 365, 133, 21);
		internalFrame.getContentPane().add(textField_42);
		
		JLabel label_7 = new JLabel("  \u6570\u91CF\uFF1A");
		label_7.setBounds(273, 368, 54, 15);
		internalFrame.getContentPane().add(label_7);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(118, 365, 133, 21);
		internalFrame.getContentPane().add(textField_43);
		
		JLabel label_8 = new JLabel(" \u51FA\u7248\u65E5\u671F\uFF1A");
		label_8.setBounds(52, 368, 77, 15);
		internalFrame.getContentPane().add(label_8);
		
		JButton button_3 = new JButton("\u6D4F\u89C8");
		button_3.setBounds(527, 378, 93, 23);
		internalFrame.getContentPane().add(button_3);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(118, 406, 349, 21);
		internalFrame.getContentPane().add(textField_44);
		
		JLabel label_9 = new JLabel(" \u5185\u5BB9\uFF1A");
		label_9.setBounds(51, 409, 77, 15);
		internalFrame.getContentPane().add(label_9);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setForeground(Color.BLACK);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(40, 200, 663, 238);
		internalFrame.getContentPane().add(panel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(79, 69, 132, 21);
		panel_2.add(comboBox);
		comboBox.addItem("��ѡ��ͼ������");
		comboBox.addItem("С˵");
		comboBox.addItem("����");
		comboBox.addItem("��ʷ");
		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(Color.BLACK);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(40, 130, 663, 67);
		internalFrame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JRadioButton RadioButton_ISBN = new JRadioButton("ISBN");		//ѡ��ť����ISBN��
		buttonGroup.add(RadioButton_ISBN);
		
		RadioButton_ISBN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		RadioButton_ISBN.setBounds(60, 21, 58, 23);
		panel_3.add(RadioButton_ISBN);
		
		JRadioButton RadioButton_book = new JRadioButton("\u4E66\u540D");//ѡ��ť����������
		buttonGroup.add(RadioButton_book);
		RadioButton_book.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		RadioButton_book.setBounds(120, 21, 58, 23);
		panel_3.add(RadioButton_book);
		
		textField_27 = new JTextField();
		textField_27.setText("\u300A\u300B");
		textField_27.setBounds(193, 22, 271, 21);
		panel_3.add(textField_27);
		textField_27.setColumns(10);
		
		/*							���ҹ��ܣ�����isbn/�鼮���֣�
		 *û���鼮
		 * 		��ʾ����ʧ��
		 * 
		 * ���鼮
		 * 		����鼮��Ϣ
		 * */
		button_4 = new JButton("\u67E5\u627E");   											 //����
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String url="jdbc:sqlserver://localhost:1433;DatabaseName=ͼ�����ϵͳ";
					String sql_select_bookname="select * from book_infomation_table where bookname=?";
					String sql_select_isbn="select isbn from book_infomation_table where isbn=?";
					//String sql_update="Update admin_table set username=?,password=?";
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();//��������
					Connection con=DriverManager.getConnection(url, "sa", "1234");//��������
					PreparedStatement sm1=con.prepareStatement(sql_select_bookname);		//�����鼮���Ʋ����鼮
					sm1.setString(1,textField_27.getText());
					ResultSet rs1=sm1.executeQuery();
					if(rs1.next()){
						label_11.setVisible(true);//��ʾ�����ҳɹ���
						label_10.setVisible(false);//����ʾ������ʧ�ܡ�
						textField_17.setText(rs1.getString(6));							//���Ϸ���ʾһ��ͼ����Ϣ
						textField_16.setText(rs1.getString(2));
						textField_15.setText(rs1.getString(3));
						textField_14.setText(rs1.getString(5));
						textField_13.setText(rs1.getString(7));
						textField_12.setText(rs1.getString(4));
						textField_11.setText(rs1.getString(12));
						textField_10.setText(rs1.getString(10));
						textField_9.setText(rs1.getString(9));
						
						
					}else{
						label_10.setVisible(true);//��ʾ������ʧ�ܡ�
						label_11.setVisible(false);//����ʾ�����ҳɹ���
						textField_17.setText("");	//����ı����������
						textField_17.setText("");							
						textField_16.setText("");
						textField_15.setText("");
						textField_14.setText("");
						textField_13.setText("");
						textField_12.setText("");
						textField_11.setText("");
						textField_10.setText("");
						textField_9.setText("");
					}
					//PreparedStatement sm2=con.prepareStatement(sql_select_isbn);			//����ISBN�Ʋ����鼮
					
					
					}catch(Exception e1){
						System.out.println(""+e1);
					}
			}
		});
		button_4.setBounds(492, 21, 93, 23);
		panel_3.add(button_4);
		
		 label_10 = new JLabel("\u67E5\u627E\u5931\u8D25");//����ʧ��
		label_10.setBounds(412, 42, 54, 15);
		panel_3.add(label_10);
		
		label_11 = new JLabel("\u67E5\u627E\u6210\u529F");//���ҳɹ���
		label_11.setBounds(492, 42, 54, 15);
		panel_3.add(label_11);
		internalFrame.setVisible(true);
		label_10.setVisible(false);
		label_11.setVisible(false);
	}
}
