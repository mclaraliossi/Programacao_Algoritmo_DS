package EstruturaDeRepetição;

import java.util.Scanner;

public class Ex52CadastroSenha {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String senha;
        int numero;

        while (true) {
            
            System.out.println("Digite sua senha: ");

            if(senha.length() < 6){
                System.out.println("Sua senha deve conter pelo menos 6 caracteres");
            }
        }
    }
}
