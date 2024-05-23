package src.com.pilaresPOO.interfaces.pack1;

public class NoSQLDataStore implements DataStore{

    @Override
    public void save() {
        System.out.println("Salvando registro no banco NoSQL");
    }

    @Override
    public void update() {
        System.out.println("Atualizando registro no banco NoSQL");
    }

    @Override
    public void delete() {
        System.out.println("Removendo registro no banco NoSQL");
    }

    @Override
    public void find() {
        System.out.println("Buscando registro no banco NoSQL");
    }
}
