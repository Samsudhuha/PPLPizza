public class Ham extends Toppings{
    private Pizza pizza;

    public Ham(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Add Topping Ham, Price: Rp. 5.000 \n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 5000;
    }
}