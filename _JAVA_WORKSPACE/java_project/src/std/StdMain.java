package std;


import java.util.Scanner;


//2
public class StdMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StdManger sm=new StdManger();
		int meun=0;
		
		do {
			System.out.println("meun");
			System.out.println("1.학생추가|2.학생리스트|3.학생검색|4.학생수정|5.학생삭제|6.점수추가|7.점수수정|8.점수삭제|9.종료");
			System.out.println(">>meun>>");
			meun=sc.nextInt();
			switch(meun) {
			case 1:
				sm.addStd(sc);
				break;
			case 2:
				sm.printStd();
				break;
			case 3:
				sm.searchStd(sc);
				break;
			case 4:
				sm.modStd(sc);
				break;
			case 5:
				sm.delStd(sc);
				break;
			case 6:
				sm.addSub(sc);
				break;
			case 7:
				sm.modSub(sc);
				break;
			case 8:
				sm.delSub(sc);
				break;
			case 9:
				break;
			default:
				System.out.println("잘못된 메뉴입니다");
				break;
				
			
			}
			
			
		}while(meun!=9);{
			System.out.println("종료");
			
		}
			
		
		sc.close();
		
		

	}

}
