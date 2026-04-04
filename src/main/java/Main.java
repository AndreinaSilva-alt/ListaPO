import java.util.ArrayList;
public class Main {

        public static void main(String[] args) {
            Carro meuCarro = new Carro("VW", "Gol", 2015);
            trocarModelo(meuCarro);
            System.out.println(meuCarro.getModelo());
        }

    public static void trocarModelo(Carro c) {
        c.setModelo("Fusca");
    }
}

//o nome FUSCA é impresso.

//Afetou o objeto original pois dentro do parâmetro está sendo passado o endereço de memória do objeto.
//O parâmetro c aponta exatamente para o mesmo endereço de memória no Heap onde o objeto meuCarro está armazenado.
