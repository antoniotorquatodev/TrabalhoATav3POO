public class JoiaDoDia extends Produto{
    //Atributos
    private int estoque;
    private boolean ouro;

    //Construtor
    public JoiaDoDia(String descricao, boolean personalizado, double valor, boolean teste, int estoque, boolean ouro) {
        super(descricao, personalizado, valor, teste);
        this.estoque = estoque;
        this.ouro = ouro;
    }

    // Getters e Setters

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
        return "JoiaDoDia{" +
                ", estoque='" + estoque + '\'' +
                ", ouro='" + ouro + '\'' +
                '}';
    }
}
