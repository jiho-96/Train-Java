public class MatrixMain2 {
    public static void main(String[] args) {
        double [][] basic={{1,2,3}, {4,5,6}, {7,8,9}}; // 3x3 배열을 생성하고 값을 대입
        Matrix s0=new Matrix(basic); // 2차원 배열을 멤버로 갖는 행렬 생성
        s0.print();
        double [][] x2 = {{0,1,0},{0,0,1},{1,0,0}}; // 다른 3x3 배열을 생성하고 값을 대입
        double [][] x1 = {{0,0,1},{1,0,0},{0,1,0}};

        Matrix mx2 = new Matrix(x2); // 2차원 배열을 멤버로 갖는 다른 행렬을 생성
        Matrix mx1 = new Matrix(x1);

        Matrix s1 = MatrixUtil.mulMatrix(mx2, s0); // 두 행렬 mx2와 s0을 곱함
        s1.print(); // 행렬에 배열을 출력

        Matrix s2 = MatrixUtil.mulMatrix(mx1, s0);
        s2.print();

        Matrix s3 = MatrixUtil.mulMatrix(s0, mx1);
        s3.print();
    }
}
