

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico{

    private long ID;
    private String nome;
    private int numero;

    public Iphone(long ID, String nome, int numero){
        this.ID = ID;
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public void ligar(){
        System.out.println("Ligando...");
    }

    @Override
    public void atender(){
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioDeVoz(){
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void abrirPagina(String url){
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando página...");
    }

    @Override
    public void tocar(){
        System.out.println("Tocando...");
    }

    @Override
    public void pausar(){
        System.out.println("Pausando...");
    }

    @Override
    public void selecionarMusica(String musica){
        System.out.println("Selecionando música: " + musica);
    }


}
