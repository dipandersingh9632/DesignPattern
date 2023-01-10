public class ChocolateCone implements IceCreamConeConstituent{

    IceCreamConeConstituent iceCreamConeConstituent = null;

    public ChocolateCone(){};

    public ChocolateCone(IceCreamConeConstituent iceCreamConeConstituent){
        this.iceCreamConeConstituent = iceCreamConeConstituent;
    }
    @Override
    public int getCost() {
        if(this.iceCreamConeConstituent == null) return 30;
        else return this.iceCreamConeConstituent.getCost() + 30;
    }

    @Override
    public String getDescription() {
        if(iceCreamConeConstituent == null) return "Chocolate Cone";
        else return this.iceCreamConeConstituent.getDescription() + " Chocolate Cone";
    }
}
