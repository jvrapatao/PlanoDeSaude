import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Resultado {
public static void main(String[] args){
  
  PlanoSaude pessoa1 = new PlanoSaude("Lucas", 47, 489345671);
  PlanoSaude pessoa2 = new PlanoSaude("João", 67, 489388671);
  PlanoSaude pessoa3 = new PlanoSaude("Ana", 50, 793440921);
  PlanoSaude pesso4 = new PlanoSaude(null, 0, 0);
    pesso4.setNome("Vitor");
    pesso4.setIdade(32);
    pesso4.setCpfL(474298997);
    pesso4.FichaCadastro();
    pesso4.MeuPLano();
    pesso4.MeuPLano3(pesso4);
    pesso4.MeuPLano2();
    System.out.println("_________________________\n");
    
    pessoa1.FichaCadastro();
    pessoa1.MeuPLano();
    pessoa1.MeuPLano3(pessoa1);
    pessoa1.MeuPLano2();
    System.out.println("_________________________\n");

    pessoa2.FichaCadastro();
    pessoa2.MeuPLano();
    pessoa2.MeuPLano3(pessoa2);
    pessoa2.MeuPLano2();
    System.out.println("_________________________\n");

    pessoa3.FichaCadastro();
    pessoa3.MeuPLano();
    pessoa3.MeuPLano3(pessoa3);
    pessoa3.MeuPLano2();
    System.out.println("_________________________\n");

  List<PlanoSaude> listaPessoas = new ArrayList<>();
    listaPessoas.add(new PlanoSaude("Alice", 72, 87662873));
    listaPessoas.add(new PlanoSaude("Bernardo", 41, 78627672));
    listaPessoas.add(new PlanoSaude("Carol", 33, 72652522));
    System.out.println("Nomes de pessoas cadastradas: ");
    listaPessoas.forEach(p -> System.out.println(p.getNome()));
    System.out.println("_________________________\n");
  
    System.out.println("Cadastro completo:");
    listaPessoas.forEach(PlanoSaude::MeuPLano2);  
  
  List<PlanoSaude> pessoas = listaPessoas.stream()
    .filter(pessoa -> pessoa.getIdade() % 2 == 0)
    .collect(Collectors.toList());
    System.out.println("\nPessoas com idade par:");
    pessoas.forEach(pessoa -> System.out.println(pessoa.getNome() + ": " + pessoa.getIdade()));
    System.out.println("_________________________\n");

  listaPessoas.forEach(pessoa -> {
    System.out.println("Pessoas com idade par ou ímpar: ");
      if (pessoa.getIdade() % 2 == 0) {
        System.out.println(pessoa.getNome() + " " + pessoa.getIdade());
      }else {
      System.out.println(pessoa.getNome() + " " + pessoa.getIdade());
      }
    });
  }
}

