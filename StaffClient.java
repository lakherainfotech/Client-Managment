public class StaffClient extends Client
{
    private float discountedAmount;
    private float discount;

    public StaffClient(String clientName, float amount)
    {
        super(clientName, "Staff Client", amount);
        discount = (float) 0.2;
        discountedAmount = discount*amount;
    }

    
    @Override
    public float getDiscountedPrice()
    {
        return discountedAmount;
    }
    
}
