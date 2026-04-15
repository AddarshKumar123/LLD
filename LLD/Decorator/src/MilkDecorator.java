public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee){
        super(coffee);
    }
    @Override
    public String getDescription() {
        return coffee.getDescription()+" ,Milk added";
    }

    @Override
    public double cost() {
        return coffee.cost()+20;
    }
}
