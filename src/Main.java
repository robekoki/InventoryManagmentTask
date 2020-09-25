import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Database conn = Database.getDbCon();
        conn.add(new Item("Car", BigDecimal.valueOf(9099.99), 10));
        conn.attachObserver(new StorageWorker());
        conn.add(new Laptop("Laptop", BigDecimal.valueOf(2700), 4));
        Car car = new Car("Car", BigDecimal.valueOf(9099.99), 1);
        Laptop laptop = new Laptop("Laptop", BigDecimal.valueOf(2700), 1);
        Coffee coffee = new Coffee("Coffee", BigDecimal.valueOf(2), 1);
        Purchase purchase = new Purchase(new PurchaseBuilder().addCar(car).addCoffee(coffee).addLaptop(laptop));
        System.out.println(purchase);
    }
}
