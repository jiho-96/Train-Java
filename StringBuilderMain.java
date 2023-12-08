public class StringBuilderMain {
    public static void main(String[] args) {
        //synchronized 인한 StringBuffer
        StringBuilder sbu = new StringBuilder(); //객체생성
        sbu.append("I")    // append는 String의 concat역할
           .append("go")
           .append("to school.");
        System.out.println(sbu);
        sbu.replace(7,11,""); // 7번째 부터 (11-7)번째 문자열 sch를 제거
        System.out.println(sbu);
        sbu.reverse();  // 문자열을 역순으로
        System.out.println(sbu);
        sbu.deleteCharAt(3);  // 3번째 문자 "o" 제거
        System.out.println(sbu);
        sbu.delete(1,3);  // 1번째부터 (3-1)까지 문자열 "lo" 지움, 자리는 0 부터 시작
        System.out.println(sbu);
        String ss=sbu.substring(0); // 0번째 이후 문자열을 잘라 새로운 문자열을 반환
        System.out.println(ss);
        System.out.println(sbu);
        String st=sbu.substring(0,4);  // 0번째에서 (4-1)번째까지 잘라 새로운 문자열 반환
        System.out.println(st);
        System.out.println(sbu);
    }
}
