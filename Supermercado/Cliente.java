public class Cliente extends SQLClass {
    int id;
    String nome;
    String descricao;
    int quantidade;
    double preco;

    Cliente() {
        this.setTableName("CLIENTE");
    }
}