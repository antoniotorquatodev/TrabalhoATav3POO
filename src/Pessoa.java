public abstract class Pessoa {
    //Atributos
    private String nome;
    private String genero;
    private int idade;
    private String endereco;
    private String email;

    //Construtor
    public Pessoa(String nome, String genero, int idade, String endereco, String email) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.endereco = endereco;
        this.email = email;
    }

    // Getters


    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    // Métodos abstratos para chamada de ações das extensões de ´Pessoa´
    public abstract void executarAcao();
    public abstract void atualizarDados();

    //Método toString

}
