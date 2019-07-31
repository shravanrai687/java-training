package day2;


public class oop {
	String org;double pack;
	static int count=12;
	public String tostring()
	{
		return org+""+pack+""+count+"\n";
	}
	static class magno
	{
		String tech;
		public void detail()
		{
			System.out.println(tech);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		
			
		oop s=new oop();
		s.org="wipro";s.pack=6.0;//s.count=0;
		oop t=new oop();
		t.org="infosys";t.pack=10.0;//t.count=1;
		System.out.println(s+"\n"+t);
		
		
		magno e =new magno();
		e.tech="shr";
		e.detail();
	}
	

		
	}


