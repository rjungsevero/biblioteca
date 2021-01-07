public class Livro {

    private Integer numero;
    private String titulo;
    private String autor;
    private Integer ano;
    private Status status;
    private String emprestadoPara;

    public Livro(Integer numero, String titulo, String autor, Integer ano, Status status, String emprestadoPara) {
        this.numero = numero;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.status = status;
        this.emprestadoPara = emprestadoPara;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getEmprestadoPara() {
        return emprestadoPara;
    }

    public void setEmprestadoPara(String emprestadoPara) {
        this.emprestadoPara = emprestadoPara;
    }
}
