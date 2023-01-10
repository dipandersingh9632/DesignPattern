import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    private static Flipkart flipkart;
    /* Creating a singleton class Not handling the multithreading part */
    public static Flipkart getInstance(){
        if(flipkart != null) return flipkart;
        flipkart = new Flipkart();
        return flipkart;
    }
    List<Subsriber> list = new ArrayList<>();
    public void register(Subsriber s){ list.add(s); }
    public void deRegister(Subsriber s){ list.remove(s); }

    public void orderPlaced(){
        for(Subsriber s: list){
            s.notification();
        }
    }


}
