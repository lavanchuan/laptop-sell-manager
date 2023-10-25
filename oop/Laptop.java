public abstract class Laptop{
    protected String ltName;
    protected Price ltPrice;
    protected LaptopSpecification ltSpecifitic;
    protected String ltImgSrc;

    public Laptop(String ltName, Price ltPrice, LaptopSpecification ltSpecifitic, String ltImgSrc){
        this.ltName = ltName;
        this.ltPrice = ltPrice;
        this.ltSpecifitic = ltSpecifitic;
        this.ltImgSrc = ltImgSrc;
    }

    public abstract enterInfo();

    public static void compareLaptops(Laptop... laptops){
        // command
    }
    
    public void updatePrice(float newPrice){
        ltPrice.addAndSetOutPrice(newPrice);
    }
}