package src.com.pilaresPOO.interfaces.pack1;

public class SQLDataStore implements DataStore{
    @Override
    public void save() {
        System.out.println("Salvando no banco SQL");
    }

    @Override
    public void delete() {
        System.out.println("Removendo registo no banco SQL");
    }

    @Override
    public void update() {
        System.out.println("Atualizando registo no banco SQL");
    }

    @Override
    public void find() {
        System.out.println("Realizando busca no banco SQLx");
    }
}
