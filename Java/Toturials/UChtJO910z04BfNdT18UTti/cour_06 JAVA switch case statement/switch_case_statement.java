public class switch_case_statement
{
	public static void main(String[] args) 
	{
    int x = 0;
    
    switch (x) 
    {
        case 1 :
            System.out.println("one");
            break;
        case 2 :
            System.out.println("two");
            break;
        case 3 :
            System.out.println("three");
            break;
        case 4 :
            System.out.println("four");
        default :
            System.out.println("x is different");
            break;
    }
    //x is different
    }
}