package Practice_2018;

public class InterfaceandMultiInheritance {

	public static void main(String[] args) {
		
		System.out.println("access the static varable by its interfacename ---  " + USBCBank.min_balance);
		System.out.println("access the static varable by its interfacename ---  " + BrazilBank.customerid + "\n");
	
		
		// the value of interface variable can not be change it is bydefault final
		
		/* USBCBank.min_balance = 300; */
		
		SBIBank obj = new SBIBank();  // compile time polymorphism
		
		obj.credit();
		obj.debit();
		obj.eduloan();
		obj.homeloan();
		obj.transfermoney();
		System.out.println(obj.customerid);
		System.out.println(obj.min_balance);
		
		System.out.println("\n***************************************");
		
		
		USBCBank cust = new SBIBank();  // run-time polymorphism child class boject referred by parent interface refrence variable
		cust.credit();
		cust.debit();
		cust.transfermoney();
		System.out.println(cust.min_balance);
		
		System.out.println("\n********************************************");
		
		BrazilBank cust2 = new SBIBank(); // run-time polymorphism child class boject referred by parent interface refrence variable
		cust2.homeloan();
		System.out.println(cust2.customerid);
	}

}
