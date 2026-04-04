package br.com.andreina.academiaa;

public class Aluno {
    private String nome;
    private int idade;
    private String plano;
    public Aluno(String nome, int idade, String plano){
        this.nome = nome;
        setIdade(idade);
        this.plano = plano;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getPlano(){
        return plano;
    }

    public void setIdade(int idade){
        if (idade >= 14){
            this.idade = idade;
        }

        else{
            System.out.println("Idade invalida. A idade minima é 14 anos.");
            this.idade = 0;
        }
    }
}
