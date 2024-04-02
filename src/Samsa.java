public class Samsa implements Baced{
    int price ;

    public Samsa(int price) {
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
        System.out.println("cook with meat");

    }

    @Override
    public String toString() {
        return "Samsa : "+"\n"+"price : " + price ;
    }
}
