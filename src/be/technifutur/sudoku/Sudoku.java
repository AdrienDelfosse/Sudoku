package be.technifutur.sudoku;

public interface Sudoku {
    static final char EMPTY = ' ';
    public abstract void addValue(int line, int column, char value);
    public abstract char getValue(int line, int column);
    public abstract boolean isValueValid(char value);
    public abstract boolean isCellValid(int line, int column);

}
