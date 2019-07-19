//Test_JInternalFrame1.java
/*
 һ�����ǻὫInternal Frame����Desktop Pane�������
 ��Desktop Pane��һ�������Layered pane,����������������(Vitual Desktop).
 ��������ʾ�������ڶ�Internal Frame֮��Ĳ�ι�ϵ��
 
 

*/
/*
package Test;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Test_JInternalFrame1 extends JFrame implements ActionListener{
    JDesktopPane desktopPane;														//��������Desktop Pane��Ķ���
    int count = 1;

    public Test_JInternalFrame1() {
        super("ͼ�����ϵͳ");													//Container�ı���
        Container contentPane = this.getContentPane();								//Container�Ĳ���
        contentPane.setLayout(new BorderLayout());									
        
        JButton b = new JButton("Create New Internal Frames");
        b.addActionListener(this);						//���û����°�ťʱ��������actionPerformed()�еĳ��򣡣�����Ҫע�⣩
        contentPane.add(b, BorderLayout.SOUTH);       
        desktopPane = new JDesktopPane(); 			     //����һ���µ�JDesktopPane��������contentPane�У�����
        contentPane.add(desktopPane); 
        setSize(350, 350); 
        show(); 
        
        addWindowListener(new WindowAdapter() {			//�¼�
            public void windowClosing(WindowEvent e) {
                    System.exit(0);
            }
        });
    }
   
    public void actionPerformed(ActionEvent e)								//���û����°�ťʱ��������actionPerformed()�еĳ��򣡣�
    {
        JInternalFrame internalFrame = new JInternalFrame(					 //����һ���ɹرա��ɸı��С�����б��⡢���������С����Internal Frame.
        "Internal Frame "+(count++), true, true, true, true);  

        internalFrame.setLocation( 20,20);
        internalFrame.setSize(200,200); 
        internalFrame.setVisible(true);
        //ȡ��JInternalFrame��Content Pane,���Լ����µ������������������
        Container icontentPane = internalFrame.getContentPane();
        JTextArea textArea = new JTextArea();
        JButton b = new JButton("Internal Frame Button");
        /*��JTextArea��JButton�������JInternalFrame�С��ɴ˴�֪��JInteranlFrame�������
         *�ķ�ʽ��JFrame��һģһ����
         */
/*
        icontentPane.add(textArea,"Center");
        icontentPane.add(b,"South");
 */
        //��JInternalFrame����JDesktopPane�У����һ������ʹ�����ܶ�JInternalFrame,JDesktopPaneҲ
        //�ܽ�����֮��Ĺ�ϵ������൱���á�
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
    JDesktopPane desktopPane;														//��������Desktop Pane��Ķ���
    int count = 1;

    public Test_JInternalFrame1() {
        super("ͼ�����ϵͳ");													//Container�ı���
        Container contentPane = this.getContentPane();								//Container�Ĳ���
        //contentPane.setLayout(new FlowLayout());							//Ϊʲô������
        contentPane.setLayout(new BorderLayout());									
        
        JButton b = new JButton("ϵͳ����");
        b.addActionListener(this);						//���û����°�ťʱ��������actionPerformed()�еĳ��򣡣�����Ҫע�⣩
        contentPane.add(b, BorderLayout.SOUTH);
        desktopPane = new JDesktopPane(); 			     //����һ���µ�JDesktopPane��������contentPane�У�����
        contentPane.add(desktopPane);
        setSize(350, 350); 
        show(); 
        
        addWindowListener(new WindowAdapter() {			//�¼�
            public void windowClosing(WindowEvent e) {
                    System.exit(0);
            }
        });
    }
   
    public void actionPerformed(ActionEvent e)								//���û����°�ťʱ��������actionPerformed()�еĳ��򣡣�
    {
    	
        JInternalFrame internalFrame = new JInternalFrame(					 //����һ���ɹرա��ɸı��С�����б��⡢���������С����Internal Frame.
        "ϵͳ���� "+(count++), true, true, true, true);  

        internalFrame.setLocation( 20,20);
        internalFrame.setSize(300,300); 
        internalFrame.setVisible(true);
        //ȡ��JInternalFrame��Content Pane,���Լ����µ������������������
        Container icontentPane = internalFrame.getContentPane();
        JButton b = new JButton("�û�����");
        JButton c=new JButton("�û���¼");
        
        /*��JTextArea��JButton�������JInternalFrame�С��ɴ˴�֪��JInteranlFrame�������
         *�ķ�ʽ��JFrame��һģһ����
         */
        
        icontentPane.add(b);
       // icontentPane.add(c);
        //��JInternalFrame����JDesktopPane�У����һ������ʹ�����ܶ�JInternalFrame,JDesktopPaneҲ
        //�ܽ�����֮��Ĺ�ϵ������൱���á�
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