package biblioteca;

public class Livro {
    private String nome;
    private String autor;
    private int codigo;
    private int anoPublicação;

    public Livro(String nome, String autor, int codigo, int anoPublicação) {
        this.nome = nome;
        this.autor = autor;
        this.codigo = codigo;
        this.anoPublicação = anoPublicação;
    }

    @Override
    public String toString() {
        return "Título: " + this.nome + "\n" + "Autor: " + this.autor + "\n" + "Ano de Publicação: "
                + this.anoPublicação + "\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnoPublicação() {
        return anoPublicação;
    }

    public void setAnoPublicação(int anoPublicação) {
        this.anoPublicação = anoPublicação;
    }

}
