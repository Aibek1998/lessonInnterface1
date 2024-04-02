public class Pizza implements Baced {
    int price;

    public Pizza(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void howToUse() {
        System.out.println("cook with sausage");

    }

    @Override
    public String toString() {
        return "Pizza : " +"\n"+
                "price : " + price ;
    }
}
