package Practice_2018;

//1. Multiple inheritance achieved by implementing more than one interface by one class

public class SBIBank implements USBCBank, BrazilBank{
	
	//2. Method overriding achieve by defining the same method name 
	
   public void credit()
   {
	   System.out.println("CREDIT Provided by SBI Bank to USBC Customers");
   }
	
	public void debit()
	{
		System.out.println("DEBIT Provided by SBI Bank to USBC Customers");
		
	}
	
	public void transfermoney()
	{
		System.out.println("TRANSFERMONEY Provided by SBI Bank to USBC Customers");
	}
	
	public void homeloan()
	{
		System.out.println("HOMELOAN Provided by SBI Bank to BrazilBank Customers");
	}

	public void eduloan()
	{
		System.out.println("eduloan Provided by SBI Bank to own Customers");
	}
	
}
