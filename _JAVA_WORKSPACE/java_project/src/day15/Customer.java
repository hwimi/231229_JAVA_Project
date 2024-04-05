package day15;

public class Customer {
	
	//멤버변수 선언
	public int customerID;
	public String customerName;
	public String customerGrade;
	public int bonsPoint;
	public double bonsRatio;
	
	public Customer() {}
	
		
		public Customer(int customerID, String customerName) {
		
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade="Silver";
		bonsPoint=0;
		bonsRatio=0.01;
		
	}
		public Customer(int customerID,String customerName,String customerGrade, int bonsPoint,double bonsRatio) {
			this.customerID=customerID;
			this.customerName=customerName;
			this.bonsPoint=bonsPoint;
			this.bonsRatio=bonsRatio;
			}
		//가격을 메게변수로 받아 포인트 적립
		public int calcprice(int price) {
				
				bonsPoint+=(int)(price*bonsRatio);
				return price;
				//실버등급은 할인이없다
		}
		
			
	
		
	
	
		public void customerInfo() {
			System.out.println("고객ID:"+customerID+" "+"고객이름:"+customerName+" "+"고객등급:"+customerGrade+" "+"보너스포인트:"+bonsPoint+" "+"보너스비율:"+bonsRatio);
		}
		public int getCustomerID() {
			return customerID;
		}
		public void setCustomerID(int customerID) {
			this.customerID = customerID;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getCustomerGrade() {
			return customerGrade;
		}
		public void setCustomerGrade(String customerGrade) {
			this.customerGrade = customerGrade;
		}
		public int getBonsPoint() {
			return bonsPoint;
		}
		public void setBonsPoint(int bonsPoint) {
			this.bonsPoint = bonsPoint;
		}
		public double getBonsRatio() {
			return bonsRatio;
		}
		public void setBonsRatio(double bonsRatio) {
			this.bonsRatio = bonsRatio;
		}
	}
