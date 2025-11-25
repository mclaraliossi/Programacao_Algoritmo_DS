package EstruturaDeRepetição;

import java.util.Scanner;

public class ExemploFor3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int i, n;

        System.out.println("Digite um número de 1 a 10");
        n = ler.nextInt();

        for(i = 1; i <=10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));

        }
    }
}
