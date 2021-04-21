package be.technifutur.sudoku;

public class Sudoku9X9 implements Sudoku{

    private char[][] tab;

    public Sudoku9X9(){
        tab = new char[9][9];
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
        if(Character.getNumericValue(value) < 9 && Character.getNumericValue(value) >= 0){
            return true;
        }else {

            return false;
        }
    }

    @Override
    public boolean isCellValid(int line, int column) {
        if(line < 9 && column < 9){
            return true;
        }else {
            return false;
        }
    }
}
