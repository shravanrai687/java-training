package day2;
import java.util.Scanner;
public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
		String model="",year="",amount="";
		float EMI;
			System.out.println("please mention model");
			model = in.nextLine();
			System.out.println("please mention year");
			year = in.nextLine();
			
			
			switch(model)
			{
			case "ENFIELD":System.out.println("there are 2 bikes with 10k difference");
			                break;
			case "R15":System.out.println("ttwo owners price is 80000");
			                break;
			case "splendor":System.out.println("three owners of 20k");
		
				System.out.println("there are two models");
				String mod="2016",mod2="2017";
				System.out.println("ur option");
				int c =in.nextInt();
				switch(c)
				{
				case 2016 :int totalamount=70000;
					          System.out.println("total amount is "+totalamount);
					          System.out.println("do u need EMI ");
					            int ch=in.nextInt();
					          switch(ch)
					        {
					        case 1: 
					                   EMI=((totalamount/36)+((totalamount*10)/3600));
					                   System.out.println("urr emi will be"+EMI);
					                   break;
					        case 0: System.out.println("we hope we contact soon");
					}
				}
			                break;
			//case "m80":System.out.println("three owners of 5k");
			}


}
	}


