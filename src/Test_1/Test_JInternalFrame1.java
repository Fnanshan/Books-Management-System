//Test_JInternalFrame1.java
/*
 一般我们会将Internal Frame加入Desktop Pane方便管理
 ，Desktop Pane是一种特殊的Layered pane,用来建立虚拟桌面(Vitual Desktop).
 它可以显示并管理众多Internal Frame之间的层次关系。
 
 

*/
/*
package Test;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Test_JInternalFrame1 extends JFrame implements ActionListener{
    JDesktopPane desktopPane;														//首先声明Desktop Pane类的对象
    int count = 1;

    public Test_JInternalFrame1() {
        super("图书管理系统");													//Container的标题
        Container contentPane = this.getContentPane();								//Container的布局
        contentPane.setLayout(new BorderLayout());									
        
        JButton b = new JButton("Create New Internal Frames");
        b.addActionListener(this);						//当用户按下按钮时，将运行actionPerformed()中的程序！！（需要注意）
        contentPane.add(b, BorderLayout.SOUTH);       
        desktopPane = new JDesktopPane(); 			     //建立一个新的JDesktopPane并加入于contentPane中！！！
        contentPane.add(desktopPane); 
        setSize(350, 350); 
        show(); 
        
        addWindowListener(new WindowAdapter() {			//事件
            public void windowClosing(WindowEvent e) {
                    System.exit(0);
            }
        });
    }
   
    public void actionPerformed(ActionEvent e)								//当用户按下按钮时，将运行actionPerformed()中的程序！！
    {
        JInternalFrame internalFrame = new JInternalFrame(					 //产生一个可关闭、可改变大小、具有标题、可最大化与最小化的Internal Frame.
        "Internal Frame "+(count++), true, true, true, true);  

        internalFrame.setLocation( 20,20);
        internalFrame.setSize(200,200); 
        internalFrame.setVisible(true);
        //取得JInternalFrame的Content Pane,用以加入新的组件。？？？？？？
        Container icontentPane = internalFrame.getContentPane();
        JTextArea textArea = new JTextArea();
        JButton b = new JButton("Internal Frame Button");
        /*将JTextArea与JButton对象加入JInternalFrame中。由此呆知，JInteranlFrame加入组件
         *的方式与JFrame是一模一样。
         */
/*
        icontentPane.add(textArea,"Center");
        icontentPane.add(b,"South");
 */
        //将JInternalFrame加入JDesktopPane中，如此一来，即使产生很多JInternalFrame,JDesktopPane也
        //能将它们之间的关系管理得相当良好。
  /*      desktopPane.add(internalFrame);  
        
        try {
            internalFrame.setSelected(true);
        } catch (java.beans.PropertyVetoException ex) {
          System.out.println("Exception while selecting");
        }
    }

    public static void main(String[] args) {
        new Test_JInternalFrame1();
    }
}
*/

package Test_1;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Test_JInternalFrame1 extends JFrame implements ActionListener{
    JDesktopPane desktopPane;														//首先声明Desktop Pane类的对象
    int count = 1;

    public Test_JInternalFrame1() {
        super("图书管理系统");													//Container的标题
        Container contentPane = this.getContentPane();								//Container的布局
        //contentPane.setLayout(new FlowLayout());							//为什么不能用
        contentPane.setLayout(new BorderLayout());									
        
        JButton b = new JButton("系统管理");
        b.addActionListener(this);						//当用户按下按钮时，将运行actionPerformed()中的程序！！（需要注意）
        contentPane.add(b, BorderLayout.SOUTH);
        desktopPane = new JDesktopPane(); 			     //建立一个新的JDesktopPane并加入于contentPane中！！！
        contentPane.add(desktopPane);
        setSize(350, 350); 
        show(); 
        
        addWindowListener(new WindowAdapter() {			//事件
            public void windowClosing(WindowEvent e) {
                    System.exit(0);
            }
        });
    }
   
    public void actionPerformed(ActionEvent e)								//当用户按下按钮时，将运行actionPerformed()中的程序！！
    {
    	
        JInternalFrame internalFrame = new JInternalFrame(					 //产生一个可关闭、可改变大小、具有标题、可最大化与最小化的Internal Frame.
        "系统管理 "+(count++), true, true, true, true);  

        internalFrame.setLocation( 20,20);
        internalFrame.setSize(300,300); 
        internalFrame.setVisible(true);
        //取得JInternalFrame的Content Pane,用以加入新的组件。？？？？？？
        Container icontentPane = internalFrame.getContentPane();
        JButton b = new JButton("用户管理");
        JButton c=new JButton("用户登录");
        
        /*将JTextArea与JButton对象加入JInternalFrame中。由此呆知，JInteranlFrame加入组件
         *的方式与JFrame是一模一样。
         */
        
        icontentPane.add(b);
       // icontentPane.add(c);
        //将JInternalFrame加入JDesktopPane中，如此一来，即使产生很多JInternalFrame,JDesktopPane也
        //能将它们之间的关系管理得相当良好。
        desktopPane.add(internalFrame);  
        
        try {
            internalFrame.setSelected(true);
        } catch (java.beans.PropertyVetoException ex) {
          System.out.println("Exception while selecting");
        }
    }

    public static void main(String[] args) {
        new Test_JInternalFrame1();
    }
}