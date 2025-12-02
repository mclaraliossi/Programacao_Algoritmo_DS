package EstruturaDeRepetição;

import java.util.Scanner;

public class ExemploCaractere {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String palavra;
        int numero, posicao;
        char letra;

        System.out.println("Digite uma palavra");
        palavra = ler.next();

        numero = palavra.length(); //length conta quantas letras/caracteres a palavra tem

        System.out.println("A palavra dada possuí " + numero +  " letras.");

        System.out.println("Digite a posição da letra que deseja retirar da palavra.");
        System.out.println("Lembrando, a posição 0 é a primeira letra.");
        posicao = ler.nextInt();

        letra = palavra.charAt(posicao);

        System.out.println("A letra escolhida foi " + letra);

        
        



    }
}
