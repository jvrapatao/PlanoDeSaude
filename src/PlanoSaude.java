public class PlanoSaude extends Pessoa {
    
    public PlanoSaude(String nome, int idade, long cpfL) {
        super(nome, idade, cpfL);
    }

    public void MeuPLano(){
       if(getIdade() <= 59){
           System.out.println("Plano Assalariado");
       }
       else System.out.println("Plano aposentado +60 com desconto");
    }

    public void MeuPLano2(){
        System.out.println("Nome: " + getNome() + " idade: " + getIdade() + " CPF: " + getCpfL());
        if(getIdade() <= 59){
            System.out.println("Plano Assalariado");
        }
        else System.out.println("Plano aposentado +60 com desconto");
    }
    
    public void MeuPLano3(Pessoa FichaCadastro){
        if(getIdade() <= 59){
            System.out.println("Plano Assalariado");
        }
        else System.out.println("Plano aposentado +60 com desconto");
    }
}