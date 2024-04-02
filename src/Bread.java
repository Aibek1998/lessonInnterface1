public class Bread implements Baced{
    int price ;

    public Bread(int price) {
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
        System.out.println("Cook on tandyr");

    }

    @Override
    public String toString() {
        return "Bread : "+"\n"+"price : " + price ;
    }
}
