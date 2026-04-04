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

/*
O programa utiliza um menu com do-while para continuar executando até o usuário escolher sair.

O Scanner é utilizado para capturar os dados digitados pelo usuário no teclado.

Na opção 1, o sistema solicita título, gênero e ano do filme, cria um objeto Filme e o cadastra na locadora.

Na opção 2, o sistema lista todos os filmes armazenados no ArrayList da classe Locadora.

Na opção 3, é exibido o total de filmes cadastrados utilizando um atributo static da classe Locadora.

O nextLine após o nextInt é utilizado para limpar o buffer e evitar problemas na leitura de dados.

O sistema utiliza validação no ano do filme dentro da classe Filme, garantindo valores entre 1895 e 2026.

A classe Main controla o fluxo do sistema, enquanto as classes Filme e Locadora organizam os dados seguindo o conceito de orientação a objetos.
*/