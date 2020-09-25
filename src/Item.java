import java.math.BigDecimal;
import java.util.Objects;

public class Item {
    private String name;
    private BigDecimal price;
    private int countInStorage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getCountInStorage() {
        return countInStorage;
    }

    public void setCountInStorage(int countInStorage) {
        this.countInStorage = countInStorage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return countInStorage == item.countInStorage &&
                Objects.equals(name, item.name) &&
                Objects.equals(price, item.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, countInStorage);
    }
}
