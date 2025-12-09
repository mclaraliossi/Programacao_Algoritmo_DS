package VetorMatriz;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExemploVetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int vet[] = new int [10];
        int i;

        for(i=0; i<=9; i++){
            System.out.println("Digite valores pares dentro do vetor" + i + " :");
            vet[i] = ler.nextInt();

        }

        int menor = Arrays.stream(vet).min().getAsInt();
        int maior = Arrays.stream(vet).max().getAsInt();
        double media = Arrays.stream(vet).average().getAsDouble();
        int soma = Arrays.stream(vet).sum();

        System.out.println("O maior número é: " + maior + "\nO menor número do vetor é: " + menor + 
        "\nA média de números do vetor é: " + media + "\nA soma de todos os números do vetor é:");

        Arrays.sort(vet);

        System.out.println("Os números do vetor em ordem crescente é: ");
        System.out.println(Arrays.toString(vet));


        
    }
}
