public class Mushroom extends Toppings{
    private Pizza pizza;

    public Mushroom(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Add Topping Mushroom, Price: Rp. 3.000 \n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 3000;
    }
}
