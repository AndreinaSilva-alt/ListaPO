public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro(){
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;
    }

    public String getMarca() { //void não retorna nada
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
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
