public class Pepperoni extends Toppings {
    private Pizza pizza;

    public Pepperoni(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Add Topping Pepperoni, Price: Rp. 2.000 \n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 2000;
    }
}
