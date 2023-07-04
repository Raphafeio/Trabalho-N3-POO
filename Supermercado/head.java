public class head {
    public static void main(String[] args){

        Cliente produto1 = new Cliente();

        boolean retorno = Database.abrirID(produto1,2);
        System.out.println(produto1.nome + " " + produto1.descricao + " " + produto1.quantidade + " " + produto1.preco);
    }
}