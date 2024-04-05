package day15;

public class VipCoustomer extends Customer {
	public double saleratio;
	public int agentid;
	
	public VipCoustomer() {}
	public VipCoustomer(int id ,String name) {
		super(id,name);
		customerGrade="VIP";
		bonsRatio=0.05;
		saleratio=0.01;
		agentid=agentid;
	}
	@Override
	public int calcprice(int price) {
		return bonsPoint=bonsPoint+(int)(price*bonsRatio);
		
	}
	@Override
	public void customerInfo() {
		System.out.println("담당상담사으의 번호는");
	}
	public double getSaleratio() {
		return saleratio;
	}
	public void setSaleratio(double saleratio) {
		this.saleratio = saleratio;
	}
	public int getAgentid() {
		return agentid;
	}
	public void setAgentid(int agentid) {
		this.agentid = agentid;
	}
	
	

}
