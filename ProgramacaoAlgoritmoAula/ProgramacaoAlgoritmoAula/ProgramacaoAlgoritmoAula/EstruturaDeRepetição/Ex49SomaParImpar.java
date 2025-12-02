package EstruturaDeRepetição;

import java.util.Scanner;

public class Ex49SomaParImpar {
     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double num=0, i, somap=0, somai=0;

        for(i=1; i<=10; i++){
            System.out.println("Digite " + i +" Numeros:");
            num=ler.nextDouble();

            if (num % 2 != 0) {
                somai += num;
            } if ( num % 2 == 0) {
                somap += num;
            }
        }
       
        System.out.println("A soma dos números pares: " + somap +
        "\nA soma dos números ímpares: " + somai +
        "\nA diferença entre essas somas: " + (somap-somai));

    }
}
