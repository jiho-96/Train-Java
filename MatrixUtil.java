public class MatrixUtil {
    public static Matrix addMatrix(Matrix a, Matrix b){ // 두 행렬을 입력받아 합을 구하고 반환
        int m = a.getMatrix().length;  // 행렬의 행으 수를 구함
        int n = a.getMatrix()[0].length; // 행렬의 열의 수를 구함
        double [][]c = new double[m][n]; // 2차원 배열 생성
        for (int i=0; i<c.length; i++){ // 두 행렬의 i행, j열 값을 더해 배열 c[i][j]에 대입
            for (int j=0; j<c.length; j++){
                c[i][j]=a.getMatrix()[i][j] + b.getMatrix()[i][j];
            }
        }
        return new Matrix(c); // 두 행렬의 합을 구한 새로운 행렬을 생성
    }
    public static Matrix diffMatrix(Matrix a, Matrix b){ // 두 행렬의 차를 구하여 배열 c[i][j]에 대입
        int m=a.getMatrix().length;
        int n=a.getMatrix()[0].length;
        double [][]c = new double[m][n];
        for (int i=0; i<c.length; i++){
            for (int j=0; j<c[i].length; j++){
                c[i][j]=a.getMatrix()[i][j]-b.getMatrix()[i][j];
            }
        }
        return new Matrix(c);
    }
    public static Matrix mulMatrix(Matrix a, Matrix b){
        int m=a.getMatrix().length;
        int n=a.getMatrix()[0].length;
        int p=b.getMatrix()[0].length;

        double[][]c = new double[m][p];
        for (int i=0; i<m; i++){
            for (int j=0; j<p; j++){
                for (int k=0; k<n; k++){
                    c[i][j]+=a.getMatrix()[i][k]*b.getMatrix()[k][j];
                }
            }
        }
        return new Matrix(c);
    }

    public static Matrix toOneTwo(Matrix matrix, int rows, int columns) {
        return new Matrix(matrix);
    }

    public static Matrix toTwoOne(Matrix matrix) {
        double[][] twoDimensionalArray = matrix.getMatrix();
        int rows = twoDimensionalArray.length;
        int columns = twoDimensionalArray[0].length;
        double[] oneDimensionalArray = new double[rows * columns];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                oneDimensionalArray[index++] = twoDimensionalArray[i][j];
            }
        }
        // 1차원 배열을 가지고 새로운 Matrix 객체 생성
        double[][] oneTwoArray = new double[1][oneDimensionalArray.length];
        for (int i = 0; i < oneDimensionalArray.length; i++) {
            oneTwoArray[0][i] = oneDimensionalArray[i];
        }
        return new Matrix(oneTwoArray);
    }
}
