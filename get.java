package day2;
import java.util.io.*;
public class get {
public static void bubble(String take) {
byte[] got=take.getBytes();
int pos=0,com=0;
while(pos<got.length-1)
{
	com=0;
	while(com<got.length-pos-1)
	{
		if(got[com]>got[com+1])
		{
			got[com]^=got[com+1];got[com+1]^=got[com];got[com]^=got[com+1];}
		com++;
		
		}
	pos++;
	}System.out.println(new String(got));
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] orgs= {"birlasoft","ZOHO","Cognizant","infosys","amazon"};
get.sort(orgs);
for(String yet:orgs) {System.out.println(yet);}
String desired="Datascience";
get.biubble(desired);
System.out.println("Mmain reamins"+desired);
	}

}
