package day2;

public class manage1 implements Operate {

	freelancer[] base = new freelancer[5];static int pos;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
employee f=new freelancer("Razak","java",1,1000);
freelancer b=new freelancer("Ram","javascript",3,7000); 
freelancer t=new freelancer("Razak","java",9,89000);
freelancer m = new freelancer("manyak","python",2,5000);
manage man=new manage();
man.insert(f);man.insert(b);
man.insert(t);man.insert(m);
pos=0;man.search("python");
	}
	public void insert(freelancer free)
	{
		for(int index=0;index<base.length;index++)
		{
			if(base[index]==null)
			{
				base[index]=free;
				System.out.println(free.getName()+"lancer added");break;}
			}
		}
	public void search(String tech)
	{
		if(pos>=base.length-1)
		{
			return;
		}
		else
		{
			if(base[pos].getSkill().equalsIgnoreCase(tech))
			{
				System.out.println(base[pos]);
			}
			pos++;
		}search(tech);
	}

}
