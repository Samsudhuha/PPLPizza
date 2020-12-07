public class Olive extends Toppings{
    private Pizza pizza;

    public Olive(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Add Topping Olive, Price: Rp. 4.000 \n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 4000;
    }
}