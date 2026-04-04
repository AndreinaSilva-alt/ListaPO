package br.com.andreina.locadoraa;

public class Filme {

    private String titulo;
    private String genero;
    private int ano;

    // constante
    public final int ANO_MINIMO = 1895;

    public Filme(String titulo, String genero, int ano){
        this.titulo = titulo;
        this.genero = genero;
        setAno(ano);
    }

    public String getTitulo(){
        return titulo;
    }

    public String getGenero(){
        return genero;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        if (ano >= ANO_MINIMO && ano <= 2026){
            this.ano = ano;
        } else {
            System.out.println("Ano invalido.");
            this.ano = ANO_MINIMO;
        }
    }

    // método que retorna
    public String tipoFilme(){
        if (ano < 2000){
            return "Classico";
        } else {
            return "Recente";
        }
    }
}