public class VanillaScoop implements IceCreamConeConstituent{
    IceCreamConeConstituent iceCreamConeConstituent;

    public VanillaScoop(IceCreamConeConstituent iceCreamConeConstituent){
        this.iceCreamConeConstituent = iceCreamConeConstituent;
    }
    @Override
    public int getCost() {
        return (this.iceCreamConeConstituent.getCost() + 30);
    }

    @Override
    public String getDescription() {
        return (this.iceCreamConeConstituent.getDescription() + " VanillaScoop ");
    }
}
