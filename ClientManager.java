
import java.util.ArrayList;

public class ClientManager
{
    private ArrayList<Client> client = new ArrayList<Client>();
    private StandardClient standardClient;
    private LoyaltyClient loyaltyClient;
    private StaffClient staffClient;
    private static ClientManager instance = null;
    private float standaradTotalAmount = 0;
    private float standaradDiscountedAmount = 0;
    private float loyaltyTotalAmount = 0;
    private float loyaltyDiscountedAmount = 0;
    private float staffTotalAmount = 0;
    private float staffDiscountedAmount = 0;
    public static ClientManager getInstance()
    {
        if(instance == null)
        {
            instance = new ClientManager();
        }
        return instance;
    }
    
    private ClientManager()
    {
       standardClient = new StandardClient("Ivan", 100);
       client.add(standardClient);
       loyaltyClient = new LoyaltyClient("Zelda", 200);
       client.add(loyaltyClient);
       staffClient = new StaffClient("Annie", 300);
       client.add(staffClient);
    }
    
    public void checkId(int id)
    {
        int found  =0;
        for(int i =0;i<client.size();i++ )
        {
            if(client.get(i).getId() == id)
            {
                 header();
                displayClient(i);
                break;
            }
        }
        if(found == 0)
        {
            System.out.println("No id exists with this number");
        }
    }
    
    public void header()
    {
        System.out.println("Client ID\t\tName\t\tTotal Amount\t\tDiscounted Amount");
    }
    
    public void displayClient(int index)
    {
        System.out.println(client.get(index).getClientdata());
    }
    
    public void displayStandardClient()
    {
        header();
        for(int i = 0 ;i<client.size();i++)
        {
            if(client.get(i).getClientType().equalsIgnoreCase("Standarad Client"))
            {
                displayClient(i);
            }
        }
    }
    
    public void displayLoyaltyClient()
    {
        header();
        for(int i = 0 ;i<client.size();i++)
        {
            if(client.get(i).getClientType().equalsIgnoreCase("Loyalty Client"))
            {
                displayClient(i);
            }
        } 
    }
    
    public void displayStaffClient()
    {
        header();
        for(int i = 0 ;i<client.size();i++)
        {
            if(client.get(i).getClientType().equalsIgnoreCase("Staff Client"))
            {
                displayClient(i);
            }
        }
    } 
    
    
    public void addStandaradClient(String name,float amount)
    {
       standardClient = new StandardClient(name, amount);
       client.add(standardClient);
       System.out.println("--Processing Standard Payment--\n" +"...\n" +" ...\n" +" Finished processing payment.");
    }
    
    public void addLoyaltyClient(String name,float amount)
    {
        loyaltyClient = new LoyaltyClient(name, amount);
        client.add(loyaltyClient);
        System.out.println("--Processing Loyalty Payment--\n" +"...\n" +" ...\n" +" Finished processing payment.");
    }
    
    public void addStaffClient(String name,float amount)
    {
        staffClient = new StaffClient(name, amount);
        client.add(staffClient);
    }
    
    
    public void DisplayAllClient()
    {
        header();
        System.out.println("Standarad Clients:");
        for(int i = 0 ;i<client.size();i++)
        {
            if(client.get(i).getClientType().equalsIgnoreCase("Standarad Client"))
            {
                displayClient(i);
            }
        }
        System.out.println("Loyalty Clients:");
        for(int i = 0 ;i<client.size();i++)
        {
            if(client.get(i).getClientType().equalsIgnoreCase("Loyalty Client"))
            {
                displayClient(i);
            }
        }
        System.out.println("Staff Clients:");
        for(int i = 0 ;i<client.size();i++)
        {
            if(client.get(i).getClientType().equalsIgnoreCase("Staff Client"))
            {
                displayClient(i);
            }
        }
    }
    
    public void generateReport()
    {
        for(int i = 0 ;i<client.size();i++)
        {
            if(client.get(i).getClientType().equalsIgnoreCase("Standarad Client"))
            {
                standaradTotalAmount = standaradTotalAmount + client.get(i).getAmount();
                standaradDiscountedAmount = standaradDiscountedAmount+client.get(i).getDiscountedPrice();
            }
        }
        for(int i = 0 ;i<client.size();i++)
        {
            if(client.get(i).getClientType().equalsIgnoreCase("Loyalty Client"))
            {
                loyaltyTotalAmount = loyaltyTotalAmount + client.get(i).getAmount();
                loyaltyDiscountedAmount = loyaltyDiscountedAmount +client.get(i).getDiscountedPrice();
            }
        }
        for(int i = 0 ;i<client.size();i++)
        {
            if(client.get(i).getClientType().equalsIgnoreCase("Staff Client"))
            {
                staffTotalAmount = staffTotalAmount + client.get(i).getAmount();
                staffDiscountedAmount = staffDiscountedAmount+client.get(i).getDiscountedPrice();
            }
        }
        float totalAmount = standaradTotalAmount+loyaltyTotalAmount+staffTotalAmount;
        float discountedPrice = standaradDiscountedAmount+loyaltyDiscountedAmount+staffDiscountedAmount;
        System.out.println("--Report to View Payments Received--");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Type of Account\t\tTotal Amount Received\tDiscounts Given");
        System.out.println("Standard\t\t"+standaradTotalAmount+"\t\t\t"+standaradDiscountedAmount);
        System.out.println("Loyalty\t\t\t"+loyaltyTotalAmount+"\t\t\t"+loyaltyDiscountedAmount);
        System.out.println("Staff\t\t\t"+staffTotalAmount+"\t\t\t"+staffDiscountedAmount);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Total\t\t\t"+totalAmount+"\t\t\t"+discountedPrice);
        System.out.println("----------------------------------------------------------------");
                
    }
    
}
