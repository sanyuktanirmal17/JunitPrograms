
	
	import java.text.DecimalFormat;
	import java.util.Scanner;

	public class Sqrt 
	{
	   public static void main(String[] args) 
	   {
		  Scanner sc = new Scanner(System.in);
		  boolean flag=true;
	      String input;//make the stake input validate format
	      System.out.println("Enter..!,a Non-negative Number");
		  input=sc.next();
		  while(flag)
		  {
			 if(Utility.isNumber(input)) 
			 {
				flag=false;
			 }else 
			 {
				System.out.println("Enter the correct Stake amount:");
				input=sc.next();
			 }
		  }
	      int stake=Integer.parseInt(input);
		  double no;
		  double sqrtVal;
		  
		  do 
		  {
			System.out.println("Enter..!,a Non-negative Number... ");
			no=sc.nextDouble();
		  }while(no<0);
		  
		  sqrtVal = Utility.sqrt(no);
		  DecimalFormat df = new DecimalFormat(".###");
		  System.out.println("square root of "+no+" : "+df.format(sqrtVal));
		  sc.close();
	   }
	}

}
