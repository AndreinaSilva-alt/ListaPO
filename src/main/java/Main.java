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

            int a = 10;
            int b = a;
            b = 99;
            System.out.println("a = " + a);
            System.out.println("b = " + b);

        }

    }
//a ficou valendo 10 e b ficou valendo 99.
//alterar o B não mudou o A pois como são variáveis com memórias diferentes, alterar um não vai mudar a memória do outro.


