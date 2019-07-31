package day2;
import java.util.Scanner;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner in= new Scanner(System.in);
	//int c='e';
		//System.out.println(c);
char setone='A',settwo='c';int row=4,space=1,letters=0;
while(row>=1)
{
	space=1;
	while(space<row)
	{
		System.out.print(" ");space++;
		if(row<3){
			settwo+=row;}
		else
		{
			setone+=row;
		}
		}
	letters=4;
	while(letters>=row)
	
	{
		if(row<3)
		{
			System.out.print(settwo);settwo+=row;
		}
		else
		{
			System.out.print(setone);setone+=row;}
		letters--;
		}
	System.out.println();
	row--;
	}
}
	}


