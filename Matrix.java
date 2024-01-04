import java.util.Arrays;

public class Matrix {
    private double [][] matrix; // 2차원 배열 선언
    public Matrix(int m, int n){  // mxn 배열 생성 및 초기화
        matrix=new double[m][n];
    }
    public Matrix(){ // 3x3 행렬
        this(3,3);
    }
    public Matrix(Matrix mat){
        this(mat.getMatrix());
    }
    public Matrix(double[][] deep){
        matrix=deepCopy(deep);
    }
    public void clear(){
        int m = matrix.length;
        for(int i=0; i<m; i++){
            Arrays.fill(matrix[i], 0); // 모든 값을 0으로 초기화
        }
    }
    private double[][] deepCopy(double[][] deep){
        int m = deep.length;
        int n = deep[0].length;
        double[][] paste = new double[m][n];
        for (int i=0; i<m; i++){
            System.arraycopy(deep[i], 0, paste[i], 0, n);
        }
        return paste;
    }
    public double[][] getMatrix(){
        return deepCopy(matrix);
    }
    public Matrix makeMatrix(){
        return new Matrix(matrix);
    }
    public void print(){
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length;j++){
                System.out.printf("%f\t",matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("-------------------");
    }
}

