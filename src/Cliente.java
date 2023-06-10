public class Cliente extends Pessoa {
    //Atributos
    private String TipoCliente;   //Para pessoa física ou pessoa jurídica

    //Construtor
    public Cliente(String nome, String genero, int idade, String endereco, String email, String tipoCliente) {
        super(nome, genero, idade, endereco, email);
        TipoCliente = tipoCliente;
    }

    //Getters e Setters

    public String getTipoCliente() {
        return TipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        TipoCliente = tipoCliente;
    }

    // Métodos abstratos para chamada de ações das extensões de ´Pessoa´
    public  void executarAcao(){

    }
    public  void atualizarDados(){

    }

    //Método toString

    @Override
    public String toString() {
        return "Cliente{" +
                "TipoCliente=" + TipoCliente +
                '}';
    }
}
