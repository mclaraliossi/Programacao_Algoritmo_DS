package EstruturaDeRepetição;

import java.util.Scanner;

public class Ex48SomaPostNeg {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double num=0, i, somap=0, soman=0;

        for(i=1; i<=10; i++){
            System.out.println("Digite " + i +" Numeros:");
            num=ler.nextDouble();

            if (num > 0) {
                soman += num;
            } else {
                somap += num;
            }
        }
       
        System.out.println("Soma dos números positivos: " + soman +
        "\nA soma dos números negativos: " + somap);
    }
}
