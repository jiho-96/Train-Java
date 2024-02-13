public class InstanceofTest {
    public static void main(String[] args) {
        FireEngines fe = new FireEngines();

        if (fe instanceof FireEngines){
            System.out.println("This is a FireEngine instance.");
        }

        if (fe instanceof Car){
            System.out.println("This is a Cars instance");
        }

        if (fe instanceof Object){
            System.out.println("This is an Object instance");
        }

        System.out.println(fe.getClass().getName()); // 클래스 이름 출력
    }
}

class Car {}
class FireEngines extends Car {}
