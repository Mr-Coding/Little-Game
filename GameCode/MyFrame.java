package swing_2;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author thech
 */
public class MyFrame extends JFrame{
    public void frame(){
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JButton b = new JButton("OK");
        JTextField t = new JTextField(10);
        JLabel l =new JLabel("<html><body>**************************************************<tr/>******************猜数小游戏********************<tr/>**************************************************</body></html>");
        
        setTitle("猜数小游戏（0 - 100）  v0.0.3");
        setBounds(410,180,350,150);
        setLayout(new GridLayout(2,1));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(p1);
        add(p2);
        p1.add(t);
        //p2.setBackground(Color.gray);
        p1.add(b);
        p1.setSize(350,50);
        p2.setLayout(new FlowLayout());
        p2.add(l);
        b.addActionListener(new MyEvent(t,l));
    }
}
