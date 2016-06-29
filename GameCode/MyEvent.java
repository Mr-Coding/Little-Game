package swing_1;
import java.awt.event.*;
import javax.swing.JOptionPane;
/**
 * 事件类，继承了MyFrame类
 * @author thech
 */
public class MyEvent extends MyFrame{
    public MyEvent(){}
    public static int number  = (int)(Math.random()*101);          
    public void init(){
        System.out.println(number);   
        b1.addActionListener(new ActionListener(){           
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String user = t.getText();
                    int user2 = Integer.parseInt(user); //String转为int不太懂，要研究一下
                    if(user2 == number){
                        JOptionPane.showMessageDialog(null,"对啦！");
                        MyEvent.number = (int)(Math.random()*101);
                        System.out.println(number);
                    }else if(user2 < number){
                        JOptionPane.showMessageDialog(null,"小啦！");
                    }else if(user2 > number){
                        JOptionPane.showMessageDialog(null, "大啦！");
                    }
                }
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,"请填入猜出的数字！");
                }
            }      
        }); 
    }
}
