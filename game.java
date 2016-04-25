import java.util.*;
public class new2{
	public static void main(String[] ards){
		Scanner n = new Scanner(System.in);
		System.out.println("---猜拳游戏---");
		System.out.println("1.石头 2.剪刀 3.布");
		int number1 = n.nextInt();
		int number2 = (int)(Math.random()*3)+1;
		System.out.print("\n你出的是："+number1+"\t电脑出的是："+number2+"\t");
		
		if(number1 == number2){
			System.out.println("平局 =_=!");
		}else if(number1==1&&number2==2 || number1==2&&number2==3||
		         number1==3&&number2==1){
			System.out.println("你赢了！^_^");
		}else{
			System.out.println("你输了 @_@");
		}
	}
}