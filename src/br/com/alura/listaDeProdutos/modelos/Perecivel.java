package br.com.alura.listaDeProdutos.modelos;

public class Perecivel extends Produto {
  private int validade;

  public Perecivel(String nome, double preco, double quantidade, int validade) {
    super(nome, preco, quantidade);
    this.validade = validade;
  }

  @Override
  public String toString() {
    return String.format("Perecivel [nome= %s, Preco= %.2f, Quantidade= %.3f, Validade= %d dias]\n", getNome(), getPreco(), getQuantidade(), validade);
  }
}
