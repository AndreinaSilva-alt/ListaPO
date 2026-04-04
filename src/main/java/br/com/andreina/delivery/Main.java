package br.com.andreina.delivery;
import java.util.ArrayList;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            ArrayList<Pedido> pedidos = new ArrayList<>();

            int opcao;

            do{
                System.out.println("DELIVERY DA CAMILA");
                System.out.println("1 - Novo pedido");
                System.out.println("2 - Listar pedidos");
                System.out.println("3 - Total de pedidos");
                System.out.println("4 - Total vendido");
                System.out.println("0 - Sair");
                System.out.print("Opcao: ");
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao){

                    case 1:
                        System.out.print("Nome do cliente: ");
                        String nome = sc.nextLine();

                        Pedido pedido = new Pedido(nome);

                        int escolha;
                        do{
                            System.out.println("Escolha o tamanho:");
                            System.out.println("1 - P");
                            System.out.println("2 - M");
                            System.out.println("3 - G");
                            System.out.println("0 - Finalizar");

                            escolha = sc.nextInt();
                            sc.nextLine();

                            if (escolha != 0){
                                System.out.print("Descricao: ");
                                String desc = sc.nextLine();

                                String tamanho = "";

                                if (escolha == 1) tamanho = "P";
                                else if (escolha == 2) tamanho = "M";
                                else tamanho = "G";

                                Marmita m = new Marmita(desc, tamanho);
                                pedido.adicionarMarmita(m);
                            }

                        } while (escolha != 0);

                        pedidos.add(pedido);
                        break;

                    case 2:
                        for (int i = 0; i < pedidos.size(); i++){
                            pedidos.get(i).exibirPedido();
                        }
                        break;

                    case 3:
                        System.out.println("Total de pedidos: " + Pedido.totalPedidos);
                        break;

                    case 4:
                        double total = 0;

                        for (int i = 0; i < pedidos.size(); i++){
                            total += pedidos.get(i).calcularTotal();
                        }

                        System.out.println("Total vendido: R$ " + total);
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
O programa utiliza um menu com do-while para continuar executando até o usuário escolher a opção 0.

Foi utilizado ArrayList para armazenar todos os pedidos realizados no dia.

Na opção 1, o sistema lê o nome do cliente, cria um novo pedido e permite adicionar uma ou mais marmitas até finalizar.

O tamanho da marmita é escolhido por número e depois convertido para P, M ou G.

Cada marmita criada é adicionada ao pedido por meio do método adicionarMarmita.

Na opção 2, o sistema percorre a lista de pedidos e exibe todos os pedidos cadastrados.

Na opção 3, é mostrado o total de pedidos usando o atributo static da classe Pedido.

Na opção 4, o sistema percorre todos os pedidos, soma o valor total de cada um e mostra o total vendido no dia.

O nextLine após o nextInt é usado para limpar o buffer do teclado e evitar problemas na leitura de texto.

*/
//A classe Main controla o fluxo do sistema, enquanto as classes Pedido e Marmita organizam os dados de forma orientada a objetos.
