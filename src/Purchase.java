public class Purchase {
    private Laptop laptop;
    private Car car;
    private Coffee coffee;

    public Purchase(PurchaseBuilder purchaseBuilder) {
        laptop = purchaseBuilder.getLaptop();
        car = purchaseBuilder.getCar();
        coffee = purchaseBuilder.getCoffee();
    }

    public void checkOut() {
        System.out.println("Purchase sold");
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "laptop=" + laptop +
                ", car=" + car +
                ", coffee=" + coffee +
                '}';
    }
}
