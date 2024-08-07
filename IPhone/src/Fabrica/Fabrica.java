package Fabrica;

import AparelhoTelefonico.IAparelhoTelefonico;
import IPhone.IPhone;
import NavegadorNaInternet.INavegadorNaInternet;
import ReprodutorMusical.IMediaControl;

public class Fabrica {
    public static void main(String[] args) {

        IPhone iphone = new IPhone();
        iphone.ligar("123456789");
        iphone.atender();
        iphone.inicarCorreioVoz();
        iphone.exibirPagina("www.google.com");
        iphone.adicionarAba();
        iphone.atualizarPagina();
        iphone.tocar();
        iphone.pausar();
        iphone.parar();
        iphone.aumentarVolume();
        iphone.diminuirVolume();

        INavegadorNaInternet navegador = iphone;
        IMediaControl reprodutor = iphone;
        IAparelhoTelefonico aparelho = iphone;

        navegador.exibirPagina("www.google.com");
        reprodutor.tocar();
        aparelho.ligar("123456789");

    }

}
