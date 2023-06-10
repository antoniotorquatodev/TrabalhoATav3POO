public class Correios extends Entrega{
    //Atributos
    private String cidade;
    private String estado;
    private String TipoDeEnvio;

    //Construtor

    public Correios(int horario, String dia, String remetente, String endereco, String cidade, String estado, String tipoDeEnvio) {
        super(horario, dia, remetente, endereco);
        this.cidade = cidade;
        this.estado = estado;
        TipoDeEnvio = tipoDeEnvio;
    }

    //Getters e Setters

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoDeEnvio() {
        return TipoDeEnvio;
    }

    public void setTipoDeEnvio(String tipoDeEnvio) {
        TipoDeEnvio = tipoDeEnvio;
    }


    // Métodos abstratos para chamada de ações das extensões de ´Entrega´
    public  void calcularFrete(){

    }
    public  void agendarEntrega() {

    }

    }


