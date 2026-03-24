public class Main {
    public static void main(String[] args){
        Carro carro1 = new Carro();
        carro1.marca = "toyota";
        carro1.modelo = "corolla";
        carro1.ano = 2020;
        System.out.println("marca: " + carro1.marca + " modelo: " + carro1.modelo  +" ano: " + carro1.ano );


        Carro carro2 = new Carro();
        carro2.marca = "BMW";
        carro2.modelo = "Range Rover";
        carro2.ano = 2015;
        System.out.println("marca: " + carro2.marca + " modelo: " + carro2.modelo + " ano " + carro2.ano );
    }
}

