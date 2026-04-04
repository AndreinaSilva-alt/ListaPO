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

    /*
O programa utiliza um menu com do-while para continuar executando até o usuário escolher sair.

O Scanner é utilizado para capturar os dados digitados pelo usuário no teclado.

Na opção 1, o sistema solicita a placa e o modelo do carro, cria um objeto Carro e registra a entrada no estacionamento.

Na opção 2, o usuário informa a placa do veículo e o sistema realiza a remoção do carro da lista.

Na opção 3, o sistema mostra a quantidade de vagas ocupadas utilizando o tamanho da lista de carros.

Na opção 4, o sistema calcula e exibe as vagas livres com base no limite máximo definido na classe Estacionamento.

O nextLine após o nextInt é utilizado para limpar o buffer e evitar erros na leitura de dados.

A classe Main controla o fluxo do sistema, enquanto a classe Estacionamento gerencia os veículos cadastrados.
*/

}
