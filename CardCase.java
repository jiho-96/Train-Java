import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardCase {
    //aggregation : CardCase는 Card로 구성
    private List<CardClass> cards=new ArrayList<>();
    public CardCase(){
        cards.clear();  // 내용 지우기
    }
    // List 반환
    public int count(){
        return cards.size(); // 저장된 Card 개수
    }
    // List의 index번째 Card
    public CardClass getCard(int index){
        return cards.get(index); // index 번째 Card
    }
    // 서로 다른 카드 20장 만들기
    public void make(){
        cards.clear(); // 내용 지우기
        int suit = CardUtil.SUIT.length; // 2
        int valu = CardUtil.VALU.length; // 10
        int count=0;
        // 서로 다른 20개의 카드를 만듬
        while (count!=valu*suit) { // 20장이 될 때까지
            CardClass c = new CardClass(); // 임의의 카드를 만듬
            if (!cards.contains(c)) { // contains -> equals()를 이용해 비교
                cards.add(c);
                count++;
            }
    }
}
public void shuffle(){
    Collections.shuffle(cards); // 카드 섞기
    }
    public void print(){
        int valu=CardUtil.VALU.length;
        for (int i=0; i < cards.size(); i++){
            CardClass c = cards.get(i);
            System.out.printf("%s", c.toString());
            if ((i+1)%valu==0){
                System.out.println();
            }
        }
    }
}
