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
            Carro c1 = new Carro("Toyota", "Corola", 2019);
            Carro c2 = c1;
            c2.setModelo("GR-Sport");
            System.out.println(c1.getModelo());
            System.out.println(c2.getModelo());

        }

    }
// o modelo de c1 e c2 é GR-Sport.
// o c2 mudou o c1 como ali não tem um objeto e sim seu endereço de memoria, o Carro c2 não foi criado, mas sim o C2
// copiou o endereço de c1 e agora eles compartilham
//como agora os dois apotam para o mesmo objeto o c2 consegue mudar o c1
// no exercicio 11 usando int o valor era guardado na STACK, assim fazendo uma cópia do valor, alterar um não afeta o outro,
//pois são idependentes após a cópia.
//no exercicio 12 que usa o tipo de referência, o objeto é armazenado no Heap e a Stack guarda só o endereço,
//então quando se faz a cópia, ambos vão olhar para o mesmo lugar no Heap, e por conta disso, eles são dependentes.
