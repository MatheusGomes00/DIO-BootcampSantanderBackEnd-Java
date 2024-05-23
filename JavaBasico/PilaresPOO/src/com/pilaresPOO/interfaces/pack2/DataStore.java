package src.com.pilaresPOO.interfaces.pack2;

public class DataStore implements SQLDataStore, NoSQLDataStore, FileDataStore{

    @Override
    public void update() {
        System.out.println("Atualizando no Sistema de Arquivos");
    }

    @Override
    public void find() {
        System.out.println("Buscando no banco NoSQL");
    }

    @Override
    public void save() {
        System.out.println("Salvando no banco SQL");
    }

    @Override
    public void delete() {
        System.out.println("Removendo registro no banco SQL");
    }
}
