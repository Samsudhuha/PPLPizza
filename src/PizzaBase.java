public class PizzaBase implements Pizza {
    @Override
    public String  getDescription(){
        return "Pizza Base, Price = Rp. 5.000 \n";
    }
    public int getPrice(){
        return 5000;
    }
}
