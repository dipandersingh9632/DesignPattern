public class UIPracticalFactory {
    public static UIFactory getFactoryByPlatform(String platform){
        if(platform.equals("Android")) return new AndroidUIFactory();
        else if(platform.equals("iOS")) return new IosUIFactory();
        else return null;
    }
}
