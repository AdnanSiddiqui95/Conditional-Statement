public class DiscountCalculate
{
	public static void main(String[] agrs)
	  {
		int totalamount =  3000;
		double discount=0;
		if(totalamount>=10000)
		{
		    discount=totalamount*20/100;
		}
		 else {
			if(totalamount>=7500 )
			{
		  	  discount=totalamount*15/100;
			}
		        else {
			if(totalamount>=5000 )
			{
		   	  discount=totalamount*10/100;
			}
			else {
			 if(totalamount>=2500 )
			{
		    	   discount=totalamount*5/100;
			}
		     }
		   }
	         }
		System.out.println("Total Discount is = "+discount);
	  }
}