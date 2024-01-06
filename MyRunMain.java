public class MyRunMain {
    public static void main(String[] args) {
        MyRun mr1 = new MyRun(); // Runnable implements 구현한 객체를 생성
        Thread t1 = new Thread(mr1);
        MyThread t2 = new MyThread(); //Thread extends
        // 익명 내부
        Thread t3 = new Thread(new Runnable() { // Runnable을 구현한 객체를 만들지 않고 쓰레드의 생성자에서 Runnable 인터페이스 구현
            @Override
            public void run() {
                for (int i=0; i<500; i++){ // R 500번 출력
                    System.out.print("R");
                }
            }
        });
        // Lambda
        new Thread(()->{
            for (int i=0; i<500; i++){
                System.out.print("U");
            }
        }
        ).start();
        t1.start();
        t2.start();
        t3.start();

        for (int i=0; i<500; i++){
            System.out.print("M");
        }
    }
}
