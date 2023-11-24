public class FinallyTryCatch {
    public static void main(String[] args) {
        try {
            //Divide by zero
            int x = 5;
            int y = 20/(5-x); // 여기에서 에러를 던짐, 분모가 0이 되어 에러 발생
            System.out.println(y);
        } catch (ArithmeticException e) {   // run time
            System.out.println("0으로 나눴는지 확인");
            //e.printStackTrace();
        } finally {
            System.out.println("반드시 실행");  // 반드시 실행
        }
    }
}
