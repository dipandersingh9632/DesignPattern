public class OrangeCone implements  IceCreamConeConstituent{
    IceCreamConeConstituent iceCreamConeConstituent;

    public OrangeCone(){};

    public OrangeCone(IceCreamConeConstituent iceCreamConeConstituent){
        this.iceCreamConeConstituent = iceCreamConeConstituent;
    }
    @Override
    public int getCost() {
        if(this.iceCreamConeConstituent == null) return 20;
        else return this.iceCreamConeConstituent.getCost() + 20;
    }

    @Override
    public String getDescription() {
        if(iceCreamConeConstituent == null) return "Orange Cone";
        else return this.iceCreamConeConstituent.getDescription() + " Orange Cone";
    }
}
