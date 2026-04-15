public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee){
        super(coffee);
    }
    @Override
    public String getDescription() {
        return coffee.getDescription()+" ,added sugar";
    }

    @Override
    public double cost() {
        return coffee.cost()+10;
    }
}
