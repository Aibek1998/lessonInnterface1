public class Cupcake implements Baced{
    int price;

    public Cupcake(int price) {
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
        System.out.println("cook with sugar");

    }

    @Override
    public String toString() {
        return "Cupcake : " +"\n"+
                "price : " + price;
    }
}
