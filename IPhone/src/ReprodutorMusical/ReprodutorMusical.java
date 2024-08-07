package ReprodutorMusical;

import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical implements IMediaControl {

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

    @Override
    public void tocar() {
        System.out.println("Tocando música " + musicaAtual.getTitulo());
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música " + musicaAtual.getTitulo());
    }

    @Override
    public void parar() {
        System.out.println("Parando música " + musicaAtual.getTitulo());
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando volume da música " + musicaAtual.getTitulo());
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Diminuindo volume da música " + musicaAtual.getTitulo());
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
