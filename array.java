package day2;
import java.util.Scanner;
public class array {
static Scanner scan=new Scanner(System.in);
static int ind;
public static void add(int[]week)
{
	
	int index=0;
	while(index<week.length) {
		System.out.println("enter the milage ");
		week[index]=scan.nextInt();index++;
		
	}
}
public static void traverse(int[] kitkat)
{
	if(ind>=kitkat.length) {
		return;
	}
	else if(kitkat[ind]>30&&kitkat[ind]<=50)
	{
		kitkat[ind]=25;
	}
	else
	
	{
		System.out.println(kitkat[ind]);ind++;}traverse(kitkat);
	
}
/*public static void assign(int [] milage)
{
	int i=0;
	while((i<milage.length)&&(milage[i]>=30&&milage[i]<50))
	{
		milage[i]=25;
		i++;
	}
}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]  milage=new int[15];
		array.add(milage);
		array.ind=0;
		array.traverse(milage);
		//array.assign(milage);
		//System.out.println(milage);
	}

}
