import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class UsingClass {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Class classes = obj1.getClass(); // 클래스에 대한 모든 정보는 java.lang.Class 사용
        System.out.println(classes.getName()); // 클래스 이름 리턴
        System.out.println("-----constructor-----");
        Constructor[] constructor = classes.getDeclaredConstructors(); // 생성자를 배열로 받음
        for (Constructor con:constructor) {
            System.out.println(con.getName()); // 생성자의 이름을 출력
        }
        System.out.println("-----Method-----");
        Method[] method = classes.getMethods(); // 클래스의 모든 메서드를 리턴하여 배열에 저장
        for (Method me:method) {
            System.out.println(me.getName()); // 메서드의 이름 출력
        }
    }
}
