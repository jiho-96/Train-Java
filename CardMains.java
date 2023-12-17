public class CardMains {
    public static void main(String[] args) {
        CardClass c1 = new CardClass("H4"); // 생성자 (String 아규먼트)
        CardClass c2 = new CardClass("H4"); // 생성자 (String 아규먼트)
        CardClass c3 = new CardClass(c1); // 복사 생성자 - 값 동일
        System.out.println(c1.hashCode()); // 값은 동일, 다른 해시
        System.out.println(c2.hashCode()); // 값은 동일, 다른 해시
        System.out.println(c1.getCardVal()); // 값은 동일
        System.out.println(c2.getCardVal()); // 값은 동일
        System.out.println(c1.equals(c2)); // hashCode 비교 중요 - false
        System.out.println(c1.equals(c3)); // hashCode 비교 중요 - false
        System.out.println(CardUtil.SUIT.length);
        for (int i = 0; i < CardUtil.SUIT.length; i++) { // SUIT 2
            for (int j = 0; j < CardUtil.VALU.length; j++) {// VALU 10
                // 값은 같을 수 있지만, 해시코드는 고유함
                CardClass c = new CardClass(); // 임의로 카드 생성 - 기본생성자()
                System.out.printf("%s\t", c); // c.toString()
            }
            System.out.println();
        }
    }
}