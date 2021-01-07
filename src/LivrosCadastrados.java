import java.util.ArrayList;
import java.util.List;

public class LivrosCadastrados {

    private List<Livro> livros;

    public static List<Livro> getLivros() {

        List<Livro> livros = new ArrayList<>();

        livros.add(new Livro(1, "Como fazer sentido e bater o martelo",
                "Alexandro Aolchique", 2017, Status.DISPONIVEL, null));

        livros.add(new Livro(2, "Código Limpo", "Tio Bob",
                2001, Status.DISPONIVEL, null));

        livros.add(new Livro(3, "Basquete 101", "Hortência Marcari",
                2010, Status.DISPONIVEL, null));

        return livros;
    }
}
