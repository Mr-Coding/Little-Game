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
                JOptionPane.showMessageDialog(null, "������^-^");
                this.number = (int)(Math.random()*10);               
                //this.t.setText("");
                //int label = 0;
                //++label;
                //this.l.setText("�÷֣�" + label);continue;
            }else if(user < number){
                this.t.setText("");
                JOptionPane.showMessageDialog(null, "С����@_@");//break;
            }else if(user > number){
                this.t.setText("");
                JOptionPane.showMessageDialog(null, "������@_@");//break;
            }//}
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"���������֣�" + ex);
        }
        //}
    }
}
