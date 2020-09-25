
import java.math.BigDecimal;

public class BankAccount {
    private BigDecimal money;

    public BankAccount(BigDecimal money) {
        this.money = money;
    }

    public boolean canAfford(Purchase purchase) {
        return purchase.getTotalCost().compareTo(money) < 0;
    }
}
