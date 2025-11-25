package EstruturaDeRepetição;

import java.util.Scanner;

public class Ex45NumerosInteiros {
    public static void main(String[] args) {
        
        Scanner ler =  new Scanner(System.in);
        
        int soma = 0, n;

        for(int i = 0; i<= 9 ; i++){

        System.out.println("Digite um número");
        n = ler.nextInt();

        soma = soma + n;

        }

        System.out.println("Total da soma: " + soma);
        System.out.println("Média total: " + soma / 10);
    }
}
