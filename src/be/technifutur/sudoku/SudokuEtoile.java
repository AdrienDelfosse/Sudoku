package be.technifutur.sudoku;

import java.util.Arrays;

public class SudokuEtoile implements Sudoku{
    private char[][] tab;

    public SudokuEtoile(){
        tab = new char[21][21];

        for(int i = 0; i <tab.length; i++){
            for(int j = 0; j < tab[i].length; j++){
                if(isCellValid(i,j)){
                    tab[i][j] = EMPTY;
                }
            }
        }
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
        if(Character.getNumericValue(value) < 21 && Character.getNumericValue(value) >= 0){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public boolean isCellValid(int line, int column) {
        if(line < 21 && column < 21){
            if(line > 8 && line < 12 && (column < 6 || column > 14 )  || (column > 8 && column < 12 && (line < 6 || line >14))){
                return false;
            }
            else{
                return true;
            }
        }else {
            return false;
        }
    }

    public void afficher(){
        for(int i = 0; i <tab.length; i++){
            System.out.println();
            for(int j = 0; j < tab[i].length; j++){
                System.out.print(tab[i][j] + " ");
            }
        }
    }
}
