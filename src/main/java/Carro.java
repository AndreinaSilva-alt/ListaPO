public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    public static int totalCarros = 0; //atributo estático

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        totalCarros++;
    }

    public Carro(){
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;
        totalCarros++;
    }

    public static void imprimirTotal(){
        System.out.println("Imprimir total de carros: " + totalCarros);
    }

    public String getMarca() { //void não retorna nada
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        if (ano < 1886 || ano > 2026) {
            System.out.println("Erro!");
        } else {
            this.ano = ano;
        }
    }


    public void exibir() {
        System.out.println("marca: " + this.getMarca());
        System.out.println("modelo " + this.getModelo());
        System.out.println("ano " +  (this.getAno() == 0 ? "Não informado" : this.getAno()));


    }
}
