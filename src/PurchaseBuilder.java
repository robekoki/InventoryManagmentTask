public class PurchaseBuilder {
    private Laptop laptop;
    private Car car;
    private Coffee coffee;

    public PurchaseBuilder addLaptop(Laptop laptop){
        this.laptop = laptop;
        return this;
    }

    public PurchaseBuilder addCar(Car car) {
        this.car = car;
        return this;
    }

    public PurchaseBuilder addCoffee(Coffee coffee) {
        this.coffee = coffee;
        return this;
    }

    public PurchaseBuilder build() {
        return this;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public Car getCar() {
        return car;
    }

    public Coffee getCoffee() {
        return coffee;
    }
}
