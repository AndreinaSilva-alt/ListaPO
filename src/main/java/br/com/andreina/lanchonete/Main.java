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



/*
    O programa utiliza um menu com do-while para continuar executando até o usuário escolher sair.

    O Scanner é utilizado para capturar os dados digitados pelo usuário no teclado.

    Foi utilizado ArrayList para armazenar os lanches do cardápio, permitindo adicionar vários itens dinamicamente.

    Na opção 1, o sistema cadastra um novo lanche com nome e preço, validando posteriormente na classe Lanche.

    Na opção 2, o sistema lista todos os lanches cadastrados no cardápio.

    Na opção 3, o sistema permite montar um pedido escolhendo vários lanches, utilizando uma repetição até finalizar.

    Cada lanche escolhido é adicionado ao pedido através do método adicionarLanche da classe Pedido.

    Na opção 4, é exibido o total de pedidos utilizando um atributo static da classe Pedido.

    O nextLine após o nextInt é utilizado para limpar o buffer e evitar problemas na leitura de dados.

    A classe Main controla o fluxo do sistema, enquanto as classes Lanche e Pedido organizam os dados seguindo o conceito de orientação a objetos.
     */
