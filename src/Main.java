import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("BEM VINDO(A) MENU KTP");
        System.out.println("Informe seu cargo. Digite 1 para gerente ou digite 2 para secretária:");

        int cargo = scanner.nextInt();

        if (cargo == 1) {

            System.out.println("Olá gerente! O que deseja fazer?");

        } else if (cargo == 2) {

            System.out.println("Olá secretária! O que deseja fazer?");

        } else {
            System.out.println("Cargo inválido. Encerrando o programa.");
        }

        scanner.close();
    }
    Scanner scanner = new Scanner(System.in); {
        System.out.println("1. Cadastrar cliente");
        System.out.println("2. Realizar venda");
        System.out.println("3. Realizar troca");
        System.out.println("4. Listar produtos");
    }




}
