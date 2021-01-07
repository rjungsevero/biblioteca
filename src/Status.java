public enum Status {

    DISPONIVEL("Disponível"),
    INDISPONIVEL("Indisponível");

    private final String descricao;

    public String getDescricao() {
        return descricao;
    }

    Status(String descricao) {
        this.descricao = descricao;
    }
}
