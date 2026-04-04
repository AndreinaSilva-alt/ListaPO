package br.com.andreina.locadoraa;

import java.util.ArrayList;

public class Locadora {

    private ArrayList<Filme> filmes;
    public static int totalFilmes = 0;

    public Locadora() {
        filmes = new ArrayList<>();
    }

    public void cadastrarFilme(Filme filme) {
        filmes.add(filme);
        totalFilmes++;
        System.out.println("Filme cadastrado com sucesso.");
    }

    public void listarFilmes() {
        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme cadastrado.");
        } else {
            for (int i = 0; i < filmes.size(); i++) {
                System.out.println("Titulo: " + filmes.get(i).getTitulo());
                System.out.println("Genero: " + filmes.get(i).getGenero());
                System.out.println("Ano: " + filmes.get(i).getAno());
                System.out.println("Tipo: " + filmes.get(i).tipoFilme());
                System.out.println("----------------------");
            }
        }
    }

    public static void mostrarTotalFilmes() {
        System.out.println("Total de filmes: " + totalFilmes);
    }
}