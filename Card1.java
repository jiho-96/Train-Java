public class Card1 {
    private String cardVal; // H8
    public String getCardVal() {
        return cardVal;
    }
    public Card1(){
        int deck=(int)(Math.random()*CardUtil.SUIT.length); //0~1
        int suit=(int)(Math.random()*CardUtil.VALU.length); //0~9
        // 임의의 카드값을 갖음 H6
        cardVal=CardUtil.SUIT[deck]+CardUtil.VALU[suit];
    }
    // 테스트용
    public Card1(String s){
        this.cardVal=s; // 문자열은 값 복사
    }
    // 복사 생성자
    public Card1(Card1 c){
        this(c.getCardVal()); // 문자열은 값 복사
        // this.cardVal=c.getCardVal(); // 동일
    }

    @Override
    public String toString() {
        return "[" + cardVal + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cardVal == null) ? 0 : cardVal.hashCode());
        return result;
    }
    // 소스를 정리하면 카드값과 카드값을 일대일로 비교함

    @Override
    public boolean equals(Object obj) {
        Card1 cb = (Card1)obj;
        if (cardVal.equals(cb.getCardVal())){
            return true;
        } else {
            return false;
        }
    }
}
