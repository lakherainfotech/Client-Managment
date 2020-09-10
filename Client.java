public abstract class Client 
{
    private int id;
    private String clientName;
    private String clientType;
    private static int nextId = 1;
    private float amount;
    
    public Client(String clientName, String clientType, float amount)
    {
        this.clientName = clientName;
        this.clientType = clientType;
        this.amount = amount;
        id = nextId;
        nextId ++;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getClientName()
    {
        return clientName;
    }

    public void setClientName(String clientName)
    {
        this.clientName = clientName;
    }

    public String getClientType() 
    {
        return clientType;
    }

    public void setClientType(String clientType)
    {
        this.clientType = clientType;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    
    
    abstract public float getDiscountedPrice();
    
    public float gettotalAmount()
    {
        float total = amount - getDiscountedPrice();
        return total;
    }
    
    
     public String getClientdata()
     {
         String data = id+"\t\t\t"+clientName+"\t\t\t"+gettotalAmount()+"\t\t\t"+getDiscountedPrice();
         return data;
     }
}
