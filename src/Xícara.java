public class Xícara extends Produto {
//Atributos

    private int capacidade;
    private int estoque;
    private boolean ouro;

    //Construtor
    public Xícara(String descricao, boolean personalizado, double valor, boolean teste, int capacidade, int estoque, boolean ouro) {
        super(descricao, personalizado, valor, teste);
        this.capacidade = capacidade;
        this.estoque = estoque;
        this.ouro = ouro;
    }


    //Getters e Setters

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public boolean isOuro() {
        return ouro;
    }

    public void setOuro(boolean ouro) {
        this.ouro = ouro;
    }

    // Métodos abstratos para as extensões de ´Produto´
    public void calcularPreco(){

    }
    public void atualizarEstoque(){

    }



    //Método toString

    @Override
    public String toString() {
        return "Xicara{" +
                "capacidade=" + capacidade +
                ", estoque='" + estoque + '\'' +
                ", ouro='" + ouro + '\'' +
                '}';
    }
}
