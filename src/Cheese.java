public class Cheese extends Toppings{
    private Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Add Topping Cheese, Price: Rp. 1.000 \n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 1000;
    }
}
