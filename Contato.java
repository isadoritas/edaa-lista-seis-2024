import java.util.ArrayList;

public class Contato implements Telefone {
  String nome;
  long numero;
  ArrayList<Contato> listaContatos;

  public Contato(String nome, long numero) {
    this.nome = nome;
    this.numero = numero;
    this.listaContatos = new ArrayList<>();

  }


  public void adicionar(String nome, long numero) {
      Contato novo_contato = new Contato(nome, numero);
      listaContatos.add(novo_contato);
  }

  public String buscar(String nome) {
    for (Contato contato : listaContatos) {
      if (contato.nome.equals(nome)) {
        Contato contatoEncontrado = contato;
        System.out.println("Número encontrado: " + contatoEncontrado.numero);
        break;
      } else {
        System.out.println("Contato não encontrado");
      }
    }
    // Retorna o nome do contato encontrado
    return nome;
  }
  

  public String listar() {
    StringBuilder sb = new StringBuilder();
    for (Contato contato : listaContatos) {
      sb.append("Nome: ").append(contato.nome).append(" Número: ").append(contato.numero).append("\n");
    }
    System.out.println(sb);
    return sb.toString();
  }
}