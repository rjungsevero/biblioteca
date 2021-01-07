import java.util.List;
import java.util.Scanner;

public class Biblioteca {

    private static String menu() {

        System.out.println("\nBIBLIOTECA");
        System.out.println("1 - Doar");
        System.out.println("2 - Retirar");
        System.out.println("3 - Devolver");
        System.out.println("4 - Sair");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Selecione uma opção: ");
        return scanner.next();

    }

    public static void main(String[] args) {

        List<Livro> livros = LivrosCadastrados.getLivros();

        while (true) {

            String escolha = menu();

            if (Validation.isDigit(String.valueOf(escolha))) {

                if (Integer.parseInt(escolha) < 1 || Integer.parseInt(escolha) > 4) {
                    System.out.println("\nOpção inválida. Selecione entre 1 e 4");

                } else if (Integer.parseInt(escolha) == 1) {
                    Doar.doar();

                } else if (Integer.parseInt(escolha) == 2) {
                    Retirar.retirar();

                } else if (Integer.parseInt(escolha) == 3) {
                    Devolver.devolver(livros);
                } else {
                    break;
                }

            } else {
                System.out.println("\nOpção inválida. Selecione entre 1 e 4");
            }
        }
    }
}
