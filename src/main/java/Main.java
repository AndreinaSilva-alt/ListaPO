import java.util.ArrayList;
public class Main {

        public static void main(String[] args){
            //public static void main(String[] args) {
            //if (true) {
            //int x = 10;
            //}
            //System.out.println(x);
            //}
            //o código não é compilado, pois o compilador diz que não há um simbolo encontrado.

            int x = 0;
            if (true){
                x = 10;
            }
            System.out.println(x);
        }
    }
// O escopo é a região do código onde uma variável é "visível" e pode ser acessada.
// No caso do Java, o escopo é delimitado por chaves {}.

//A variável x não existia fora do if, pois como ela está dentro das chaves, ela vira uma variável local daquele bloco.




