import java.util.List;
import java.util.Scanner;

public class Devolver {

    public static void devolver(List<Livro> livros) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do livro: ");
        int numeroLivro = scanner.nextInt();

        for (int i = 0; i < livros.size(); i++) {

            if (livros.get(i).getNumero().equals(numeroLivro)) {
                livros.get(i).setStatus(Status.INDISPONIVEL);
            }
        }
    }
}
