public class if_statement
{
	public static void main(String[] args) {
       if(20 > 10)
       {
            System.out.println("20 est superieur a 10");    
       }
       //20 est superieur a 10
       
       int x,y;
       x = 15;y = 45;
       if(y > x)
       {
           System.out.println("y est superieur a x");
       }
       //y est superieur a x 
       
        if(y < 10)
        {
            System.out.println("y est inferieur a 10");
        }
        else if(y == 10)
        {
            System.out.println("y egale a 10");
        }
        else {
            System.out.println("y est superieur a 10");
        }
        //y est superieur a 10 
	}
}