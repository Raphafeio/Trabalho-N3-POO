public class ESTOQUE extends SQLClass {
    @Key
    int id;
    int produto_id;
    int filial_id;
    double quantidade;

    Estoque(){
        this.setTableName("ESTOQUE");
    }
}