public class Upgrade {
    public static void main(String[] args) {

        Cliente produto1 = new Cliente();

        produto1.id = 2;
        produto1.nome = "Alterado";
        produto1.descricao = "Alterado";
        produto1.quantidade = 5;
        produto1.preco = 0;

        boolean retorno = Database.atualizarRegistro(produto1);
        System.out.println(retorno);
    }
}