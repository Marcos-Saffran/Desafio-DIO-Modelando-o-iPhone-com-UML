package AparelhoTelefonico;

public class AparelhoTelefonico implements IAparelhoTelefonico {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void inicarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

}
