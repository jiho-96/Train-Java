public class SudokuMain {
    public static void main(String[] args) {
        Sudoku sd = new Sudoku(3);
        sd.setShuffle(false);
        sd.init();
        sd.shuffle();
    }
}
