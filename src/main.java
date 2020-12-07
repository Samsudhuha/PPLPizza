public class main {
    public static void main(String[] args){
        Pizza pizza = new PizzaBase();

        pizza = new Chicken(pizza);
        pizza = new Tuna(pizza);
        pizza = new Ham(pizza);

        System.out.println("Pizza Orders :\n" + pizza.getDescription());
        System.out.println("Total Price : Rp. " + pizza.getPrice());
    }
}
