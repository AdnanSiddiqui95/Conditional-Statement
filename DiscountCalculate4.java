import java.util.Scanner;
public class DiscountCalculate4
{
	public static void main(String[] agrs)
	  {
		// commond to create object from Scanner class
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the totalamount= ");

		int totalamount=sc.nextInt();
		//variable totalamount of int type will be created
		//nextInt() of scanner class will be called
		// value returned by nextInt() will be assigned to the variable totalamount by = operator

		if(totalamount<2500)
		{
		  System.out.println("Sorry!!! you are not eligible for any discount");
		}
		else
		{
		double discount=0;
		if(totalamount>=10000)
		    discount=totalamount*20/100;
		 else  if(totalamount>=7500 )
		  	  discount=totalamount*15/100;
		 else  if(totalamount>=5000 )
		   	  discount=totalamount*10/100;
		 else  if(totalamount>=2500 )
		    	   discount=totalamount*5/100;
		System.out.println("Total Discount is = "+discount);
		double payable=totalamount-discount;
		System.out.println("Total Payable amout is=" +payable);

	}
	  }
}