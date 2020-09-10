public class LoyaltyClient extends Client
{
    private float discountedAmount;
    private float discount;

    public LoyaltyClient(String clientName, float amount) 
    {
        super(clientName, "Loyalty Client", amount);
        discount = (float) 0.1;
        discountedAmount =  discount*amount;
    }

    
    @Override
    public float getDiscountedPrice()
    {
        return discountedAmount;
    }
    
    
    
}
