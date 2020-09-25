import java.math.BigDecimal;

public class Purchase {
    private Laptop laptop;
    private Car car;
    private Coffee coffee;

    public Purchase(PurchaseBuilder purchaseBuilder) {
        laptop = purchaseBuilder.getLaptop();
        car = purchaseBuilder.getCar();
        coffee = purchaseBuilder.getCoffee();
    }

    public void checkOut(BankAccount bankAccount) {
        if(bankAccount.canAfford(this)) {
            System.out.println("Success");
        } else {
            System.out.println("Not enough money");
        }
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "laptop=" + laptop +
                ", car=" + car +
                ", coffee=" + coffee +
                '}';
    }

    public BigDecimal getTotalCost() {
        return laptop.getPrice().add(car.getPrice()).add(coffee.getPrice());
    }
}
