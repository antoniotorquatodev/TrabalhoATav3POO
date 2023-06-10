public class Funcionario extends Pessoa {
    //Atributos
    private String cargo;
    private double salario;

    //Construtor
    public Funcionario(String nome, String genero, int idade, String endereco, String email, String cargo, double salario) {
        super(nome, genero, idade, endereco, email);
        this.cargo = cargo;
        this.salario = salario;
    }

    //Getters e Setters

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Métodos abstratos para chamada de ações das extensões de ´Pessoa´
    public  void executarAcao(){

    }
    public  void atualizarDados(){

    }



    //Método toString

    @Override
    public String toString() {
        return "Funcionario{" +
                "cargo=" + cargo +
                ", salario=" + salario +
                '}';
    }
}
