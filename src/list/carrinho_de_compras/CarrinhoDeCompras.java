package list.carrinho_de_compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemLista;

    public CarrinhoDeCompras() {
        this.itemLista = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome,preco,quantidade);
        this.itemLista.add(item);
    }
    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for (Item item : itemLista){
            if (item.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(item);
            }
        }
        itemLista.removeAll(itemParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        for (Item item : itemLista){
            double valorItem = item.getPreco() * item.getQuant();
            valorTotal += valorItem;
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(this.itemLista);
    }

    @Override
    public String toString() {
        return itemLista.toString();
    }
}
