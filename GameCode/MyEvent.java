package swing_2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author thech
 */
public class MyEvent implements ActionListener{
    JTextField t;   JLabel l;
    int number = (int)(Math.random()*101);
    /**
     *
     * @param t
     * @param l
     */
    public MyEvent(JTextField t,JLabel l){
        this.t = t;
        this.l = l;     
    }
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println(number);
        try{ //while(true){
            String str1 = this.t.getText();
            int user = Integer.parseInt(str1);
            String str2 = this.l.getText();
            if(user == number){
                JOptionPane.showMessageDialog(null, "对啦！^-^");
                this.number = (int)(Math.random()*10);               
                //this.t.setText("");
                //int label = 0;
                //++label;
                //this.l.setText("得分：" + label);continue;
            }else if(user < number){
                this.t.setText("");
                JOptionPane.showMessageDialog(null, "小啦！@_@");//break;
            }else if(user > number){
                this.t.setText("");
                JOptionPane.showMessageDialog(null, "大啦！@_@");//break;
            }//}
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"请填入数字！" + ex);
        }
        //}
    }
}
