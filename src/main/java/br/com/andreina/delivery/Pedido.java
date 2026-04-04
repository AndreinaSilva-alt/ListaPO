package br.com.andreina.delivery;

import java.util.ArrayList;

public class Pedido {

    private String nomeCliente;
    private ArrayList<Marmita> marmitas;

    public static int totalPedidos = 0;

    public Pedido(String nomeCliente){
        this.nomeCliente = nomeCliente;
        marmitas = new ArrayList<>();
        totalPedidos++;
    }

    public void adicionarMarmita(Marmita marmita){
        marmitas.add(marmita);
    }

    public void exibirPedido(){
        System.out.println("Cliente: " + nomeCliente);

        for (int i = 0; i < marmitas.size(); i++){
            System.out.println(
                    marmitas.get(i).getDescricao() + " - " +
                            marmitas.get(i).getTamanho() + " - R$ " +
                            marmitas.get(i).getPreco()
            );
        }


        System.out.println("Total do pedido: R$ " + calcularTotal());
        System.out.println("-----------------------");
    }

    public double calcularTotal(){
        double total = 0;

        for (int i = 0; i < marmitas.size(); i++){
            total += marmitas.get(i).getPreco();
        }

        return total;
    }
}