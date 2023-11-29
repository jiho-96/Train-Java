public class StringTest {
    public static void main(String[] args) {
        String text = " Hello Java";
        String com = " HEllo Java";

        System.out.println(text.charAt(2)); // 2번 인덱스 e (text : 띄어쓰기부터 시작)
        System.out.println(text.concat("11")); // 문자열을 붙임
        System.out.println(text.contains("ell")); // 해당 문자열을 포함하면 true
        System.out.println(text.equals(com)); // 두 문자열이 같은지 비교
        System.out.println(text.equalsIgnoreCase(com)); // 대소문자 구분하지 않고 같은지 비교
        System.out.println(text.indexOf("a")); // 문자열이 처음 발견된 위치 반환, 없으면 -1
        System.out.println(text.lastIndexOf("a")); // 문자열이 가장 뒤쪽에 발견된 위치 반환, 없으면 -1
        System.out.println(text.trim()); // 양쪽 공백을 제거
        System.out.println(text.substring(7)); // 0~6번째 를 잘라버리고 7번째 이후를 반환
        System.out.println(text.substring(7,9)); // 7부터 (9-7) 자를 반환
        System.out.println(text.replace(" ", "-")); // 공백을 "-" 대체
        System.out.println(text.replaceAll(" ", "-"));
        System.out.println(text.toUpperCase()); // 대문자로 출력
        System.out.println(text.toLowerCase());  // 소문자로 출력

        String[] sp = text.split(" ");
        for (int i=0;i<sp.length;i++) {
            System.out.println(i+"\t\t" + sp[i] + "\t\t" + sp[i].length());
        }
    }
}
