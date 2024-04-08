import java.util.ArrayList;
import java.util.List;

public class Programa {

  public static void main(String[] args) {
    List<Animal> listaAnimais = new ArrayList<>();
    listaAnimais.add(new Animal("Jacaré"));
    listaAnimais.add(new Animal("Leão"));
    listaAnimais.add(new Animal("Girafa"));
    listaAnimais.add(new Animal("Elefante"));
    listaAnimais.add(new Animal("Zebra"));
    listaAnimais.add(new Animal("Cachorro"));
    listaAnimais.add(new Animal("Gato"));
    listaAnimais.add(new Animal("Cobra"));
    listaAnimais.add(new Animal("Morcego"));

    List<Pais> listaPaises = new ArrayList<>();
    listaPaises.add(new Pais("Brasil"));
    listaPaises.add(new Pais("Argentina"));
    listaPaises.add(new Pais("Chile"));
    listaPaises.add(new Pais("Uruguai"));
    listaPaises.add(new Pais("Portugal"));
    listaPaises.add(new Pais("Bolívia"));
    listaPaises.add(new Pais("China"));
    listaPaises.add(new Pais("Estados Unidos"));
    listaPaises.add(new Pais("França"));
    listaPaises.add(new Pais("Japão"));
    listaPaises.add(new Pais("Coréia"));

    List<Pessoa> pessoas = new ArrayList<>();
    pessoas.add(new Pessoa("João", 25));
    pessoas.add(new Pessoa("Maria", 30));
    pessoas.add(new Pessoa("Pedro", 20));
    pessoas.add(new Pessoa("Ana", 22));
    pessoas.add(new Pessoa("Daniel", 31));
    pessoas.add(new Pessoa("Lucas", 18));

    Item macarrao = new Item("Macarrão", 10);
    Item feijao = new Item("Feijão", 15);
    Item arroz = new Item("Arroz", 20);
    Item frango = new Item("Frango", 25);

    List<Item> listaDeItens = new ArrayList<>();
    ListaCompras minhaLista = new ListaCompras(listaDeItens);

    minhaLista.adicionar(macarrao);
    minhaLista.adicionar(feijao);
    minhaLista.adicionar(arroz);
    minhaLista.adicionar(frango);
    minhaLista.remover(frango);

    System.out.println(" EXERCÍCIO 1 ----------------------");

    Contato eu = new Contato("Eu", 986905153);
    eu.adicionar("Gabriel", 986508652);
    eu.adicionar("São Gonçalo", 986508654);
    eu.adicionar("Henrique", 986508657);
    eu.adicionar("Pedro", 986508651);
    eu.adicionar("Weslley", 986508658);

    eu.buscar("Gabriel");
    eu.listar();




    ListaCompras lista1 = new ListaCompras(listaDeItens);

    System.out.println(" EXERCÍCIO 2 ----------------------");
    
    lista1.exibirListaCompleta();

    listaAnimais.sort((Animal animal1, Animal animal2) -> animal1.getNome().compareTo(animal2.getNome()));
    listaPaises.sort((Pais pais1, Pais pais2) -> pais1.getNome().compareTo(pais2.getNome()));
    pessoas.sort((Pessoa pessoa1, Pessoa pessoa2) -> Integer.valueOf(pessoa1.getIdade()).compareTo(Integer.valueOf(pessoa2.getIdade())));

    System.out.println(" EXERCÍCIO 3 ----------------------");
    listaAnimais.forEach(n -> System.out.println(n.nome));
    System.out.println(" EXERCÍCIO 4 ----------------------");
    listaPaises.forEach(n -> System.out.println(n.nome));
    System.out.println(" EXERCÍCIO 5 ----------------------");
    pessoas.forEach(n -> System.out.println(String.format("Pessoa{nome= %s, idade= %d}", n.getNome(), n.getIdade())));

  }

}