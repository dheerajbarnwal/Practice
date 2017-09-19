/**
 * Created by Dheeraj Kumar Barnwal on 19/09/17.
 */
class Test1 extends Thread{
    Object ob1 =new Object();
    Object ob2 =new Object();
    public Test1(Object o1,Object o2){
        this.ob1=o1;
        this.ob2=o2;
    }
    @Override
    public void run() {
        synchronized (ob1){
            System.out.println("hold ob1");
            try {
                Thread.sleep(500);
            }catch(Exception e){

            }
            synchronized (ob2){
                System.out.println("hold ob1 & ob2");
            }
        }

    }
}
class Test2 extends Thread{
    Object ob1 =new Object();
    Object ob2 =new Object();
    public Test2(Object o1,Object o2){
        this.ob1=o1;
        this.ob2=o2;
    }
    @Override
    public void run() {
        synchronized (ob2){
            System.out.println("hold ob2");
            synchronized (ob1){
                System.out.println("hold ob1 & ob2");
            }
        }
    }
}
public class Dead {

    public static void main(String args[]){
        Object o1 =new Object();
        Object o2 =new Object();
        Test1 t1 = new Test1(o1,o2);
        Test2 t2 = new Test2(o1,o2);
        try {
            t1.start();
            t2.start();
        }catch(Exception e){

        }
    }
}
