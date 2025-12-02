package EstruturaDeRepetição;

import java.util.Scanner;

public class Ex51Calculadora {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double n1; 
        double n2;
        int operacao;

        while(true){

            System.out.println("Digite dois operandos(números)");
            n1 = ler.nextDouble();
            n2 = ler.nextDouble();

            if(n1 == 0 && n2 == 0){
                System.out.println("Os dois operadores valem 0! Encerrando programa...");
                break;
            }

            System.out.println("Escolha uma operação: 1 para soma, 2 subtração, 3 para multiplicação, 4 para divisão e 5 para potência.");
            operacao =ler.nextInt();

            if(operacao == 1){
                System.out.println("O resultado é: " + (n1 + n2));

            }else if(operacao == 2){
                System.out.println("O resultado é: " + (n1 - n2));

            }else if(operacao == 3){
                if(n1 == 0 || n2 == 0 ){
                    System.out.println("Erro: operandos não podem ser 0");
                    continue;
                }
                System.out.println("O resultado é: " + (n1 * n2));

            }else if(operacao == 4){
                if(n1 == 0 || n2 == 0 ){
                    System.out.println("Erro: operandos não podem ser 0");
                }
                System.out.println("O resultado é: " + (n1 / n2));

            }else if(operacao == 5){
                System.out.println("O resultado é: " + (Math.pow(n1, n2)));
            }else{
                System.out.println("Opção inválida!");
                continue;
            }

        };
    }
}
