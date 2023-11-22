public class VarargsForeachLotto {
    // var args variable arguments 가변자 - 아규먼트의 개수가 몇 개라도 배열처럼 사용 가능
    public static void print(int ... mm){
        for (int m:mm){
            System.out.printf(m+"\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[]mm={1,6,16,22,23,33};
        print(mm); // 배열
        int a=1,b=6,c=16;
        print(a);  // 1개
        print(a,b); // 2개
        print(a,b,c); // 3개
    }
}
