public class MathTestMain {
    public static void main(String[] args) {
        // constant
        System.out.println("Math.E" + Math.E);
        System.out.println("Math.PI" + Math.PI);
        //method
        System.out.println("Math.abs(-5) 절대값 " + Math.abs(-5));
        System.out.println("Math.ceil(4.34) 올림 " + Math.ceil(4.34));
        System.out.println("Math.round(4.34) 반올림 " + Math.round(4.34));
        System.out.println("Math.floor(4.34) 버림 " + Math.floor(4.34));
        System.out.println("Math.rint(4.34) 반올림 " + Math.rint(4.34));
        System.out.println("Math.max(45,78) 최대값" + Math.max(45,78));
        System.out.println("Math.min(45, 78) 최소값 " + Math.min(45, 78));
        System.out.println("Math.pow(2,4) 2^4 승수 " + Math.pow(2,4));
        System.out.println("Math.log(30) 밑수가 Math.E인 로그 " + Math.log(30));
        System.out.println("Math.exp(3) pow(Math.E,num)로 자연 지수의 승수 " + Math.exp(3));
        System.out.println("Math.sqrt(10) 양의 제곱근 " + Math.sqrt(10));
        //Random
        double dRan=Math.random(); // 0~1 사이의 실수
        System.out.println("Math.random() =>" + dRan);
    }
}
