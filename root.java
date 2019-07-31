package day2;

public class root {
int pass=43;
	public void rot(int r)
	{
		long accno=r;
		class react
		{
			public void display()
			{
				System.out.println(root.this.pass);
			}
			
		}
		System.out.println(accno);
		react re= new react();re.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
root r = new root();
r.rot(200);
	}

}
