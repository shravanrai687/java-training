package day2;

public class four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new merchant().gets();
new merchant().get(2);
	}

}
class merchant
{
	int[]price= {1200,2300,330,00033};
	public void get(int index)
	{
		System.out.println(price[index]);
	}
	public void gets()
	{
		for(int k:price) 
		{System.out.println(k);
		
		}
	}
}