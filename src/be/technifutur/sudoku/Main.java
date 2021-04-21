package be.technifutur.sudoku;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sudoku");
        SudokuEtoile s4 = new SudokuEtoile();

        s4.addValue(1,0,'3');
        System.out.println(s4.getValue(3,2));
        System.out.println(s4.isValueValid('3'));
        System.out.println(s4.isCellValid(5,9));
        s4.afficher();
    }
}
