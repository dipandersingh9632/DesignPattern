public class ChocoChips implements IceCreamConeConstituent{
    IceCreamConeConstituent iceCreamConeConstituent;

    public ChocoChips(IceCreamConeConstituent iceCreamConeConstituent){
        this.iceCreamConeConstituent = iceCreamConeConstituent;
    }
    @Override
    public int getCost() {
        return (this.iceCreamConeConstituent.getCost() + 15);
    }

    @Override
    public String getDescription() {
        return (this.iceCreamConeConstituent.getDescription() + " ChocoChips ");
    }
}
