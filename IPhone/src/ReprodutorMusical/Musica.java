package ReprodutorMusical;

import Interfaces.IMediaControl;

public class Musica implements IMediaControl {

    private String titulo;
    private Album album;

    @Override
    public void tocar() {
        System.out.println("Tocando música " + titulo);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música " + titulo);
    }

    @Override
    public void parar() {
        System.out.println("Parando música " + titulo);
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando volume da música " + titulo);
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Diminuindo volume da música " + titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

}
