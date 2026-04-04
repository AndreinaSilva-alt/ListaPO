package br.com.andreina.lanchonete;
import java.util.ArrayList;

public class Pedido {
    private ArrayList<Lanche> lanches;
    public static int totalPedidos = 0;//static para contar pedidos//

    public Pedido() {
        lanches = new ArrayList<>();
        totalPedidos++;
    }

    public void adicionarLanche(Lanche lanche) {
        lanches.add(lanche);
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < lanches.size(); i++) {
            total = total + lanches.get(i).getPreco();
        }
        return total;
    }

    //vai mostrar o pedido
    public void exibirPedidos() {
        System.out.println("Numero de itens do pedido: ");
        for (int i = 0; i < lanches.size(); i++) {
            System.out.println(lanches.get(i).getNome() + " R$ " + lanches.get(i).getPreco());
        }
        System.out.println("Total do pedido: R$ " + calcularTotal());
    }


    public static void mostrarTotalPedidos(){
        System.out.println("Total de pedidos do dia: " + totalPedidos);
    }
}
