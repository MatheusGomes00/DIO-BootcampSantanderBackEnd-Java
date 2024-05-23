package src.com.pilaresPOO.interfaces.pack2;

public class Repository {
    public static void main(String[] args) {
        DataStore ds = new DataStore();

        ds.delete();
        ds.find();
        ds.save();
        ds.update();

        NoSQLDataStore nosqlData = ds;
        SQLDataStore sqlData = ds;
        FileDataStore fileData = ds;

        ((NoSQLDataStore) ds).find();
        nosqlData.find();
        sqlData.delete();
        sqlData.save();
        fileData.update();

    }
}
