package Test_1;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class MenuTest0 extends JFrame
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private JFrame frame;// ����
private JMenuBar mBar;// �˵�
private JPanel panel;// ���
private JLabel label;// ��ǩ
// ���캯��
public MenuTest0()
{
frame = new JFrame();
panel = new JPanel();
mBar = new JMenuBar();
// ���ò˵���
this.setTitle("����ѧԺ����ϵͳ");
this.setJMenuBar(mBar);
this.setResizable(false);
// ��Ӳ˵���
JMenu sMenu, jMenu, gMenu, cMenu, bMenu;
sMenu = new JMenu("ϵͳ");
jMenu = new JMenu("���");
gMenu = new JMenu("����");
cMenu = new JMenu("��ѯ");
bMenu = new JMenu("����");
mBar.add(sMenu);
mBar.add(jMenu);
mBar.add(gMenu);
mBar.add(cMenu);
mBar.add(bMenu);
// ϵͳ���ѡ��˵�
JMenuItem sItem, cItem, tItem;
sItem = new JMenuItem("��ʼ����");
cItem = new JMenuItem("ˢ��ϵͳ");
tItem = new JMenuItem("�˳�ϵͳ");
sMenu.add(sItem);
sMenu.addSeparator();
sMenu.add(cItem);
sMenu.addSeparator();
sMenu.add(tItem);
// ������ѡ��˵�
JMenuItem xItem;
xItem = new JMenuItem("ѧԺ���");
jMenu.add(xItem);
// �������ѡ��˵�
JMenuItem xyItem, ycItem;
xyItem = new JMenuItem("��ʾ�˵�");
ycItem = new JMenuItem("���ز˵�");
gMenu.add(xyItem);
gMenu.addSeparator();
gMenu.add(ycItem);
// ��ѯ���ѡ��˵�
JMenuItem lItem;
lItem = new JMenuItem("·�߲�ѯ");
cMenu.add(lItem);
// �������ѡ��˵�
JMenuItem smItem, gyItem;
smItem = new JMenuItem("˵��");
gyItem = new JMenuItem("����");
bMenu.add(smItem);
bMenu.addSeparator();
bMenu.add(gyItem);
// ��������
this.add(panel);
panel.setBackground(Color.green);
this.setBounds(180, 10, 1024, 680);
this.setVisible(true);
mBar.add(label);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}
public static void main(String[] args)
{
new MenuTest0();
}
} 