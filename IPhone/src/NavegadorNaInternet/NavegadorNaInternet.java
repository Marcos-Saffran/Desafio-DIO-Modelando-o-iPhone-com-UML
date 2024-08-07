package NavegadorNaInternet;

public class NavegadorNaInternet implements INavegadorNaInternet {

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarAba() {
        System.out.println("Adicionando aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

}
