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

