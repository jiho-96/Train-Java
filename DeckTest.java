public class DeckTest {
    public static void main(String[] args) {
        Deck d = new Deck(); // 카드 한 벌을 만듬
        Cards c = d.pick(0); // 섞기 전에 제일 위의 카드를 뽑음
        System.out.println(c);

        d.shuffle(); // 카드 섞음
        c = d.pick(0); // 섞은 후에 제일 위에 카드 뽑음
        System.out.println(c);
    }
}

class Deck {
    final int CARD_NUM = 52; // 카드 개수
    Cards cardArr[] = new Cards[CARD_NUM]; // Card 객체 배열을 포함

    Deck () { // Deck 카드 초기화
        int i = 0;

        for (int k=Cards.KIND_MAX; k > 0; k--)
            for (int n=0; n < Cards.NUM_MAX; n++)
                cardArr[i++] = new Cards(k, n+1);
    }
    Cards pick(int index){ // 저장된 위치에 있는 카드 하나를 꺼내서 반환
        return cardArr[index];
    }
    Cards pick() { // Deck에서 카드 하나 선택
        int index = (int) (Math.random() * CARD_NUM);
        return pick(index);
    }

    void shuffle(){ // 카드 순서를 섞음
        for (int i=0; i< cardArr.length; i++){
            int r = (int) (Math.random() * CARD_NUM);

            Cards temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
}

class Cards {
    static final int KIND_MAX = 4; // 카드 무늬 수
    static final int NUM_MAX = 13; // 무늬별 카드 수
    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    Cards(){
        this(SPADE, 1);
    }
    Cards(int kind, int number){
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK";

        return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
    }
}
