package day2;

public class employee {
	private String companyname,skill,requirement;
	private Float pay;
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getRequirement() {
		return requirement;
	}
	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}
	public Float getPay() {
		return pay;
	}
	public void setPay(Float pay) {
		this.pay = pay;
	}
	employee()
	{
		
	}
	
	employee(String companyname,String skill,String requirement,Float pay)
	{
		companyname=companyname;
		skill=skill;
		requirement=requirement;
		pay=pay;
	}
	
}
