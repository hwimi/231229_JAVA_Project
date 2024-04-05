package day15;

public class GoldCustomer extends Customer {
	//gold와 vip만 할인율이 존재한다.
	
	public double saleratio;
	public GoldCustomer() {}
	public GoldCustomer(int  id, String name) {
		super(id, name);//생성자 그대로 받아오는건
		
		customerGrade="Gold";
		bonsPoint=0;
		bonsRatio=0.02;
		saleratio=0.01;
		
				

		
			
		}
	@Override
	public int calcprice(int price) {
		return super.calcprice(price);
	
		
	
	}
	@Override
	public void customerInfo() {
		// TODO Auto-generated method stub
		super.customerInfo();
	}
	public double getSaleratio() {
		return saleratio;
	}
	public void setSaleratio(double saleratio) {
		this.saleratio = saleratio;
	}
	
	
		
		
	}
		
	


