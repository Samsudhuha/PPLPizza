public class Bacon extends Toppings{
    private Pizza pizza;

    public Bacon(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription(){
        return pizza.getDescription() + "Add Topping Bacon, Price: Rp. 5.000 \n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 5000;
    }
}
