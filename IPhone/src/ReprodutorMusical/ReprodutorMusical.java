package ReprodutorMusical;

import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical {

    private List<ListaPessoal> listasPessoais;
    private List<Artista> artistas;
    private List<Musica> musicas;
    private Musica musicaAtual;

    public ReprodutorMusical() {
        this.listasPessoais = new ArrayList<ListaPessoal>();
        this.artistas = new ArrayList<Artista>();
        this.musicas = new ArrayList<Musica>();
        this.musicaAtual = new Musica();
    }

    public void tocar() {
        this.musicaAtual.tocar();
    }

    public void pausar() {
        this.musicaAtual.pausar();
    }

    public void selecionarMusica(String musica) {

        System.out.println("Selecionando música " + musica);

    }

    public Musica getMusicaAtual() {
        return musicaAtual;
    }

    public void setMusicaAtual(Musica musicaAtual) {
        this.musicaAtual = musicaAtual;
    }

    public List<ListaPessoal> getListasPessoais() {
        return listasPessoais;
    }

    public void setListasPessoais(List<ListaPessoal> listasPessoais) {
        this.listasPessoais = listasPessoais;
    }

    public List<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<Artista> artistas) {
        this.artistas = artistas;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public void adicionarListaPessoal(ListaPessoal listaPessoal) {
        this.listasPessoais.add(listaPessoal);
    }

    public void adicionarArtista(Artista artista) {
        this.artistas.add(artista);
    }

    public void adicionarMusica(Musica musica) {
        this.musicas.add(musica);
    }

}
