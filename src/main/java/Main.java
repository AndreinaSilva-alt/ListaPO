import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList<Carro> listaDeCarro = new ArrayList<>();
        Carro carro1 = new Carro();
        carro1.marca = "toyota";
        carro1.modelo = "corolla";
        carro1.ano = 2020;
        listaDeCarro.add(carro1);


        Carro carro2 = new Carro();
        carro2.marca = "BMW";
        carro2.modelo = "Range Rover";
        carro2.ano = 2015;
        listaDeCarro.add(carro2);

        System.out.println("--- LISTA DE CARRO ---");
        for (Carro c : listaDeCarro){
            c.exibir();
        }

    }
}

