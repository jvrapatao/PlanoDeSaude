public class Pessoa {

    private String nome;
    private int idade;
    private Long cpfL;

    public Pessoa(String nome, int idade, long cpfL) {
        this.nome = nome;
        this.idade = idade;
        this.cpfL = (long) cpfL;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Long getCpfL() {
        return cpfL;
    }
    public void setCpfL(long cpfL) {
        this.cpfL = (long) cpfL;
    }
    
    public void FichaCadastro(){
        System.out.println("Nome: " + nome + " idade: " + idade + " CPF: " + cpfL);
    }
    @Override
    public String toString() {
       return "nome: " + nome + ", idade: " + idade + ", cpf: " + cpfL ;
    }

    
}
