public class OrderCheck
{
    public static void main(String[] args)
    {
        int bolts = 12;
        int nuts = 8;
        int washers = 24;
        int cpb = 5;
        int cpn = 3;
        int cpw = 1;
        int totalprice = ((bolts*cpb)+(nuts*cpn)+(washers*cpw));
        System.out.println("The Total price is " + totalprice + " cents.");
    }
}