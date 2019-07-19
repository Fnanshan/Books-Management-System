package Test_1;

import java.awt.BorderLayout;  
import java.awt.Container;  
import java.awt.Dimension;  
import java.awt.FlowLayout;  
import java.awt.Insets;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import java.awt.event.ComponentAdapter;  
import java.awt.event.ComponentEvent;  
import java.beans.PropertyVetoException;  
import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;  
import javax.swing.JDesktopPane;  
import javax.swing.JFrame;  
import javax.swing.JInternalFrame;  
import javax.swing.JMenuBar;  
import javax.swing.JMenuItem;  
import javax.swing.JPanel;  
import javax.swing.SwingUtilities;  
import javax.swing.plaf.basic.BasicInternalFrameUI;  
 
/**  
* MDIFrame is a frame using JInternalFrame to implements MDI as Word on Windows.  
*   
* @author Cheng  
* @version 1.0.0 for GPF MDI test  
*/  
@SuppressWarnings("serial")  
public class Test_MDIFrame extends JFrame {  
   
    /** The desktop pane. */  
    final JDesktopPane desktopPane = new JDesktopPane();  						//������������ǰ��壩�����ڴ���һ�����ĵ����棩
   
    /** The operation pane with restore and close buttons. */  
    final JPanel opPane = new JPanel();  										//����JPanel�Ķ���opPane
   
