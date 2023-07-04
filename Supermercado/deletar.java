public class Deletar {
    public static void main(String[] args) {

        Cliente produto1 = new Cliente();

        produto1.id = 2;

        boolean retorno = Database.deletarRegistro(produto1);
        System.out.println(retorno);
    }
}