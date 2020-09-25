import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Database extends HashSet<Item> {

    private static Database dbCon;
    private List<Observer> observers;

    private Database() {
        observers = new LinkedList<>();
    }

    public static Database getDbCon() {
        if (dbCon == null) {
            dbCon = new Database();
        }
        return dbCon;
    }

    @Override
    public boolean add(Item item) {
        if (dbCon.contains(item)) {
            Item itemFromDb = dbCon.getItem(item);
            item.setCountInStorage(itemFromDb.getCountInStorage() + item.getCountInStorage());
        }
        observers.forEach(x -> x.onNewItem(item));
        return super.add(item);
    }

    private Item getItem(Item item) {
        return (Item) dbCon.stream().filter((x) -> x.equals(item));
    }

    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

}
