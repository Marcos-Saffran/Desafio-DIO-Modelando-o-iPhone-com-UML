package IPhone;

import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorNaInternet.NavegadorNaInternet;
import ReprodutorMusical.Musica;
import ReprodutorMusical.ReprodutorMusical;

public class IPhone {

    public static void main(String[] args) {
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

        Musica musica = new Musica();
        musica.setTitulo("Musica 1");

        reprodutorMusical.setMusicaAtual(musica);

        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica(musica.getTitulo());

        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();

        NavegadorNaInternet navegadorNaInternet = new NavegadorNaInternet();

    }

}
