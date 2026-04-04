public class Cliente {
        private String nome;
        private String email;
        private String telefone;
        public static int totalCliente;

        public Cliente(String nome, String email, String tele){
            this.nome = nome;
            this.email = email;
            this.telefone = tele;
            totalCliente++;
        }

        public Cliente(String nome, String email){
            this.nome = nome;
            this.email = email;
            this.telefone = "Desconhecido";
            totalCliente++;
        }

        public Cliente(String nome){
            this.nome = nome;
            this.email = "Desconhecido";
            this.telefone = "Desconhecido";
            totalCliente++;
        }

        public String getNome() {
            return nome;
        }

        public String getEmail() {
            return email;
        }

        public String getTelefone() {
            return telefone;
        }

        public void exibir(){
            System.out.println("Nome: " + this.getNome());
            System.out.println("Email: " + this.getEmail());
            System.out.println("Telefone: " + this.getTelefone());
        }
    }

