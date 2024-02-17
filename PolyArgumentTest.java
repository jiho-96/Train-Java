public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Television());
        b.buy(new Computer());

        System.out.println("현재 남은 돈은 " + b.money + "만원" );
        System.out.println("현재 보너스 점수는  " + b.bonusPoint + "점" );
    }
}

class Product {
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Television extends Product{
    Television(){
        // 조상클래스 생성자 Product(int price)호출
        super(100);
    }
    // Object클래스의 toString()을 오버라이딩
    public String toString() {return "Television";}
}

class Computer extends Product{
    Computer() {super(200);}

    public String toString() {return "Computer";}
}

class Buyer{
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p){
        if (money < p.price){
            System.out.println("잔액이 부족합니다");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + " 구입했습니다");
    }
}
