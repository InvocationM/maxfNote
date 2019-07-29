/**
 * 描述:
 * ----测试while
 *
 * @author Administrator
 * @create 2019-01-02 22:56
 */
public class WhileTest2 {

    static  int anInt = 0;


    public static void main(String[] args) throws InterruptedException {

        while (anInt == 0) {

            System.out.println("第一次");

            Thread.sleep(2000L);

            anInt = 1;

            System.out.println(" 第二次");

            System.out.println(" disanci");

            Thread  t1 = new Thread();

        }
    }
    
    class innner {

    }

}