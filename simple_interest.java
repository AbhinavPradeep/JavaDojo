public class simple_interest
{
    public static void main(String[] args)
    {
        double roi = 0.6;
        int pa = 1000299, t = 4;
        double si = pa * t * roi ;
        System.out.println("sir , your simple interest is "+ si);
        double m = pa + si;
        System.out.println(" and your maturity amount is "+ m);
    }
}