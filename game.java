import java.util.*;
public class new2{
	public static void main(String[] ards){
		Scanner n = new Scanner(System.in);
		System.out.println("---��ȭ��Ϸ---");
		System.out.println("1.ʯͷ 2.���� 3.��");
		int number1 = n.nextInt();
		int number2 = (int)(Math.random()*3)+1;
		System.out.print("\n������ǣ�"+number1+"\t���Գ����ǣ�"+number2+"\t");
		
		if(number1 == number2){
			System.out.println("ƽ�� =_=!");
		}else if(number1==1&&number2==2 || number1==2&&number2==3||
		         number1==3&&number2==1){
			System.out.println("��Ӯ�ˣ�^_^");
		}else{
			System.out.println("������ @_@");
		}
	}
}