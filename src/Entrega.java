public abstract class Entrega {
   //Atributos
    private int horario;
    private String dia;
    private String remetente;
    private String endereco;

    // Construtor
    public Entrega(int horario, String dia, String remetente, String endereco) {
        this.horario = horario;
        this.dia = dia;
        this.remetente = remetente;
        this.endereco = endereco;
    }

    //Getters e Setters


    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Métodos abstratos para chamada de ações das extensões de ´Entrega´
    public abstract void calcularFrete();
    public abstract void agendarEntrega();


    //Método toString

    @Override
    public String toString() {
        return "Entrega{" +
                "horario=" + horario +
                ", remetente='" + remetente + '\'' +
                ", dia=" + dia +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
