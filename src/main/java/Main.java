import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Carro carro1 = new Carro("mercedes","classe G", 2015);
        Carro carro2 = new Carro();
        Carro Carro3 = new Carro("Chevrolet", "Impala", 1967);
        Carro Carro4 = new Carro();
        Carro Carro5 = new Carro("Dodge", "Ram 2500",2024);
        System.out.println("-----------------------");
        Carro.imprimirTotal();
    }
}

