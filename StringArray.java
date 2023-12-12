public class StringArray {
    public static void main(String[] args) {
        String[] myNum = new String[]{"2023-10-12", "2023-11-12", "2023-12-12"}; // 동적배열 생성하고 초기화
        String[] myNum2 = {"2023-10-12", "2023-11-12", "2023-12-12"}; // 정적 배열 생성하고 초기화
        System.out.println(myNum2[0]);
        print(myNum); // 향상된 for를 이용하여 myNum의 모든 문자열을 출력
        // myNum2 = {"2023-09-12", "2023-10-12", "2023-11-12", "2023-12-12"}; // 정적 배열은 다시 초기화 불가
        myNum = new String[]{"2023-09-12", "2023-10-12", "2023-11-12", "2023-12-12"}; // 동적 배열은 다시 초기화 가능
        String[] tos=new String[myNum.length];  // myNum 크기의 배열 선언, 생성
        System.arraycopy(myNum, 0, tos, 0, myNum.length); // myNum의 문자열 배열 중에서 tos에 0번째부터 3번째까지 총 4개를 복사, myNum과 tos는 같은 배열값을 갖는 서로 다른 문자열 배열이 된다
        print(tos);
    }
    public static void print(String [] tos){
        for (String ss: tos){
            System.out.printf(ss+"\t");
        }
        System.out.println();
    }
}
