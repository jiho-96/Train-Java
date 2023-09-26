public class E3 {
    public static void main(String[] args) {
        int fahrenheit = 98;
        float celcius = (int)((5/9f * (fahrenheit - 32))*100 + 0.5) / 100f;
        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}

// 화씨 섭씨 변환