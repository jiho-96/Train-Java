public class UseEnum {
    public static void main(String[] args) {
        FRUIT pear = FRUIT.APPLE;
        FRUIT pear2 = FRUIT.MANGO;
        System.out.println(pear);
        System.out.println(pear.name());
        System.out.println(pear.ordinal()); //선언될 때 순서 0, APPLE 위치
        System.out.println(pear2.ordinal()); // 선언될 때 순서 2, MANGO 위치
        FRUIT [] fruits=FRUIT.values(); // 모든 enum 상수를 반환
        System.out.println(fruits[0]);
    }
}

// class 키워드 대신 enum 키워드를 사용
// enum 상수는 static final을 사용하지 않고 대문자로 선언, 선언한 순서대로 0,1,2 처럼 값이 자동을 대입됨