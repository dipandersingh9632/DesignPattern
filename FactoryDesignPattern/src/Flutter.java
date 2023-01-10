public class Flutter {
    /* Now here we will have generic methods and the 1 method to create UIFactory */
    public void setTheme(){
        System.out.println("New Theme Updated");
    }

    public void setRefreshRate(int rate){
        System.out.println("New Refresh rate set" + rate);
    }

    public UIFactory createUIFactory(String platform){
        /* Now here I know I am breaking open close principle
        if(platform.equals("Android")) return new AndroidUIFactory();
        else if(platform.equals("iOS")) return new IosUIFactory();
        else return null; */

        // Preactical Factory
        return UIPracticalFactory.getFactoryByPlatform(platform);
    }
}
