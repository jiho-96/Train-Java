public class Draw {
    public static void main(String[] args) {
        Point[] p = { new Point(100, 100),
                new Point(140, 50),
                new Point(200, 100)
        };
        Triangle t = new Triangle(p);
        Circle c = new Circle(new Point(150, 150), 50);

        t.draw(); // 삼각형 그리기
        c.draw(); // 원 그리기
    }
}

class Shape {
    String color = "black";

    void draw() {
        System.out.printf("[color=%s]%n", color);
    }
}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point() {
        this(0, 0);
    }

    String getXY() {
        return "(" + x + "," + y + ")"; // x와 y 값을 문자열로 변환
    }
}

class Circle extends Shape { // Circle과 Shape는 상속관계
    Point center; // 원점좌표    // Circle과 Point는 포함관계
    int r; // 반지름

    Circle() {
        this(new Point(0, 0), 100); // Circle(Point center, int r) 호출
    }

    Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    void draw() { // 원의 정보를 출력
        System.out.printf("[center=(%d, %d), r=%d, color=%s]%n",
                center.x, center.y, r, color);
    }
}

class Triangle extends Shape {
    Point[] p = new Point[3]; // 3개의 배열 생성

    Triangle(Point[] p) {
        this.p = p;
    }

    void draw() {
        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n",
                p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
    }
}