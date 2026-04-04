package br.com.andreina.academiaa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Academia academia = new Academia();
        int opcao;

        do {
            System.out.println("ACADEMIA");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Mostrar total de alunos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do aluno: ");
                    String nome = sc.nextLine();

                    System.out.print("Idade do aluno: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Plano (mensal ou anual): ");
                    String plano = sc.nextLine();

                    Aluno aluno = new Aluno(nome, idade, plano);
                    academia.cadastrarAluno(aluno);
                    break;

                case 2:
                    academia.listarAlunos();
                    break;

                case 3:
                    Academia.mostrarTotalAlunos();
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
O programa utiliza um menu com do-while para continuar rodando até o usuário escolher sair.

O Scanner é usado para ler os dados digitados pelo usuário no teclado.

O switch é responsável por decidir qual ação executar com base na opção escolhida.

Na opção 1, o sistema coleta os dados do aluno e cria um objeto Aluno, que é enviado para a classe Academia cadastrar.

Na opção 2, o sistema lista todos os alunos armazenados dentro do ArrayList da classe Academia.

Na opção 3, é utilizado um método static para mostrar o total de alunos cadastrados no sistema.

O nextLine após o nextInt é usado para limpar o buffer e evitar erros de leitura.

O sistema segue o conceito de orientação a objetos, onde a Main controla o fluxo e a classe Academia gerencia os dados.
*/

//A classe Main controla o menu principal do sistema da academia.