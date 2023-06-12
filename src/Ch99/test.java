package Ch99;

import Ch99.Buyer;
import Ch99.Seller;

class Seller{
	private int MyMoney;
	private int KmichiCnt;
	public int Price;
	
	public Seller(int myMoney, int kmichiCnt, int price) {
		MyMoney = myMoney;
		KmichiCnt = kmichiCnt;
		Price = price;
	}
	public int Receive(int money) {
		MyMoney+=money;
		int revcnt=money/Price;
		KmichiCnt-=revcnt;
		return revcnt;
	}
	public void ShowInfo() {
		System.out.println("-----판매자정보-----");
		System.out.println("보유 금액 : " + MyMoney);
		System.out.println("김치 개수 : " + KmichiCnt);
		System.out.println("개당 가격 : " + Price);

	}
	
}

class Buyer{
	private int MyMoney;
	private int KmichiCnt;
	
	public Buyer(int myMoney, int kmichiCnt) {
		MyMoney = myMoney;
		KmichiCnt = kmichiCnt;
	}
	
	public void Payment(Seller seller,int money) 
	{
		MyMoney = money;
		int cnt= seller.Receive(money);
		KmichiCnt+=cnt;
		
	}
	public void ShowInfo() {

		System.out.println("보유 금액 : " + MyMoney);
		System.out.println("김치 개수 : " + KmichiCnt);
	}
	
}



public class test {

	public static void main(String[] args) {
		Seller 김치장수1 = new Seller(100000,100,1000);
		Buyer 강민경 = new Buyer(10000,0);	
		Buyer 신민아 = new Buyer(20000,0);	
		Buyer 박보영 = new Buyer(30000,0);	
		Buyer 서현진 = new Buyer(40000,0);	
		강민경.Payment(김치장수1,2000);
		신민아.Payment(김치장수1,4000);
		박보영.Payment(김치장수1,6000);
		서현진.Payment(김치장수1,10000);
		김치장수1.ShowInfo();
		System.out.println("");
		System.out.println("-----구매자정보-----");
		System.out.println("--강민경 김치 정보--");
		강민경.ShowInfo();
		System.out.println("--신민아 김치 정보--");
		신민아.ShowInfo();
		System.out.println("--박보영 김치 정보--");
		박보영.ShowInfo();
		System.out.println("--서현진 김치 정보--");
		서현진.ShowInfo();
		

	}

}
