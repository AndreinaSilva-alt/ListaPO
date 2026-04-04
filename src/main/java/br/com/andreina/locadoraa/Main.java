package br.com.andreina.locadoraa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locadora locadora = new Locadora();
        int opcao;

        do{
            System.out.println("LOCADORA DO MARCÃO");
            System.out.println("1 - Cadastrar filme");
            System.out.println("2 - Listar filmes");
            System.out.println("3 - Total de filmes");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){

                case 1:
                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();

                    System.out.print("Genero: ");
                    String genero = sc.nextLine();

                    System.out.print("Ano: ");
                    int ano = sc.nextInt();
                    sc.nextLine();

                    Filme filme = new Filme(titulo, genero, ano);
                    locadora.cadastrarFilme(filme);
                    break;

                case 2:
                    locadora.listarFilmes();
                    break;

                case 3:
                    Locadora.mostrarTotalFilmes();
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}