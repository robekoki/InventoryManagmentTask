public class Proxy {
    private Purchase purchase;

    public Proxy(Purchase purchase) {
       this.purchase = purchase;
    }

    public boolean enterPassword(String password) {
        return "123".equals(password);
    }

   public void checkOut(String pass) {
        if(enterPassword(pass)) {
            purchase.checkOut();
        } else {
            System.out.println("Wrong password");
        }
   }

}
