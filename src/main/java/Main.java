import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList<Carro> listaDeCarro = new ArrayList<>();
        Carro carro1 = new Carro("mercedes","classe G", 2015);
        carro1.exibir();


        Carro carro2 = new Carro("corola", "GR-Sport", 2020);
        carro2.exibir();

    }
}

