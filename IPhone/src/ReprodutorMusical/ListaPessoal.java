package ReprodutorMusical;

public class ListaPessoal {

    String nome;
    String descricao;
    Musica[] musicas;

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Musica[] getMusicas() {
        return musicas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setMusicas(Musica[] musicas) {
        this.musicas = musicas;
    }

}
