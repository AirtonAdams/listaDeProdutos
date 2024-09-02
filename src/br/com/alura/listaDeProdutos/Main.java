package br.com.alura.listaDeProdutos;
import java.util.ArrayList;

import br.com.alura.listaDeProdutos.modelos.Perecivel;
import br.com.alura.listaDeProdutos.modelos.Produto;

public class Main {
    public static void main(String[] args) throws Exception {
        Produto produto1 = new Produto("Vassoura", 11, 1);
        Produto produto2 = new Produto("sacola", 0.10, 123);
        Produto produto3 = new Produto("Copo", 12.50, 20);
        Perecivel perecivel1 = new Perecivel("Arroz", 19, 2.536, 30);
        Perecivel perecivel2 = new Perecivel("Feijão", 12.50, 3.467, 20);
        Perecivel perecivel3 = new Perecivel("Carne", 32, 1.246, 7);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println(listaDeProdutos);
        System.out.println("Produto na posição 0: " + listaDeProdutos.get(0));

        ArrayList<Perecivel> listaDePereciveis = new ArrayList<>();
        listaDePereciveis.add(perecivel1);
        listaDePereciveis.add(perecivel2);
        listaDePereciveis.add(perecivel3);

        System.out.println(listaDePereciveis);
        System.out.println("Perecivel na posição 0: " + listaDePereciveis.get(0));
    }
}
