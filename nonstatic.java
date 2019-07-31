package day2;

public class nonstatic {
	String product;float monitorsize;
	class enquiry

	{
		int price;
		public void show()
		{
			System.out.println(product+""+monitorsize+""+price);
		}
		public  void greetings()
		{
				System.out.println(product+"are going to display");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
nonstatic ns= new nonstatic();
enquiry e=ns.new enquiry();
ns.product="sony";ns.monitorsize=21;e.price=20000;
e.show();
e.greetings();
	}

}
