public class FormatTryCatch {
    public static void main(String[] args) {
        String sNum = "123";
        String nNum = "h";
        try {
            int a = Integer.parseInt(sNum);
            System.out.println(a);
        } catch (NumberFormatException ee){
            System.out.println("int인지 확인 필요");  // 타입이 잘못되면 발생
            System.out.println(ee.getMessage());
        } catch (Exception ee) {
            System.out.println("에러 확인 필요");
        } finally {
            System.out.println("반드시 실행");
        }
    }
}
