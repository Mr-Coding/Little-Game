import javax.swing.*;import java.awt.event.*;import java.awt.*;import java.util.*;

public class swing_1 extends JFrame{
	Random sj = new Random();
	public int sjs = sj.nextInt(100);
	private JButton b = new JButton("ȷ��");
	private JPanel p = new JPanel();  
	private JTextField txt = new JTextField(25);
	public void initListener(){
		String number = ""+sjs;//intתΪString���� //String s = " "+sjs;//intתΪString����
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String user = txt.getText();
				if(user.equals(number)){
					JOptionPane.showMessageDialog(null,"������");
				}else{
					int number2 = Integer.parseInt(number);int user2 = Integer.parseInt(user);
					if(user2 < number2){
						JOptionPane.showMessageDialog(null,"С����");
					}else{
						JOptionPane.showMessageDialog(null,"������");
					}}/*swing_1.this.setTitle(t);*/}});}
	public swing_1(){
		super();	
		setTitle("����С��Ϸ��0~100��  v0.0.1");
		initListener();
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setBounds(200,200,600,130);   
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(p);   p.add(b);   p.add(txt);   add(p);}
	public static void main(String[] args) {
		new swing_1();		}}