class arithmetic_operators
{
    public static void main (String[] args)
    {
        int num1;
        int num2;
        int addresult, subresult, mulresult,modresult;
        double divresult;                           
        
        num1 = 756;
        num2 = 321;
        
        addresult = num1 + num2;
        mulresult = num1 * num2;
        subresult = num1 - num2;
        divresult = num1 / num2;
        modresult = num1 % num2;
        
        System.out.println("sum of " + num1 + " and " + num2 + " is " + addresult);
        System.out.println("product of " + num1 + " and " + num2 + " is " + mulresult);
        System.out.println("quotient of " + num1 + " and " + num2 + " is " + divresult);
        System.out.println("difference of " + num1 + " and " + num2 + " is " + subresult);
        System.out.println("modulo of " + num1 + " and " + num2 + " is " + modresult);
    }
}