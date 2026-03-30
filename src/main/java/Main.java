import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList<Carro> listaDeCarro = new ArrayList<>();
        Carro carro1 = new Carro();
        carro1.setMarca("corola");
        carro1.setModelo("GR-Sport");
        carro1.setAno(2020);
        carro1.exibir();

        Carro carro2 = new Carro();
        carro2.setMarca("Mercedes-Benz");
        carro2.setModelo("Classe G ");
        carro2.setAno(2030);
        carro2.exibir();
    }
}

