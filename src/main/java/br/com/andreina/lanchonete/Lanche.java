package br.com.andreina.lanchonete;

public class Lanche {
    private String nome;
    private double preco;

    public Lanche(String nome, double preco){
        this.nome = nome;
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        if(preco >= 0){
            this.preco = preco;
        }

        else{
            System.out.println("Preco invalido");
            this.preco = 0;
        }
    }

    public void exibirLanche(){
        System.out.println("Nome: " + nome);
        System.out.println("Preco: R$ " + preco);
    }
}
