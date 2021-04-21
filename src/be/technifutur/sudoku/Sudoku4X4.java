package be.technifutur.sudoku;

public class Sudoku4X4 implements Sudoku {

    private char[][] tab;

    public Sudoku4X4(){
        tab = new char[4][4];
    }
    @Override
    public void addValue(int line, int column, char value) {
        if(isValueValid(value) && isCellValid(line, column)){
            tab[line][column]= value;
        }
    }

    @Override
    public char getValue(int line, int column) {
        return tab[line][column];
    }

    @Override
    public boolean isValueValid(char value) {
        if(Character.getNumericValue(value) < 4 && Character.getNumericValue(value) >= 0){
            return true;
        }else {

            return false;
        }
    }

    @Override
    public boolean isCellValid(int line, int column) {
        if(line < 4 && column < 4){
            return true;
        }else {
            return false;
        }
    }
}
