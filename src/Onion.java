public class Onion extends Toppings{
    private Pizza pizza;

    public Onion(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Add Topping Onion, Price: Rp. 3.000 \n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 3000;
    }
}
