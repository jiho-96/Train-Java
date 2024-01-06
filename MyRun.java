public class MyRun implements Runnable{ // Runnable을 implements하고 run 메서드를 구현
    public void run(){
        show();
    }
    public void show(){
        for (int i=0; i<500; i++){
            System.out.print("S"); // "S"를 500번 출력
        }
    }
}
