public class CardMain2 {
    public static void main(String[] args) {
        Card1 c1 = new Card1("H4");
        Card1 c2 = new Card1("H4");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.getCardVal());
        System.out.println(c2.getCardVal());
        System.out.println(c1.equals(c2)); // hashCode 비교 - 오버라이딩
        // 같은 값을 가질 때 같은 객체로 정의하고 싶으면 hashCode(), equals() 오버라이딩
    }
}
