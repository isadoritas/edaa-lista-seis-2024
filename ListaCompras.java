import java.util.List;

public class ListaCompras implements ListaInterface {

  private List<Item> lista;

  public ListaCompras(List<Item> lista) {
    this.lista = lista;
  }

  public void adicionar(Item item) {
    this.lista.add(item);
  }

  public void remover(Item item) {
    this.lista.remove(item);
  }

  public String exibirListaCompleta(){
    StringBuilder sb = new StringBuilder();
    for (Item item : lista) {
      sb.append("Item: ").append(item.getNome()).append(" Preço: ").append(item.getPreco()).append("\n");
    }
    System.out.println(sb);
    return sb.toString();
  }


  
}