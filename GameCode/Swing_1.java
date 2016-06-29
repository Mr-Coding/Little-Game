package swing_1;
/**
 * main方法
 * @author thech
 */
public class Swing_1 {
    public static void main(String[] args) {
       MyEvent ME = new MyEvent();  //创建对象
       ME.Frame(); // 通过MyEvent调用父类的Frame方法
       ME.init();  // 通过MyEvent调用init方法
    } 
}

