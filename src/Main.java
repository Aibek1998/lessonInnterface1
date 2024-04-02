public class Main {
    public static void main(String[] args) {
        Bread bread = new Bread(25);
        System.out.println(bread.toString());
        bread.howToUse();
        System.out.println();
        Samsa samsa = new Samsa(100);
        System.out.println(samsa.toString());
        samsa.howToUse();
        System.out.println();
        Pizza pizza = new Pizza(400);
        System.out.println(pizza.toString());
        pizza.howToUse();
        System.out.println();
        Cupcake cupcake = new Cupcake(50);
        System.out.println(cupcake.toString());
        cupcake.howToUse();


    }
}