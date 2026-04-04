package br.com.andreina.academiaa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Academia academia = new Academia();
        int opcao;

        do {
            System.out.println("\nACADEMIA");
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