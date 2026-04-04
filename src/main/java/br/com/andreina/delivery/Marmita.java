package br.com.andreina.delivery;

public class Marmita {
    private String descricao;
    private String tamanho;

    public static final double PRECO_P = 18.00;
    public static final double PRECO_M = 25.00;
    public static final double PRECO_G = 32.00;

    public Marmita(String descricao, String tamanho){
        this.descricao = descricao;
        this.tamanho = tamanho;
    }

    public String getDescricao(){
        return descricao;
    }

    public String getTamanho(){
        return tamanho;
    }

    public double getPreco(){
        if (tamanho.equalsIgnoreCase("P")){
            return PRECO_P;
        }
        else if (tamanho.equalsIgnoreCase("m")){
            return PRECO_M;
        }
        else if (tamanho.equalsIgnoreCase("g")){
            return PRECO_G;

        }

        else {
            return 0;
        }
    }


}
