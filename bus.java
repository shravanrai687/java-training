package day2;
import java.util.Scanner;
public class bus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int count1,count2,count3,count4;
		//int amt,tamt,ch;
		Scanner in= new Scanner(System.in);


		/*System.out.println("bus 1=700\nbus 2=500,bus 3=800,bus4=450");
		for(int i=0;i<4;i++)
		{
			System.out.println("enter th e amount");
			amt=in.nextInt();
			if(i==0 && amt>=700)
			{
				for(i=0;i<7;i++)
				{
					System.out.println("ur seat is booked");
					tamt=tamt+700;
				}
			}
			else
			{
				System.out.println("no seats are available")
			}
			if()	
		}*/
		int bus=0,busfare=0,seats=0,passenger=0,buscollect=0,total=0;
		bus=1;
		while(bus<=4)
		{
			System.out.println("set the fare amaount for bus:"+bus);
			busfare=in.nextInt();
			seats=1;buscollect=0;
			while(seats<=7)
			{
				System.out.println("enter the amount");
				passenger=in.nextInt();
				if(passenger>=busfare)
				{
					System.out.println("you can travel");
					buscollect+=busfare;
				}
				else
				{
						System.out.println("you cannot travel");
						seats++;
				}
					System.out.println("collection from bus"+bus+"is"+buscollect);
					total+=buscollect;bus++;
			}
			System.out.println("total collection for corporation"+total);
			in.close();
		}
	}

}
