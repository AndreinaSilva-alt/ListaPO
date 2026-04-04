package br.com.andreina.estacionamentoo;

import java.util.ArrayList;

public class Estacionamento {
    private ArrayList<Carro> carros;
    public final int MAX_VAGAS = 20;
    public Estacionamento(){
        carros = new ArrayList<>();
    }

    public void entrarCarro(Carro carro){
        if (carros.size() >= MAX_VAGAS){
            System.out.println("Estacionamento lotado!");
        }
        else {
            carros.add(carro);
            System.out.println("Carro entrou");
        }
    }
    public void sairCarro(String placa){
        for (int i = 0; i < carros.size(); i++){
            if (carros.get(i).getPlaca().equals(placa)){
                carros.remove(i);
                System.out.println("Carro saiu");
                return;
            }
        }
        System.out.println("Carro não encontrado");
    }
    public void vagasOcupadas(){
    System.out.println("Vagas ocupadas: " + carros.size());
}
    public void vagasLivres(){
    System.out.println("Vagas livres " + (MAX_VAGAS - carros.size()));
    }

}