    /**  
     * Instantiates a new mDI frame.  											//ʵ����һ���Ե�MDI����
     */  
    public Test_MDIFrame(){  														//���췽��
      setTitle("ͼ�����ϵͳ");  
      setSize(600, 550);  
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    
      final JMenuBar bar = new JMenuBar();  									//(�˵���):��������bar��
      JMenuItem exit = new JMenuItem("Exit");  									//�����˵����exit��
          exit.addActionListener(new ActionListener(){  						//���û����²˵���ʱ��������actionPerformed()�еĳ��򣡣�
              public void actionPerformed(ActionEvent e) {  
                   System.exit(0);  
              }    
      });  
      bar.add(exit);  															//�ڲ˵�������Ӳ˵��exit��
      // operation pane with two button, set invisible at first  						//���������������ť,�������ε�
      opPane.setLayout(new FlowLayout(FlowLayout.TRAILING));  
      
      JButton restore = new JButton("#");  										//������ť��restore��(�ָ�)
      restore.setMargin(new Insets(0, 0, 0, 0));  
      restore.setPreferredSize(new Dimension(15, 15));  
      restore.addActionListener(new ActionListener(){    						//���û����°�ťʱ��������actionPerformed()�еĳ��򣡣�
    	  public void actionPerformed(ActionEvent e) {  
            InnerFrame i = (InnerFrame)desktopPane.getSelectedFrame();  
            try {  
                // notice this method, when JInternalFrame set maximun false  
                // this internal frame will be set as old size  
                i.setMaximum(false);  
            } catch (PropertyVetoException ex) {  
                ex.printStackTrace();  
            }  
            i.showNorthPanel();  
            opPane.setVisible(false);  
          }  
     
      });  
      opPane.add(restore);  												//����ť��#����ӵ�JPanel��
      JButton close = new JButton("X");  									//��������X��
      close.setMargin(new Insets(0, 0, 0, 0));  
      close.setPreferredSize(new Dimension(15, 15));  							
      close.addActionListener(new ActionListener(){  						//���û����¡�X��ʱ��������actionPerformed()�еĳ��򣡣�
 
          @Override  
          public void actionPerformed(ActionEvent e) {  
            JInternalFrame i = desktopPane.getSelectedFrame();  
            i.dispose();  												   //�ر�
            opPane.setVisible(false);  
          }  
     
      });  
      opPane.add(close);  													//����ť��X����ӵ�JPanel��
      bar.add(opPane);  													//��JPanel��ӵ��˵���
      opPane.setVisible(false);  
      setJMenuBar(bar);  
    
      Container content = getContentPane();  
      content.add(desktopPane, BorderLayout.CENTER);  
      final JPanel ctrlPane = new JPanel();  
      
      JButton btnNewButton = new JButton("\u4E66\u7C4D\u7BA1\u7406");		    //��ť���鼮����
      btnNewButton.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent arg0) {
            InnerFrame iFrame_books = new InnerFrame();  
            iFrame_books.setVisible(true);  
            desktopPane.add(iFrame_books);  
            //
            
            //
      	}
      });
      JButton add = new JButton("\u7CFB\u7EDF\u7BA1\u7406");  					//��ť��ϵͳ����
      add.addActionListener(new ActionListener(){  
          public void actionPerformed(ActionEvent e) {  						//���û����°�ťʱ��������actionPerformed()�еĳ��򣡣�
              InnerFrame iFrame_system = new InnerFrame();  
              FlowLayout flow=new FlowLayout();
              flow.setAlignment(FlowLayout.CENTER);
              /*flow.setHgap(20);
              flow.setVgap(40);
              setLayout(flow);*/
              //iFrame_system.setLayout();
              //iFrame_system.setLayout(null);
             // setLayout(null);
           //   JButton b = new JButton("�û�����");
              
        //     JButton c=new JButton("�û���¼");
          //    iFrame_system.getContentPane().add(b);
          //    iFrame_system.getContentPane().add(c);
              iFrame_system.setVisible(true);  
              desktopPane.add(iFrame_system);  
              //�����￪ʼ��
              //ȡ��iFrame_system��Content Pane,���Լ����µ������������������
              Container icontentPane = iFrame_system.getContentPane();
             // icontentPane.setLayout(flow);          
              JButton b = new JButton("�û�����");
              JButton c = new JButton("�û���¼");
              /*��JTextArea��JButton�������JInternalFrame�С��ɴ˴�֪��JInteranlFrame�������
               *�ķ�ʽ��JFrame��һģһ����*/
             // icontentPane.add(textArea,"Center");
              icontentPane.add(c,"South");
              icontentPane.add(b,"North");
              
              	b.addActionListener(this);
      			b.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				
    			}
    		});
              
            
              
              //���������
          }  
     
      });  
      
      ctrlPane.add(add);  
      ctrlPane.add(btnNewButton);
      content.add(ctrlPane, BorderLayout.SOUTH);  
      
      JButton btnNewButton_1 = new JButton("\u501F\u4E66\u7BA1\u7406");					//��ť�����顱
      btnNewButton_1.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		InnerFrame iFrame_borrow_book = new InnerFrame(); 	
      		iFrame_borrow_book.setVisible(true);  
             desktopPane.add(iFrame_borrow_book); 
      	}
      });
      ctrlPane.add(btnNewButton_1);
      
      JButton button = new JButton("\u8FD8\u4E66\u7BA1\u7406");
      ctrlPane.add(button);
      
      JButton button_1 = new JButton("\u4FE1\u606F\u67E5\u8BE2");
      ctrlPane.add(button_1);
      
      JButton button_2 = new JButton("\u89C6\u56FE");
      ctrlPane.add(button_2);
      
      JButton button_3 = new JButton("\u5E2E\u52A9");
      ctrlPane.add(button_3);
      setVisible(true);  
    }																			//���췽������Ϊֹ  ����������������
   
    /**  
     * The Class InnerFrame.  
     */  
    class InnerFrame extends JInternalFrame {  
    
      /** The is hidden. */  
      boolean isHidden = false;  
    
      /** The old ui. */  
      BasicInternalFrameUI oldUi = null;  
    
      /**  
       * Instantiates a new inner frame.  
       */  
      public InnerFrame() {  
          oldUi = (BasicInternalFrameUI)getUI();  
          setSize(200, 200);  
          maximizable = true;  
          closable = true;  
          addComponentListener(new ComponentAdapter() {  
              public void componentResized(ComponentEvent e) {  
                  InnerFrame selectedFrame = (InnerFrame)e.getSource();  
                  if(selectedFrame.isMaximum()){  
                      selectedFrame.hideNorthPanel();  
                      opPane.setVisible(true);  
                      try {  
                           selectedFrame.setMaximum(true);  
                      } catch (PropertyVetoException ex) {  
                           ex.printStackTrace();  
                       }  
                   }  
               }  
          });  
      }  
    
      /**  
       * Hide north panel.  
       */  
      public void hideNorthPanel(){  
          ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);  
          this.putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);  
          isHidden = true;  
      }  
    
      /**  
       * Show north panel.  
       */  
      public void showNorthPanel() {  
          this.setUI(oldUi);  
          this.putClientProperty("JInternalFrame.isPalette", Boolean.FALSE);  
          isHidden = false;  
      }  
    
      /* (non-Javadoc)  
       * @see javax.swing.JInternalFrame#updateUI()  
       */  
      public void updateUI() {  
          super.updateUI();  
          if (isHidden) {  
              hideNorthPanel();  
          }  
       }  
    }  
 
   
    /**  
     * The main method.  
     *   
     * @param args the arguments  
     */  
    public static void main(String[] args) {  
          SwingUtilities.invokeLater(new Runnable(){  
 
              @Override  
              public void run() {  
                   new Test_MDIFrame();  
              }  
     
          });  
     }  
}