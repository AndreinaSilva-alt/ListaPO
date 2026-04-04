package br.com.andreina.estacionamentoo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Estacionamento est = new Estacionamento();
        int opcao;

        do{
            System.out.println("ESTACIONAMENTO DO CARLÃO");
            System.out.println("1 - Entrada de carro");
            System.out.println("2 - Saida de carro");
            System.out.println("3 - Vagas ocupadas");
            System.out.println("4 - Vagas livre");
            System.out.println("0 - Sair");
            System.out.println("Selecione uma opção");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Placa: ");
                    String placa = sc.nextLine();
                    System.out.println("Modelo: ");
                    String modelo = sc.nextLine();
                    Carro c = new Carro(placa, modelo);
                    est.entrarCarro(c);
                    break;

                case 2:
                    System.out.println("Placa para remover: ");
                    String placaSaida = sc.nextLine();
                    est.sairCarro(placaSaida);
                    break;

                case 3:
                    est.vagasOcupadas();
                    break;

                case 4:
                     est.vagasLivres();
                     break;

                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção invalida");
            }

        }
         while (opcao != 0);
         sc.close();
    }

}
