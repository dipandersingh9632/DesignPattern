public class StrawberryScoop implements IceCreamConeConstituent{
    IceCreamConeConstituent iceCreamConeConstituent;

    public StrawberryScoop(IceCreamConeConstituent iceCreamConeConstituent){
        this.iceCreamConeConstituent = iceCreamConeConstituent;
    }
    @Override
    public int getCost() {
        return (this.iceCreamConeConstituent.getCost() + 40);
    }

    @Override
    public String getDescription() {
        return (this.iceCreamConeConstituent.getDescription() + " StrawberryScoop ");
    }
}
