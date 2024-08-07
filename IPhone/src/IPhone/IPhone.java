package IPhone;

import AparelhoTelefonico.IAparelhoTelefonico;
import NavegadorNaInternet.INavegadorNaInternet;
import ReprodutorMusical.IMediaControl;

public class IPhone implements IAparelhoTelefonico, INavegadorNaInternet, IMediaControl {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando do IPhone para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada do IPhone ");
    }

    @Override
    public void inicarCorreioVoz() {
        System.out.println("Iniciando correio de voz do IPhone ");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo do IPhone página: " + url);
    }

    @Override
    public void adicionarAba() {
        System.out.println("Adicionando do IPhone aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página do IPhone ");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando músicado IPhone ");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando músicado IPhone ");
    }

    @Override
    public void parar() {
        System.out.println("Parando música do IPhone ");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando volume do IPhone ");
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Diminuindo volume do IPhone ");
    }

}
