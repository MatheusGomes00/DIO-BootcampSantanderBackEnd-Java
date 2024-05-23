package src.com.pilaresPOO.interfaces.pack1;

public class Repository {
    public static void main(String[] args) {
        SQLDataStore mysql = new SQLDataStore();
        NoSQLDataStore mongodb = new NoSQLDataStore();
        FileDataStore arquivox = new FileDataStore();

        mysql.save();
        mongodb.find();
        arquivox.update();

        DataStore exemplo = new SQLDataStore();
        exemplo.delete();
    }
}
