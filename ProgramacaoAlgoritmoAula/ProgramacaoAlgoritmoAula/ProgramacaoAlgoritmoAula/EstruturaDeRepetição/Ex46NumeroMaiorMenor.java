package EstruturaDeRepetição;

import java.util.Scanner;

public class Ex46NumeroMaiorMenor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int n = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;


        for(int i= 0; i <=9; i++){

            System.out.println("Digite 10 números");
            n = ler.nextInt();


            if(n > maior){
                maior = n;
            }
            if(n < menor){
                menor = n;
            }

        }

        System.out.println("O maior número é: " + maior + ". E o menor é: " + menor);
    }
}
