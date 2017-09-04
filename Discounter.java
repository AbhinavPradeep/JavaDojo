class Discounter
{
    public static void main(String[] args)
    {
        String item = "Bayblade";
        int price = 90;
        double discount = 0.2; 
        double discounted_price; 
        
        discounted_price = price - (price * discount) ;
        System.out.println(" discounted price is " + discounted_price);
    }
}