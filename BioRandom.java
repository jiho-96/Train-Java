public class BioRandom {
    public static void main(String[] args) {
        int range=10;
        int start=1;
        int a=0, b=0, c=0;
        while (true){ // 무한루프
            // 1~10 사이의 임의 정수
            a=(int)(range*Math.random()+start);
            b=(int)(range*Math.random()+start);
            c=(int)(range*Math.random()+start);
            if (a!=b && b!=c && c!=a) break; // 세 수가 서로 다르면 break
        }
        System.out.printf("%d\t%d\t%d",a,b,c);
    }
}
