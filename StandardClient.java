public class StandardClient extends Client
{
    private float discountedAmount;
    private float discount;

    public StandardClient(String clientName,float amount)
    {
        super(clientName, "Standarad Client",amount);
        discount = 0;
        discountedAmount = 0;
    }
  
    @Override
    public float getDiscountedPrice() 
    {
        return discountedAmount;
    }
    
}
