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
    final JDesktopPane desktopPane = new JDesktopPane();  						//声明对象（书桌前面板）（用于创建一个多文档界面）
   
    /** The operation pane with restore and close buttons. */  
    final JPanel opPane = new JPanel();  										//声明JPanel的对象opPane
   
    /**  
     * Instantiates a new mDI frame.  											//实例化一个性的MDI窗口
     */  
    public Test_MDIFrame(){  														//构造方法
      setTitle("图书管理系统");  
      setSize(600, 550);  
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    
      final JMenuBar bar = new JMenuBar();  									//(菜单栏):创建对象“bar”
      JMenuItem exit = new JMenuItem("Exit");  									//创建菜单项：“exit”
          exit.addActionListener(new ActionListener(){  						//当用户按下菜单项时，将运行actionPerformed()中的程序！！
              public void actionPerformed(ActionEvent e) {  
                   System.exit(0);  
              }    
      });  
      bar.add(exit);  															//在菜单栏里添加菜单项“exit”
      // operation pane with two button, set invisible at first  						//操作面板有两个按钮,设置无形的
      opPane.setLayout(new FlowLayout(FlowLayout.TRAILING));  
      
      JButton restore = new JButton("#");  										//创建按钮“restore”(恢复)
      restore.setMargin(new Insets(0, 0, 0, 0));  
      restore.setPreferredSize(new Dimension(15, 15));  
      restore.addActionListener(new ActionListener(){    						//当用户按下按钮时，将运行actionPerformed()中的程序！！
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
      opPane.add(restore);  												//将按钮“#”添加到JPanel上
      JButton close = new JButton("X");  									//创建对象“X”
      close.setMargin(new Insets(0, 0, 0, 0));  
      close.setPreferredSize(new Dimension(15, 15));  							
      close.addActionListener(new ActionListener(){  						//当用户按下“X”时，将运行actionPerformed()中的程序！！
 
          @Override  
          public void actionPerformed(ActionEvent e) {  
            JInternalFrame i = desktopPane.getSelectedFrame();  
            i.dispose();  												   //关闭
            opPane.setVisible(false);  
          }  
     
      });  
      opPane.add(close);  													//将按钮“X”添加到JPanel上
      bar.add(opPane);  													//将JPanel添加到菜单上
      opPane.setVisible(false);  
      setJMenuBar(bar);  
    
      Container content = getContentPane();  
      content.add(desktopPane, BorderLayout.CENTER);  
      final JPanel ctrlPane = new JPanel();  
      
      JButton btnNewButton = new JButton("\u4E66\u7C4D\u7BA1\u7406");		    //按钮“书籍管理”
      btnNewButton.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent arg0) {
            InnerFrame iFrame_books = new InnerFrame();  
            iFrame_books.setVisible(true);  
            desktopPane.add(iFrame_books);  
            //
            
            //
      	}
      });
      JButton add = new JButton("\u7CFB\u7EDF\u7BA1\u7406");  					//按钮“系统管理”
      add.addActionListener(new ActionListener(){  
          public void actionPerformed(ActionEvent e) {  						//当用户按下按钮时，将运行actionPerformed()中的程序！！
              InnerFrame iFrame_system = new InnerFrame();  
              FlowLayout flow=new FlowLayout();
              flow.setAlignment(FlowLayout.CENTER);
              /*flow.setHgap(20);
              flow.setVgap(40);
              setLayout(flow);*/
              //iFrame_system.setLayout();
              //iFrame_system.setLayout(null);
             // setLayout(null);
           //   JButton b = new JButton("用户管理");
              
        //     JButton c=new JButton("用户登录");
          //    iFrame_system.getContentPane().add(b);
          //    iFrame_system.getContentPane().add(c);
              iFrame_system.setVisible(true);  
              desktopPane.add(iFrame_system);  
              //在这里开始：
              //取得iFrame_system的Content Pane,用以加入新的组件。？？？？？？
              Container icontentPane = iFrame_system.getContentPane();
             // icontentPane.setLayout(flow);          
              JButton b = new JButton("用户管理");
              JButton c = new JButton("用户登录");
              /*将JTextArea与JButton对象加入JInternalFrame中。由此呆知，JInteranlFrame加入组件
               *的方式与JFrame是一模一样。*/
             // icontentPane.add(textArea,"Center");
              icontentPane.add(c,"South");
              icontentPane.add(b,"North");
              
              	b.addActionListener(this);
      			b.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				
    			}
    		});
              
            
              
              //在这里结束
          }  
     
      });  
      
      ctrlPane.add(add);  
      ctrlPane.add(btnNewButton);
      content.add(ctrlPane, BorderLayout.SOUTH);  
      
      JButton btnNewButton_1 = new JButton("\u501F\u4E66\u7BA1\u7406");					//按钮“借书”
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
    }																			//构造方法到此为止  。。。。。。。。
   
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