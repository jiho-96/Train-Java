public class MyRuns implements Runnable{
    public void run(){
        show();
    }
    public void show(){
        for (int i=0;i<500;i++){
            if(((Thread.currentThread()).getName()).equals("a")){ // 실행되고 있는 쓰레드를 반환, 이름 반환
                System.out.print("A");
            } else if (((Thread.currentThread()).getName()).equals("b")){
                System.out.print("B");
            } else if (((Thread.currentThread()).getName()).equals("c")){
                System.out.print("C");
            } else {
                System.out.print("[" + Thread.currentThread().getName() + i + "]");
            }
        }
    }
}
