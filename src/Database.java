import java.util.HashSet;
import java.util.LinkedList;

public class Database extends HashSet<Item> {

    private static Database dbCon;

    private Database() {

    }

    public Database getDbCon() {
        if (dbCon != null) {
            dbCon = new Database();
        }
        return dbCon;
    }
}
