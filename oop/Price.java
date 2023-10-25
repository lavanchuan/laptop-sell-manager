import java.util.ArrayList;
import java.util.List;

public class Price{
    private float inPrice;
    private List<float> outPrice;

    public Price(float inPrice){
        this.inPrice = inPrice;
        outPrice = new ArrayList<>();
    }

    public void addAndSetOutPrice(float currentOut){
        outPrice.add(currentOut);
    }

    public float getInPrice(){return this.inPrice;}
    
    public float getCurrentPrice(){return outPrice.get(outPrice.size());}

    public List<float> getOutPrice(){return this.outPrice;}
}