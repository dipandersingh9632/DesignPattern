public class Main {
    public static void main(String[] args) {
        IceCreamConeConstituent iceCream = new ChocoChips(
                                                new StrawberryScoop(
                                                        new VanillaScoop(
                                                                new ChocolateCone()
                                                        )
                                                )
        );
        System.out.println(iceCream.getDescription());
        System.out.println(iceCream.getCost());
    }
}