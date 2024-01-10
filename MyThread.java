public class MyThread extends Thread{ // 쓰레드를 상속하고 run 메서드를 오버라이딩함
    public void run(){
        for (int i=0; i<500; i++){
            System.out.print("T");
        }
    }
}
