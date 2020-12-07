public class Tuna extends Toppings{
    private Pizza pizza;

    public Tuna(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Add Topping Tuna, Price: Rp. 4.000 \n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 4000;
    }
}