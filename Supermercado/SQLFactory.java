public class SQLFactory {
    public static void main(String[] args){

        Cliente produto1 = new Cliente();

        produto1.id = 2;
        produto1.nome = "Tiago";
        produto1.descricao = "Pao";
        produto1.quantidade = 10;
        produto1.preco = 14.50;

        boolean retorno = Database.inserirRegistro(produto1);
        System.out.println(retorno);
    }
    
}