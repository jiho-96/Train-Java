// 객체 - 중요한 데이터를 저장
public class Card {
    // 데이터 보호 - 은닉화 - 접근 제한자 private
    private String cardVal;
    // 멤버 접근 메서드
    public String getCardVal(){
        return cardVal;
    }
    // 기본 생성자 - 멤버 초기화
    public Card() {
        this("H2"); // 아래와 동일
        // this.cardVal="H2"
    }
    // 테스트용
    public Card(String s){
        this.cardVal=s; // 문자열은 값 복사
    }

    // 복사 생성자
    public Card(Card c){
        this(c.getCardVal()); // 문자열은 값 복사
        // this.cardVal=c.getCardVal(); // 동일
    }
    // cardVal 내용 [H3

    @Override
    public String toString() {
        return "[" + cardVal + "]";
    }
}
