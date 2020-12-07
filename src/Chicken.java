public class Chicken extends Toppings{
    private Pizza pizza;

    public Chicken(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Add Topping Chicken, Price: Rp. 5.000 \n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 5000;
    }
}
