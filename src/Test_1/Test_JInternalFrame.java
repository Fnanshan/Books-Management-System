package Test_1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test_JInternalFrame extends JFrame {

	private JPanel contentPane;
	private JInternalFrame internalFrame0;
	private JInternalFrame internalFrame1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test_JInternalFrame frame = new Test_JInternalFrame();
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
	public Test_JInternalFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		
		JButton button = new JButton("\u7CFB\u7EDF\u7BA1\u7406");						//系统管理
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*try{
					internalFrame1.dispose();
				}catch(Exception e1){
					System.out.println(""+e1);
				}
				*/
				 internalFrame0 = new JInternalFrame("系统");
				internalFrame0.setBounds(111, 57, 313, 194);
				contentPane.add(internalFrame0);
				internalFrame0.setVisible(true);
			     JButton close = new JButton("X");  									//创建对象“X”
			     close.setBounds(10,10,15,20);
			     // close.setMargin(new Insets(0, 0, 0, 0));  
			     // close.setPreferredSize(new Dimension(15, 15));  
			      close.addActionListener(new ActionListener(){  	 
			    	  public void actionPerformed(ActionEvent e) {  
			  
			            internalFrame0.dispose();  												   //关闭
			            //opPane.setVisible(false);  
			          }  
			     
			      });  
			}
		});
		button.setBounds(10, 10, 93, 23);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("\u4E66\u7C4D\u7BA1\u7406");			//书籍管理
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*try{														//异常处理机制：在其他窗口打开的情况下，关闭那个窗口，并检查异常
					internalFrame0.dispose();
				}catch(Exception e2){
					System.out.println(""+e2);
				}
				*/
				 internalFrame1 = new JInternalFrame("书籍");
				internalFrame1.setBounds(111, 57, 313, 194);
				contentPane.add(internalFrame1);
				internalFrame1.setVisible(true);
			     JButton close = new JButton("X");  									//创建对象“X”
			     close.setBounds(100,10,50,50);
			     internalFrame1.add(close);
			     // close.setMargin(new Insets(0, 0, 0, 0));  
			     // close.setPreferredSize(new Dimension(15, 15));  
			      close.addActionListener(new ActionListener(){  	 
			    	  public void actionPerformed(ActionEvent e) {  
			  
			            internalFrame1.dispose();  												   //关闭
			            //opPane.setVisible(false);  
			          }  
			     
			      });  
				
			}
		});
		btnNewButton.setBounds(112, 10, 93, 23);
		contentPane.add(btnNewButton);
		//internalFrame.setVisible(true);
	}
}
