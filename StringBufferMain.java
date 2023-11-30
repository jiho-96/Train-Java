public class StringBufferMain {
    public static void main(String[] args) {
        //StringBuffer 생성
        StringBuffer sbl = new StringBuffer();
        // 계속 붙이는 함수 mutable
        sbl.append("안녕하세요.")
           .append("또 만나요.")
           .append("기다리세요.");
        System.out.println(sbl.toString() + sbl.hashCode());
        // replace
        sbl.replace(0,5,"하이 하이");
        System.out.println(sbl.toString() + sbl.hashCode());
        // reverse
        sbl.reverse();
        System.out.println(sbl.toString());
        // delete
        sbl.delete(1,7); // 1번째부터 6번째까지
        System.out.println(sbl.toString());
        // cal by reference, shallow copy
        replaces(sbl);
        System.out.println(sbl.toString());
    }
    public static void replaces(StringBuffer sb){
        sb.reverse();
        sb.replace(0,3, "GoGo"); // 0부터 2까지 GoGo로
    }
}
