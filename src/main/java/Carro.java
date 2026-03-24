public class Carro {
    String marca;
    String modelo;
    int ano;

    public int idadeDoCarro(){
        return 2026 - ano;
    }
    public void exibir() {
        System.out.println("marca: " + this.marca);
        System.out.println("modelo " + this.modelo);
        System.out.println("ano " +  this.ano);
        System.out.println("A idade do carro é " + idadeDoCarro());
    }
}
