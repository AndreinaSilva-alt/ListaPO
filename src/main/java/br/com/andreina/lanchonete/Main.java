    package br.com.andreina.lanchonete;

    import java.util.ArrayList;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            ArrayList<Lanche> cardapio = new ArrayList<>();
            int opcao;


            do{
                 System.out.println(" LANCHONETE DO SEU JORGE ");
                 System.out.println("1- Cadastrar lanche ");
                 System.out.println("2- Listar cardapio ");
                 System.out.println("3- Fazer pedido");
                 System.out.println("4- Mostrar total de pedidos");
                 System.out.println("0- Sair");
                 System.out.println("Escolha uma opcao: ");
                 opcao = sc.nextInt();
                 sc.nextLine();

                 switch (opcao) {
                     case 1:
                         System.out.println("Digite o nome do lanche: ");
                         String nome = sc.nextLine();

                         System.out.println("Digite o preco do lanche: ");
                         double preco = sc.nextDouble();
                         sc.nextLine();

                         Lanche novoLanche = new Lanche(nome, preco);
                         cardapio.add(novoLanche);

                         System.out.println("Lanche cadastrado com sucesso.");
                         break;

                     case 2:

                         if (cardapio.isEmpty()) {
                             System.out.println("O cardapio esta vazio.");
                         } else {
                             System.out.println("CARDAPIO");
                             for (int i = 0; i < cardapio.size(); i++)
                                 System.out.println((i + 1) + " - " + cardapio.get(i).getNome() + " R$ " + cardapio.get(i).getPreco());
                         }

                         break;

                     case 3:
                         if (cardapio.isEmpty()) {
                             System.out.println("Cadastre lanches primeiro. ");
                         } else {
                             Pedido pedido = new Pedido();
                             int escolha;

                             do {
                                 System.out.println("Escolha os lanches do pedido: ");
                                 for (int i = 0; i < cardapio.size(); i++) {
                                     System.out.println((i + 1) + " - " + cardapio.get(i).getNome() + " R$ " + cardapio.get(i).getPreco())
                                     ;

                                 }

                                 System.out.println("0- Finalizar pedido");
                                 System.out.println("Digite a opcao: ");
                                 escolha = sc.nextInt();

                                 if (escolha > 0 && escolha <= cardapio.size()) {
                                     pedido.adicionarLanche(cardapio.get(escolha - 1));
                                     System.out.println("Lanche adicionado");
                                 } else if (escolha != 0) {
                                     System.out.println("Opcao invalida");
                                 }
                             }
                             while (escolha != 0);
                             pedido.exibirPedidos();

                         }
                         break;

                         case 4:
                                 Pedido.mostrarTotalPedidos();
                                 break;
                             case 0:
                                 System.out.println("Sistema encerrado.");
                                 break;

                             default:
                                 System.out.println("Opcao invalida.");
                         }

                     }
             while (opcao != 0);
             sc.close();
             }

                     }



