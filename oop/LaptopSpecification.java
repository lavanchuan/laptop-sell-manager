public class LaptopSpecification{
    protected String memory;
    protected String hardDrive;
    protected String screenSize;
    protected String cpu;
    protected String card;
    protected String pin;
    protected float mass;

    public LaptopSpecification(String memory, String hardDrive, String screenSize, String cpu, 
        String card, String pin, float mass){
        this.memory = memory;
        this.hardDrive = hardDrive;
        this.screenSize = screenSize;
        this.cpu = cpu;
        this.card = card;
        this.pin = pin;
        this.mass = mass;
    }
}