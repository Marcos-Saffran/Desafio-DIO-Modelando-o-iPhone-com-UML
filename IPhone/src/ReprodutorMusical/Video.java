package ReprodutorMusical;

import Interfaces.IMediaControl;

public class Video implements IMediaControl {

    private String titulo;

    @Override
    public void tocar() {
        System.out.println("Tocando vídeo " + titulo);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando vídeo " + titulo);
    }

    @Override
    public void parar() {
        System.out.println("Parando vídeo " + titulo);
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando volume do vídeo " + titulo);
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Diminuindo volume do vídeo " + titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
