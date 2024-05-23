package src.com.pilaresPOO.interfaces.pack1;

public class FileDataStore implements DataStore{
    @Override
    public void save() {
        System.out.println("Salvando registro no sistema de arquivos");
    }

    @Override
    public void update() {
        System.out.println("Atualizando registro no sistema de arquivos");
    }

    @Override
    public void delete() {
        System.out.println("Removendo registro no sistema de arquivos");
    }

    @Override
    public void find() {
        System.out.println("Buscando registro no sistema de arquivos");
    }
}
