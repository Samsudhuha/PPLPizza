public class Peppers extends Toppings{
    private Pizza pizza;

    public Peppers(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Add Topping Peppers, Price: Rp. 2.000 \n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 2000;
    }
}
