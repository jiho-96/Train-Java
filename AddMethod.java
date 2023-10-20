// getTotal(), getAverage() 메서드 추가

// getTotal - kor, eng, math 모두 더해 반환, 타입 int, 매개변수 없음
// getAverage - 총점을 과목수로 나눈 평균, 소수점 둘째자리에서 반올림. 타입 float, 매개변수 없음

public class AddMethod {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;
        System.out.println("이름: " + s.name );
        System.out.println("총점: " + s.getTotal());
        System.out.println("평균: " + s.getAverage());
    }
}

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    // getTotal 메서드 추가, 매개변수 X, int 타입
    int getTotal(){
        return kor+eng+math;
    }

    float getAverage(){
        return (int) (getTotal() / 3f*10+0.5f) / 10f;
        // 총점의 타입이 int이기 때문에 3으로 나누면 int와 int간의 연산이므로
        // 결과를  int로 얻어 소수점 이하 값은 버려짐
        // float 타입의 리터럴인 3f로 나누어줌
        // 소수점 둘째 자리에서 반올림하려면 10을 곱하고 0.5를 더한 다음 다시 10f로 나누어줌
    }
}
