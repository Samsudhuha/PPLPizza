public class Pineapple extends Toppings{
    private Pizza pizza;

    public Pineapple(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Add Topping Pineapple, Price: Rp. 2.000 \n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 2000;
    }
}
