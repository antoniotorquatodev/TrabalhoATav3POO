public abstract class Produto {
   //Atributos
    private String descricao;
    private boolean personalizado;
    private double valor;
    private boolean teste; //Criar classe excecao




    //Construtor
    public Produto(String descricao, boolean personalizado, double valor, boolean teste) {
        this.descricao = descricao;
        this.personalizado = personalizado;
        this.valor = valor;
        this.teste = teste;
    }


    // Getters e Setters

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isPersonalizado() {
        return personalizado;
    }

    public void setPersonalizado(boolean personalizado) {
        this.personalizado = personalizado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isTeste() {
        return teste;
    }

    public void setTeste(boolean teste) {
        this.teste = teste;
    }

    // Métodos abstratos para chamada de ações das extensões de ´Produto´
    public abstract void calcularPreco();
    public abstract void atualizarEstoque();

    //Método toString

    @Override
    public String toString() {
        return "Produto{" +
                "personalizado=" + personalizado +
                ", valor=" + valor +
                ", descricao='" + descricao + '\'' +
               ", teste=' " + teste + '\'' +
                '}';
    }

    // Exceção para produtos em teste




}
