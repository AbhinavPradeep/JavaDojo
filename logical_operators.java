 class logical_operators
 {
     public static void main (String[]args )
     {
         int a ;
         int b ;
         int c ;
         int d ;
         
         int a = 43;
         int b = 24;
         int c = 765;
         int d = 6;
         
         System.out.println(a < b && d < c);
         System.out.println(a > c && b > d);
         System.out.println(a == d && b == c);
         System.out.println(a != c || b < d);
         System.out.println(a < d || b < c);
         System.out.println( !(d < c));
         System.out.println( !(b < d));
         System.out.println( !(b < c));
     }
 }