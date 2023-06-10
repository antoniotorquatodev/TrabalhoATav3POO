public class UberFlash extends Entrega{

    //Atributos
    private String motorista;
    private String TipoVeiculo;

    //Construtor
    public UberFlash(int horario, String dia, String remetente, String endereco, String motorista, String tipoVeiculo) {
        super(horario, dia, remetente, endereco);
        this.motorista = motorista;
        TipoVeiculo = tipoVeiculo;
    }

    //Getters e Setters
    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public String getTipoVeiculo() {
        return TipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        TipoVeiculo = tipoVeiculo;
    }


    // Métodos abstratos para chamada de ações das extensões de ´Entrega´
    public  void calcularFrete(){

    }
    public  void agendarEntrega() {

    }
}


