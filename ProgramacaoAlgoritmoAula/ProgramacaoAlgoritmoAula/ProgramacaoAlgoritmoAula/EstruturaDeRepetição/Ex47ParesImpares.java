package EstruturaDeRepetição;

import java.util.Scanner;

public class Ex47ParesImpares {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int par = 0, impar = 0, n = 0;

        for(int i = 0; i <= 9; i++){

            System.out.println("Digite um número: ");
            n = ler.nextInt();

            if(n % 2 == 0){
                par++;
            }
            if(n % 2 != 0){
                impar++;
            }

        }
        System.out.println("A quantidade de pares é: " + par + "\nA quantidade de ímpares é: " + impar);
    }
    
}
