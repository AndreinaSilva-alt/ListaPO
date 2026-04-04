public class Registro {
    public static void main(String[] args){
        Cliente c1 = new Cliente("Avylla", "avylla@gmail.com", "999222555");
        Cliente c2 = new Cliente("Moziel", "moziel@gmail.com");
        Cliente c3 = new Cliente("Escanor");

        c1.exibir();
        c2.exibir();
        c3.exibir();

        System.out.println("----------------------------------------------");
        System.out.println("Total de clientes: " + Cliente.totalCliente);
    }
}
