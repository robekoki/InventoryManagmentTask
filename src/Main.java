import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Database conn = Database.getDbCon();
        conn.add(new Item("Laptop", BigDecimal.valueOf(999.99), 10));
        conn.attachObserver(new StorageWorker());
        conn.add(new Item("Car", BigDecimal.valueOf(27000), 4));
    }
}
