public class Tomatoe extends Toppings{
    private Pizza pizza;

    public Tomatoe(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Add Topping Tomatoe, Price: Rp. 1.000 \n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 1000;
    }
}