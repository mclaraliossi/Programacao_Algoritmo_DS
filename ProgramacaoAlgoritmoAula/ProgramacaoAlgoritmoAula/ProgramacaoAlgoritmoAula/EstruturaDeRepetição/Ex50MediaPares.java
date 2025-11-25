package EstruturaDeRepetição;

import java.util.Scanner;

public class Ex50MediaPares {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double soma = 0;
        int i = -1;
        int n = 0;

        do{

            System.out.println("Digite um número");
            n = ler.nextInt();

            if(n % 2 == 0){

                soma = soma + n;
                i++;
            }

        }while(n != 0);

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é " + soma/i);
    }
}
