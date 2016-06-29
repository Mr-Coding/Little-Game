package swing_1;
import java.awt.Color;
import java.awt.*;
import javax.swing.*;
/**
 * 创建JFrame窗口
 * @author thech
 */
public class MyFrame{
    public MyFrame(){}
    private final JFrame     f = new JFrame();
    private final JPanel     p = new JPanel();
    public final JButton    b1 = new JButton("OK");
    public final JTextField t = new JTextField(10);
    public void Frame(){
        f.setTitle("猜数小游戏（0 - 100）  v0.0.2");  //设置标题
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //关闭设置
        f.setLocation(410,180);  //设置位置
        f.setSize(350,80);  //设置大小
        f.setVisible(true);  //让Frame显示
        p.setBackground(Color.GRAY);  //设置背景颜色
        p.setLayout(new FlowLayout(FlowLayout.CENTER));  //设置布局
        p.add(t); //向panel里添加文本框
        p.add(b1);  //向panel里添按钮
        p.setSize(250,100);  //设置panel的大小
        f.add(p);
        }
}
